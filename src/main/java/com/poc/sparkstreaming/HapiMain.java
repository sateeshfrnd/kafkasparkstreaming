package com.poc.sparkstreaming;
//package kafkasparkstreaming;
//
//import java.io.FileInputStream;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Properties;
//import java.util.Set;
//
//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.fs.FileSystem;
//import org.apache.hadoop.security.UserGroupInformation;
//import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.apache.kafka.common.TopicPartition;
//import org.apache.log4j.Logger;
//import org.apache.spark.SparkConf;
//import org.apache.spark.sql.SQLContext;
//import org.apache.spark.storage.StorageLevel;
//import org.apache.spark.streaming.Durations;
//import org.apache.spark.streaming.api.java.JavaDStream;
//import org.apache.spark.streaming.api.java.JavaInputDStream;
//import org.apache.spark.streaming.api.java.JavaPairInputDStream;
//import org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream;
//import org.apache.spark.streaming.api.java.JavaStreamingContext;
//import org.apache.spark.streaming.api.java.JavaStreamingContextFactory;
//import org.apache.spark.streaming.kafka.KafkaUtils;
//import org.apache.spark.streaming.kafka.OffsetRange;
//
//import com.ihg.spark.processors.HdfsMsgProcessor;
//import com.ihg.spark.processors.KafkaMsgProcessor;
//import com.ihg.spark.sources.KafkaSourceConfig;
//import com.ihg.spark.stores.HdfsStoreConfig;
//
//import kafka.common.TopicAndPartition;
//import kafka.serializer.StringDecoder;
//
///**
//*
//* @author miryals
//*/
//public class HapiMain implements java.io.Serializable {
//
//private static final Logger LOG = Logger.getLogger(HapiMain.class);
//
//private String configFile;
//protected Properties configProps;
//
//public String getConfigFile() {
//	return configFile;
//}
//
//public HapiMain(String configFile) {
//	this.configFile = configFile;
//	try {
//		LOG.info("Reading properties file:" + configFile);
//		FileInputStream fis = new FileInputStream(configFile);
//		configProps = new Properties();
//		configProps.load(fis);
//	} catch (Exception ex) {
//		LOG.error("Caught exception loading the " + configFile + " properties file :" + ex.getMessage(), ex);
//	}
//}
//
//private FileSystem prepareFileHandler(HdfsStoreConfig hdfsStrConfig) {
//	try {
//		Configuration conf = new Configuration();
//		conf.set("fs.defaultFS", hdfsStrConfig.getUrl());
//		conf.set("hadoop.security.authentication", "kerberos");
//		UserGroupInformation.setConfiguration(conf);
//		UserGroupInformation ugi = UserGroupInformation
//				.loginUserFromKeytabAndReturnUGI(hdfsStrConfig.getKeyPrincipal(), hdfsStrConfig.getKeyTabFile());
//		FileSystem outFs = FileSystem.get(conf);
//		LOG.info("prepareFileHandler::UGI:" + ugi + ",\n FS:" + outFs + ",\n Conf:" + conf);
//		return outFs;
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	return null;
//}
//
//public void buildAndSubmit() throws Exception {
//	LOG.info("buildAndSubmit");
//
//	LOG.info("buildAndSubmit:Creating Sources, Processors & Stores");
//	KafkaSourceConfig kafkaSrcConfig = KafkaSourceConfig.getNamedKafkaConfig(configProps,
//			JobConstants.Components.HAPI_KAFKA_MSG_SOURCE);
//	LOG.info("kafkaSrcConfig:" + kafkaSrcConfig);
//
//	HdfsStoreConfig hdfsStrConfig = HdfsStoreConfig.getNamedHdfsStoreConfig(configProps,
//			JobConstants.Components.HDFS_STORE);
//	hdfsStrConfig.setKafkaSrcConfig(kafkaSrcConfig);
//	LOG.info("hdfsStrConfig:" + hdfsStrConfig);
//
//	JavaStreamingContext jssc = createSparkContext(
//			configProps.getProperty("app.name", JobConstants.DEFAULT_APP_NAME),
//			Integer.parseInt(
//					configProps.getProperty("job.batch.interval.secs", JobConstants.DEFAULT_SPARK_BATCH_INTERVAL)),
//			kafkaSrcConfig.getCheckpointdir());
//	jssc.sparkContext().hadoopConfiguration().set("mapreduce.output.basename", hdfsStrConfig.getFilePrefix());
//	LOG.info("Successfully created Spark Streaming Context." + jssc);
//
//	SQLContext sqlC = new SQLContext(jssc.sparkContext());
//	LOG.info("Successfully created Spark SQL Context." + sqlC);
//
//	Set<String> topicsSet = configureKafkaTopics(kafkaSrcConfig.getTopic());
//	LOG.info("topicsSet:" + topicsSet);
//
//	Map<String, String> kafkaParams = getDirectStreamParams(kafkaSrcConfig.getBootstrapServerStr());
//	LOG.info("kafkaParams:" + kafkaParams);
//
//	boolean isDirect = Boolean.parseBoolean(configProps.getProperty("isDirect", "false"));
//	if (isDirect) {
//		LOG.info("**************** Processing Direct Based Streaming");
//		Map<TopicAndPartition, Long> topicWithOffset = null;
//		// getStartingOffset(kafkaSrcConfig);
//		KafkaMsgProcessor kafkaMsgProc = new KafkaMsgProcessor(kafkaSrcConfig);
//		JavaDStream<String> lines = null;
//		if (topicWithOffset != null && !topicWithOffset.isEmpty()) {
//			// jssc - JavaStreamingContext object
//			// keyClass - Class of the keys in the Kafka records
//			// valueClass - Class of the values in the Kafka records
//			// keyDecoderClass - Class of the key decoder
//			// valueDecoderClass - Class of the value decoder
//			// recordClass - Class of the records in DStream
//			// kafkaParams - Kafka configuration parameters.
//			// fromOffsets - Per-topic/partition Kafka offsets defining the
//			// (inclusive) starting point of the stream
//			// messageHandler - Function for translating each message and
//			// metadata into the desired type
//			JavaInputDStream<String> messagesI = KafkaUtils.createDirectStream(jssc, String.class, String.class,
//					StringDecoder.class, StringDecoder.class, String.class, kafkaParams, topicWithOffset,
//					new MessageAndMetadataFunction());
//			LOG.info("Initiated Kafka Direct Stream to read data from Kafka. messages:" + messagesI);
//			lines = kafkaMsgProc.process(messagesI);
//		} else {
//			// jssc - JavaStreamingContext object
//			// keyClass - Class of the keys in the Kafka records
//			// valueClass - Class of the values in the Kafka records
//			// keyDecoderClass - Class of the key decoder
//			// valueDecoderClass - Class type of the value decoder
//			// kafkaParams - Kafka configuration parameters.
//			// topics - Names of the topics to consume
//			JavaPairInputDStream<String, String> messagesPair = KafkaUtils.createDirectStream(jssc, String.class,
//					String.class, StringDecoder.class, StringDecoder.class, kafkaParams, topicsSet);
//			LOG.info("Initiated Kafka Direct Stream to read data from Kafka. messages:" + messagesPair);
//			lines = kafkaMsgProc.process(messagesPair);
//		}
//
//		if (hdfsStrConfig.getUrl() != null) {
//			HdfsMsgProcessor hdfsMsgProc = new HdfsMsgProcessor(hdfsStrConfig);
//			hdfsMsgProc.setDirect(isDirect);
//			hdfsMsgProc.process(lines, sqlC);
//		}
//		LOG.info("Registered HDFS Message Processor");
//		LOG.info("---------------- Done with registring all components of the job");
//	} else {
//		LOG.info("**************** Processing Receiver Based Streaming");
//		Map<String, String> kafkaParamsR = getReceiverStreamParams(kafkaSrcConfig);
//		LOG.info("Kafka Receiver Params (before submit):" + kafkaParamsR);
//		Map<String, Integer> topicMap = new HashMap<String, Integer>();
//		int threads = kafkaSrcConfig.getParallelism();
//		topicMap.put(kafkaSrcConfig.getTopic(), threads);
//		JavaPairReceiverInputDStream<String, byte[]> kafkaStream = KafkaUtils.createStream(jssc, String.class,
//				byte[].class, kafka.serializer.DefaultDecoder.class, kafka.serializer.DefaultDecoder.class,
//				kafkaParamsR, topicMap, StorageLevel.MEMORY_AND_DISK_SER());
//
//		KafkaMsgProcessor kafkaMsgProc = new KafkaMsgProcessor(kafkaSrcConfig);
//		JavaDStream<String> lines = kafkaMsgProc.process(kafkaStream);
//		LOG.info("Registered Kafka Message Processor");
//
//		if (hdfsStrConfig.getUrl() != null) {
//			HdfsMsgProcessor hdfsMsgProc = new HdfsMsgProcessor(hdfsStrConfig);
//			hdfsMsgProc.process(lines, sqlC);
//		}
//		LOG.info("Registered HDFS Message Processor");
//
//		LOG.info("---------------- Done with registring all components of the job");
//	}
//	LOG.info("About to start the job");
//	jssc.start();
//	jssc.awaitTermination();
//}
//
//public static void saveLatestOffset(final KafkaSourceConfig kafkaSrcConfig, final OffsetRange[] offsets) {
//	LOG.info("-------saveLatestOffset:Topic:" + kafkaSrcConfig.getTopic() + "'s Latest Offset:" + offsets
//			+ ", is being saved to:" + kafkaSrcConfig.getTopicOffset());
//
//	KafkaProducer<String, String> kp = new KafkaProducer(getProducerParams(kafkaSrcConfig));
//	// Original Topic swapped with OffsetTopic
//	// Offset Value from Topic:T1 @Partition P1, is saved to Topic T1_Offset
//	// @Partition P1
//	for (OffsetRange offset : offsets) {
//		ProducerRecord<String, String> message = new ProducerRecord(kafkaSrcConfig.getTopicOffset(),
//				offset.partition(), kafkaSrcConfig.getTopicOffset(), "" + offset.untilOffset());
//		LOG.info("Saving this Message to Kafka Topic:" + message);
//		kp.send(message);
//	}
//}
//
//private static Map<TopicAndPartition, Long> getStartingOffset(final KafkaSourceConfig kafkaSrcConfig) {
//	LOG.info(
//			"-------getStartingOffset. Reading Latest Offset Value from Topic::" + kafkaSrcConfig.getTopicOffset());
//
//	// Lets read whats on this offset topic -across all partitions.
//	KafkaConsumer<String, String> kc = new KafkaConsumer(getConsumerParams(kafkaSrcConfig));
//	// @TODO. If we create topic with 10 partitions - we need to have 10 in
//	// this array 0 thru 10.
//	List<TopicPartition> offsetTopicList = null;
//	for (int i = 0; i < kafkaSrcConfig.getPartitionCount(); i++) {
//		offsetTopicList.add(new TopicPartition(kafkaSrcConfig.getTopicOffset(), i));
//	}
//
//	return null;
//}
//
//private Map<String, String> getReceiverStreamParams(KafkaSourceConfig kafkaSrcConfig) {
//	LOG.info("-------------getReceiverStreamParams:kafkaConfig:" + kafkaSrcConfig);
//	LOG.info("-------------getReceiverStreamParams:configProps:" + configProps);
//	Map<String, String> kafkaParamsR = new HashMap<String, String>();
//	kafkaParamsR.put("group.id", kafkaSrcConfig.getGroupId());
//	kafkaParamsR.put("auto.offset.reset", kafkaSrcConfig.getAutoOffsetReset());
//	kafkaParamsR.put("security.protocol", kafkaSrcConfig.getSecurityProtocol());
//	kafkaParamsR.put("bootstrap.servers", kafkaSrcConfig.getBootstrapServerStr());
//	kafkaParamsR.put("zookeeper.connect", kafkaSrcConfig.getZkHostPort());
//	return kafkaParamsR;
//}
//
//private Map<String, String> getDirectStreamParams(String brokers) {
//	LOG.info("-------------getDirectStreamParams:" + brokers);
//	Map<String, String> kafkaParams = new HashMap<>();
//	kafkaParams.put("metadata.broker.list", brokers);
//	LOG.info("----------------kafkaParams:" + kafkaParams);
//	return kafkaParams;
//}
//
//private Set<String> configureKafkaTopics(String topics) {
//	LOG.info("-------------configureKafkaTopics:" + topics);
//	Set<String> topicsSet = new HashSet<>(Arrays.asList(topics.split(",")));
//	return topicsSet;
//}
//
//private JavaStreamingContext createSparkContext(final String name, final int interval, final String checkpointDir) {
//	LOG.info("-------------createSparkContext:name:" + name + ", interval:" + interval);
//	final SparkConf sparkConf = new SparkConf().setAppName(name);
//	sparkConf.set("spark.streaming.stopGracefullyOnShutdown", "true");
//	// JavaStreamingContext jssc = new JavaStreamingContext(sparkConf,
//	// Durations.seconds(interval));
//	JavaStreamingContextFactory contextFactory = new JavaStreamingContextFactory() {
//		@Override
//		public JavaStreamingContext create() {
//			JavaStreamingContext jssc = new JavaStreamingContext(sparkConf, Durations.seconds(interval));
//
//			return jssc;
//		}
//	};
//	JavaStreamingContext jssc = JavaStreamingContext.getOrCreate(checkpointDir, contextFactory);
//	return jssc;
//}
//
//private static Map<String, String> getProducerParams(final KafkaSourceConfig kafkaSrcConfig) {
//	LOG.info("-------getProducerParams");
//	Map<String, String> params = new HashMap<String, String>();
//	params.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaSrcConfig.getBootstrapServerStr());
//	params.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
//			org.apache.kafka.common.serialization.StringSerializer.class.getName());
//	params.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
//			org.apache.kafka.common.serialization.StringSerializer.class.getName());
//	params.put("security.protocol", kafkaSrcConfig.getSecurityProtocol());
//	LOG.info("Params-Producer:" + params);
//	return params;
//}
//
//private static Map<String, String> getConsumerParams(final KafkaSourceConfig kafkaSrcConfig) {
//	LOG.info("-------getConsumerParams");
//	Map<String, String> params = new HashMap<String, String>();
//	params.put("bootstrap.servers", kafkaSrcConfig.getBootstrapServerStr());
//	params.put("group.id", kafkaSrcConfig.getGroupId());
//	params.put("key.deserializer", org.apache.kafka.common.serialization.StringDeserializer.class.getName());
//	params.put("value.deserializer", org.apache.kafka.common.serialization.StringDeserializer.class.getName());
//	params.put("security.protocol", kafkaSrcConfig.getSecurityProtocol());
//	LOG.info("Params-Consumer:" + params);
//
//	return params;
//}
//
//public static void main(String[] args) throws Exception {
//	String configFile = JobConstants.DEFAULT_PROPERTIES_FILE;
//
//	try {
//		// Initialize the configuration based on the environment
//		LOG.info("Args:" + args.length + ":[0]->" + args[0]);
//		if (args.length >= 1 && args[0] != null) {
//			configFile = args[0].trim();
//		}
//
//		HapiMain hapi = new HapiMain(configFile);
//
//		hapi.buildAndSubmit();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}
//}