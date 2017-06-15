
package com.poc.datamodel2;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "parent",
    "caused_by",
    "watch_list",
    "u_call_back_number",
    "upon_reject",
    "sys_updated_on",
    "u_resolved_by_tier_1",
    "u_ud_parent",
    "u_resolved_within_1_hour",
    "u_routing_rule",
    "approval_history",
    "skills",
    "number",
    "u_actual_resolution_date",
    "u_technical_service",
    "state",
    "sys_created_by",
    "knowledge",
    "order",
    "cmdb_ci",
    "impact",
    "u_requested_for",
    "active",
    "work_notes_list",
    "priority",
    "sys_domain_path",
    "u_hidden_data",
    "business_duration",
    "group_list",
    "u_reopened",
    "u_template",
    "u_protocol_not_followed",
    "approval_set",
    "u_incident_state_count",
    "u_contact_number_effort",
    "u_requested_by_phone",
    "short_description",
    "correlation_display",
    "u_error_code",
    "work_start",
    "additional_assignee_list",
    "notify",
    "service_offering",
    "sys_class_name",
    "closed_by",
    "follow_up",
    "parent_incident",
    "u_customer_escalation_timestamp",
    "u_planned_response_date",
    "vendor",
    "reassignment_count",
    "u_created_by_tier_1",
    "assigned_to",
    "u_reporting_subcategory",
    "u_wrong_classification",
    "u_reporting_indicator",
    "sla_due",
    "u_actual_response_date",
    "comments_and_work_notes",
    "u_sla_met",
    "u_customer_confirmation_y_n",
    "escalation",
    "upon_approval",
    "u_lateral_assignment",
    "u_service_category",
    "correlation_id",
    "u_resolution_duration",
    "u_requested_by_name",
    "made_sla",
    "u_major_incident",
    "u_requested_by_email",
    "child_incidents",
    "hold_reason",
    "resolved_by",
    "u_business_service",
    "sys_updated_by",
    "opened_by",
    "user_input",
    "sys_created_on",
    "sys_domain",
    "calendar_stc",
    "closed_at",
    "u_relationship",
    "u_requested_by_not_found",
    "business_service",
    "u_requested_by",
    "u_escalation_requested_by",
    "u_symptom",
    "rfc",
    "time_worked",
    "expected_start",
    "opened_at",
    "work_end",
    "caller_id",
    "resolved_at",
    "u_resolution_summary",
    "subcategory",
    "u_escalation_customer",
    "work_notes",
    "close_code",
    "u_sub_contact",
    "assignment_group",
    "u_kb_article",
    "u_asset_redeployable",
    "business_stc",
    "description",
    "u_first_line_resolved",
    "u_legacy_rgm",
    "u_planned_resolved_date",
    "calendar_duration",
    "u_on_hold_type",
    "close_notes",
    "u_stockroom",
    "sys_id",
    "contact_type",
    "incident_state",
    "urgency",
    "problem_id",
    "u_response_duration",
    "company",
    "activity_due",
    "severity",
    "u_in_stock",
    "comments",
    "approval",
    "u_assigned_above_tier_1",
    "due_date",
    "sys_mod_count",
    "reopen_count",
    "sys_tags",
    "u_first_call_resolution",
    "location",
    "category",
    "u_set_to_p1"
})
public class ServiceNowModel implements Serializable
{

    @JsonProperty("parent")
    private Parent parent;
    @JsonProperty("caused_by")
    private String causedBy;
    @JsonProperty("watch_list")
    private String watchList;
    @JsonProperty("u_call_back_number")
    private String uCallBackNumber;
    @JsonProperty("upon_reject")
    private String uponReject;
    @JsonProperty("sys_updated_on")
    private String sysUpdatedOn;
    @JsonProperty("u_resolved_by_tier_1")
    private String uResolvedByTier1;
    @JsonProperty("u_ud_parent")
    private String uUdParent;
    @JsonProperty("u_resolved_within_1_hour")
    private String uResolvedWithin1Hour;
    @JsonProperty("u_routing_rule")
    private URoutingRule uRoutingRule;
    @JsonProperty("approval_history")
    private String approvalHistory;
    @JsonProperty("skills")
    private String skills;
    @JsonProperty("number")
    private String number;
    @JsonProperty("u_actual_resolution_date")
    private String uActualResolutionDate;
    @JsonProperty("u_technical_service")
    private String uTechnicalService;
    @JsonProperty("state")
    private String state;
    @JsonProperty("sys_created_by")
    private String sysCreatedBy;
    @JsonProperty("knowledge")
    private String knowledge;
    @JsonProperty("order")
    private String order;
    @JsonProperty("cmdb_ci")
    private String cmdbCi;
    @JsonProperty("impact")
    private String impact;
    @JsonProperty("u_requested_for")
    private URequestedFor uRequestedFor;
    @JsonProperty("active")
    private String active;
    @JsonProperty("work_notes_list")
    private String workNotesList;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("sys_domain_path")
    private String sysDomainPath;
    @JsonProperty("u_hidden_data")
    private String uHiddenData;
    @JsonProperty("business_duration")
    private String businessDuration;
    @JsonProperty("group_list")
    private String groupList;
    @JsonProperty("u_reopened")
    private String uReopened;
    @JsonProperty("u_template")
    private String uTemplate;
    @JsonProperty("u_protocol_not_followed")
    private String uProtocolNotFollowed;
    @JsonProperty("approval_set")
    private String approvalSet;
    @JsonProperty("u_incident_state_count")
    private String uIncidentStateCount;
    @JsonProperty("u_contact_number_effort")
    private String uContactNumberEffort;
    @JsonProperty("u_requested_by_phone")
    private String uRequestedByPhone;
    @JsonProperty("short_description")
    private String shortDescription;
    @JsonProperty("correlation_display")
    private String correlationDisplay;
    @JsonProperty("u_error_code")
    private Object uErrorCode;
    @JsonProperty("work_start")
    private String workStart;
    @JsonProperty("additional_assignee_list")
    private String additionalAssigneeList;
    @JsonProperty("notify")
    private String notify;
    @JsonProperty("service_offering")
    private String serviceOffering;
    @JsonProperty("sys_class_name")
    private String sysClassName;
    @JsonProperty("closed_by")
    private ClosedBy closedBy;
    @JsonProperty("follow_up")
    private String followUp;
    @JsonProperty("parent_incident")
    private ParentIncident parentIncident;
    @JsonProperty("u_customer_escalation_timestamp")
    private String uCustomerEscalationTimestamp;
    @JsonProperty("u_planned_response_date")
    private String uPlannedResponseDate;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("reassignment_count")
    private String reassignmentCount;
    @JsonProperty("u_created_by_tier_1")
    private String uCreatedByTier1;
    @JsonProperty("assigned_to")
    private String assignedTo;
    @JsonProperty("u_reporting_subcategory")
    private Object uReportingSubcategory;
    @JsonProperty("u_wrong_classification")
    private String uWrongClassification;
    @JsonProperty("u_reporting_indicator")
    private Object uReportingIndicator;
    @JsonProperty("sla_due")
    private String slaDue;
    @JsonProperty("u_actual_response_date")
    private String uActualResponseDate;
    @JsonProperty("comments_and_work_notes")
    private String commentsAndWorkNotes;
    @JsonProperty("u_sla_met")
    private String uSlaMet;
    @JsonProperty("u_customer_confirmation_y_n")
    private String uCustomerConfirmationYN;
    @JsonProperty("escalation")
    private String escalation;
    @JsonProperty("upon_approval")
    private String uponApproval;
    @JsonProperty("u_lateral_assignment")
    private String uLateralAssignment;
    @JsonProperty("u_service_category")
    private UServiceCategory uServiceCategory;
    @JsonProperty("correlation_id")
    private String correlationId;
    @JsonProperty("u_resolution_duration")
    private String uResolutionDuration;
    @JsonProperty("u_requested_by_name")
    private String uRequestedByName;
    @JsonProperty("made_sla")
    private String madeSla;
    @JsonProperty("u_major_incident")
    private String uMajorIncident;
    @JsonProperty("u_requested_by_email")
    private String uRequestedByEmail;
    @JsonProperty("child_incidents")
    private String childIncidents;
    @JsonProperty("hold_reason")
    private String holdReason;
    @JsonProperty("resolved_by")
    private ResolvedBy resolvedBy;
    @JsonProperty("u_business_service")
    private UBusinessService uBusinessService;
    @JsonProperty("sys_updated_by")
    private String sysUpdatedBy;
    @JsonProperty("opened_by")
    private OpenedBy openedBy;
    @JsonProperty("user_input")
    private String userInput;
    @JsonProperty("sys_created_on")
    private String sysCreatedOn;
    @JsonProperty("sys_domain")
    private SysDomain sysDomain;
    @JsonProperty("calendar_stc")
    private String calendarStc;
    @JsonProperty("closed_at")
    private String closedAt;
    @JsonProperty("u_relationship")
    private Object uRelationship;
    @JsonProperty("u_requested_by_not_found")
    private String uRequestedByNotFound;
    @JsonProperty("business_service")
    private BusinessService businessService;
    @JsonProperty("u_requested_by")
    private URequestedBy uRequestedBy;
    @JsonProperty("u_escalation_requested_by")
    private String uEscalationRequestedBy;
    @JsonProperty("u_symptom")
    private USymptom uSymptom;
    @JsonProperty("rfc")
    private String rfc;
    @JsonProperty("time_worked")
    private String timeWorked;
    @JsonProperty("expected_start")
    private String expectedStart;
    @JsonProperty("opened_at")
    private String openedAt;
    @JsonProperty("work_end")
    private String workEnd;
    @JsonProperty("caller_id")
    private CallerId callerId;
    @JsonProperty("resolved_at")
    private String resolvedAt;
    @JsonProperty("u_resolution_summary")
    private String uResolutionSummary;
    @JsonProperty("subcategory")
    private Object subcategory;
    @JsonProperty("u_escalation_customer")
    private Object uEscalationCustomer;
    @JsonProperty("work_notes")
    private String workNotes;
    @JsonProperty("close_code")
    private String closeCode;
    @JsonProperty("u_sub_contact")
    private Object uSubContact;
    @JsonProperty("assignment_group")
    private AssignmentGroup assignmentGroup;
    @JsonProperty("u_kb_article")
    private String uKbArticle;
    @JsonProperty("u_asset_redeployable")
    private Object uAssetRedeployable;
    @JsonProperty("business_stc")
    private String businessStc;
    @JsonProperty("description")
    private String description;
    @JsonProperty("u_first_line_resolved")
    private String uFirstLineResolved;
    @JsonProperty("u_legacy_rgm")
    private String uLegacyRgm;
    @JsonProperty("u_planned_resolved_date")
    private String uPlannedResolvedDate;
    @JsonProperty("calendar_duration")
    private String calendarDuration;
    @JsonProperty("u_on_hold_type")
    private Object uOnHoldType;
    @JsonProperty("close_notes")
    private String closeNotes;
    @JsonProperty("u_stockroom")
    private String uStockroom;
    @JsonProperty("sys_id")
    private String sysId;
    @JsonProperty("contact_type")
    private String contactType;
    @JsonProperty("incident_state")
    private String incidentState;
    @JsonProperty("urgency")
    private String urgency;
    @JsonProperty("problem_id")
    private String problemId;
    @JsonProperty("u_response_duration")
    private String uResponseDuration;
    @JsonProperty("company")
    private Company company;
    @JsonProperty("activity_due")
    private String activityDue;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("u_in_stock")
    private Object uInStock;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("approval")
    private String approval;
    @JsonProperty("u_assigned_above_tier_1")
    private String uAssignedAboveTier1;
    @JsonProperty("due_date")
    private String dueDate;
    @JsonProperty("sys_mod_count")
    private String sysModCount;
    @JsonProperty("reopen_count")
    private String reopenCount;
    @JsonProperty("sys_tags")
    private String sysTags;
    @JsonProperty("u_first_call_resolution")
    private String uFirstCallResolution;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("category")
    private String category;
    @JsonProperty("u_set_to_p1")
    private String uSetToP1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3764082502821092363L;

    @JsonProperty("parent")
    public Parent getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @JsonProperty("caused_by")
    public String getCausedBy() {
        return causedBy;
    }

    @JsonProperty("caused_by")
    public void setCausedBy(String causedBy) {
        this.causedBy = causedBy;
    }

    @JsonProperty("watch_list")
    public String getWatchList() {
        return watchList;
    }

    @JsonProperty("watch_list")
    public void setWatchList(String watchList) {
        this.watchList = watchList;
    }

    @JsonProperty("u_call_back_number")
    public String getUCallBackNumber() {
        return uCallBackNumber;
    }

    @JsonProperty("u_call_back_number")
    public void setUCallBackNumber(String uCallBackNumber) {
        this.uCallBackNumber = uCallBackNumber;
    }

    @JsonProperty("upon_reject")
    public String getUponReject() {
        return uponReject;
    }

    @JsonProperty("upon_reject")
    public void setUponReject(String uponReject) {
        this.uponReject = uponReject;
    }

    @JsonProperty("sys_updated_on")
    public String getSysUpdatedOn() {
        return sysUpdatedOn;
    }

    @JsonProperty("sys_updated_on")
    public void setSysUpdatedOn(String sysUpdatedOn) {
        this.sysUpdatedOn = sysUpdatedOn;
    }

    @JsonProperty("u_resolved_by_tier_1")
    public String getUResolvedByTier1() {
        return uResolvedByTier1;
    }

    @JsonProperty("u_resolved_by_tier_1")
    public void setUResolvedByTier1(String uResolvedByTier1) {
        this.uResolvedByTier1 = uResolvedByTier1;
    }

    @JsonProperty("u_ud_parent")
    public String getUUdParent() {
        return uUdParent;
    }

    @JsonProperty("u_ud_parent")
    public void setUUdParent(String uUdParent) {
        this.uUdParent = uUdParent;
    }

    @JsonProperty("u_resolved_within_1_hour")
    public String getUResolvedWithin1Hour() {
        return uResolvedWithin1Hour;
    }

    @JsonProperty("u_resolved_within_1_hour")
    public void setUResolvedWithin1Hour(String uResolvedWithin1Hour) {
        this.uResolvedWithin1Hour = uResolvedWithin1Hour;
    }

    @JsonProperty("u_routing_rule")
    public URoutingRule getURoutingRule() {
        return uRoutingRule;
    }

    @JsonProperty("u_routing_rule")
    public void setURoutingRule(URoutingRule uRoutingRule) {
        this.uRoutingRule = uRoutingRule;
    }

    @JsonProperty("approval_history")
    public String getApprovalHistory() {
        return approvalHistory;
    }

    @JsonProperty("approval_history")
    public void setApprovalHistory(String approvalHistory) {
        this.approvalHistory = approvalHistory;
    }

    @JsonProperty("skills")
    public String getSkills() {
        return skills;
    }

    @JsonProperty("skills")
    public void setSkills(String skills) {
        this.skills = skills;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("u_actual_resolution_date")
    public String getUActualResolutionDate() {
        return uActualResolutionDate;
    }

    @JsonProperty("u_actual_resolution_date")
    public void setUActualResolutionDate(String uActualResolutionDate) {
        this.uActualResolutionDate = uActualResolutionDate;
    }

    @JsonProperty("u_technical_service")
    public String getUTechnicalService() {
        return uTechnicalService;
    }

    @JsonProperty("u_technical_service")
    public void setUTechnicalService(String uTechnicalService) {
        this.uTechnicalService = uTechnicalService;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("sys_created_by")
    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    @JsonProperty("sys_created_by")
    public void setSysCreatedBy(String sysCreatedBy) {
        this.sysCreatedBy = sysCreatedBy;
    }

    @JsonProperty("knowledge")
    public String getKnowledge() {
        return knowledge;
    }

    @JsonProperty("knowledge")
    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    @JsonProperty("order")
    public String getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(String order) {
        this.order = order;
    }

    @JsonProperty("cmdb_ci")
    public String getCmdbCi() {
        return cmdbCi;
    }

    @JsonProperty("cmdb_ci")
    public void setCmdbCi(String cmdbCi) {
        this.cmdbCi = cmdbCi;
    }

    @JsonProperty("impact")
    public String getImpact() {
        return impact;
    }

    @JsonProperty("impact")
    public void setImpact(String impact) {
        this.impact = impact;
    }

    @JsonProperty("u_requested_for")
    public URequestedFor getURequestedFor() {
        return uRequestedFor;
    }

    @JsonProperty("u_requested_for")
    public void setURequestedFor(URequestedFor uRequestedFor) {
        this.uRequestedFor = uRequestedFor;
    }

    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
    }

    @JsonProperty("work_notes_list")
    public String getWorkNotesList() {
        return workNotesList;
    }

    @JsonProperty("work_notes_list")
    public void setWorkNotesList(String workNotesList) {
        this.workNotesList = workNotesList;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("sys_domain_path")
    public String getSysDomainPath() {
        return sysDomainPath;
    }

    @JsonProperty("sys_domain_path")
    public void setSysDomainPath(String sysDomainPath) {
        this.sysDomainPath = sysDomainPath;
    }

    @JsonProperty("u_hidden_data")
    public String getUHiddenData() {
        return uHiddenData;
    }

    @JsonProperty("u_hidden_data")
    public void setUHiddenData(String uHiddenData) {
        this.uHiddenData = uHiddenData;
    }

    @JsonProperty("business_duration")
    public String getBusinessDuration() {
        return businessDuration;
    }

    @JsonProperty("business_duration")
    public void setBusinessDuration(String businessDuration) {
        this.businessDuration = businessDuration;
    }

    @JsonProperty("group_list")
    public String getGroupList() {
        return groupList;
    }

    @JsonProperty("group_list")
    public void setGroupList(String groupList) {
        this.groupList = groupList;
    }

    @JsonProperty("u_reopened")
    public String getUReopened() {
        return uReopened;
    }

    @JsonProperty("u_reopened")
    public void setUReopened(String uReopened) {
        this.uReopened = uReopened;
    }

    @JsonProperty("u_template")
    public String getUTemplate() {
        return uTemplate;
    }

    @JsonProperty("u_template")
    public void setUTemplate(String uTemplate) {
        this.uTemplate = uTemplate;
    }

    @JsonProperty("u_protocol_not_followed")
    public String getUProtocolNotFollowed() {
        return uProtocolNotFollowed;
    }

    @JsonProperty("u_protocol_not_followed")
    public void setUProtocolNotFollowed(String uProtocolNotFollowed) {
        this.uProtocolNotFollowed = uProtocolNotFollowed;
    }

    @JsonProperty("approval_set")
    public String getApprovalSet() {
        return approvalSet;
    }

    @JsonProperty("approval_set")
    public void setApprovalSet(String approvalSet) {
        this.approvalSet = approvalSet;
    }

    @JsonProperty("u_incident_state_count")
    public String getUIncidentStateCount() {
        return uIncidentStateCount;
    }

    @JsonProperty("u_incident_state_count")
    public void setUIncidentStateCount(String uIncidentStateCount) {
        this.uIncidentStateCount = uIncidentStateCount;
    }

    @JsonProperty("u_contact_number_effort")
    public String getUContactNumberEffort() {
        return uContactNumberEffort;
    }

    @JsonProperty("u_contact_number_effort")
    public void setUContactNumberEffort(String uContactNumberEffort) {
        this.uContactNumberEffort = uContactNumberEffort;
    }

    @JsonProperty("u_requested_by_phone")
    public String getURequestedByPhone() {
        return uRequestedByPhone;
    }

    @JsonProperty("u_requested_by_phone")
    public void setURequestedByPhone(String uRequestedByPhone) {
        this.uRequestedByPhone = uRequestedByPhone;
    }

    @JsonProperty("short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    @JsonProperty("short_description")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @JsonProperty("correlation_display")
    public String getCorrelationDisplay() {
        return correlationDisplay;
    }

    @JsonProperty("correlation_display")
    public void setCorrelationDisplay(String correlationDisplay) {
        this.correlationDisplay = correlationDisplay;
    }

    @JsonProperty("u_error_code")
    public Object getUErrorCode() {
        return uErrorCode;
    }

    @JsonProperty("u_error_code")
    public void setUErrorCode(Object uErrorCode) {
        this.uErrorCode = uErrorCode;
    }

    @JsonProperty("work_start")
    public String getWorkStart() {
        return workStart;
    }

    @JsonProperty("work_start")
    public void setWorkStart(String workStart) {
        this.workStart = workStart;
    }

    @JsonProperty("additional_assignee_list")
    public String getAdditionalAssigneeList() {
        return additionalAssigneeList;
    }

    @JsonProperty("additional_assignee_list")
    public void setAdditionalAssigneeList(String additionalAssigneeList) {
        this.additionalAssigneeList = additionalAssigneeList;
    }

    @JsonProperty("notify")
    public String getNotify() {
        return notify;
    }

    @JsonProperty("notify")
    public void setNotify(String notify) {
        this.notify = notify;
    }

    @JsonProperty("service_offering")
    public String getServiceOffering() {
        return serviceOffering;
    }

    @JsonProperty("service_offering")
    public void setServiceOffering(String serviceOffering) {
        this.serviceOffering = serviceOffering;
    }

    @JsonProperty("sys_class_name")
    public String getSysClassName() {
        return sysClassName;
    }

    @JsonProperty("sys_class_name")
    public void setSysClassName(String sysClassName) {
        this.sysClassName = sysClassName;
    }

    @JsonProperty("closed_by")
    public ClosedBy getClosedBy() {
        return closedBy;
    }

    @JsonProperty("closed_by")
    public void setClosedBy(ClosedBy closedBy) {
        this.closedBy = closedBy;
    }

    @JsonProperty("follow_up")
    public String getFollowUp() {
        return followUp;
    }

    @JsonProperty("follow_up")
    public void setFollowUp(String followUp) {
        this.followUp = followUp;
    }

    @JsonProperty("parent_incident")
    public ParentIncident getParentIncident() {
        return parentIncident;
    }

    @JsonProperty("parent_incident")
    public void setParentIncident(ParentIncident parentIncident) {
        this.parentIncident = parentIncident;
    }

    @JsonProperty("u_customer_escalation_timestamp")
    public String getUCustomerEscalationTimestamp() {
        return uCustomerEscalationTimestamp;
    }

    @JsonProperty("u_customer_escalation_timestamp")
    public void setUCustomerEscalationTimestamp(String uCustomerEscalationTimestamp) {
        this.uCustomerEscalationTimestamp = uCustomerEscalationTimestamp;
    }

    @JsonProperty("u_planned_response_date")
    public String getUPlannedResponseDate() {
        return uPlannedResponseDate;
    }

    @JsonProperty("u_planned_response_date")
    public void setUPlannedResponseDate(String uPlannedResponseDate) {
        this.uPlannedResponseDate = uPlannedResponseDate;
    }

    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    @JsonProperty("vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @JsonProperty("reassignment_count")
    public String getReassignmentCount() {
        return reassignmentCount;
    }

    @JsonProperty("reassignment_count")
    public void setReassignmentCount(String reassignmentCount) {
        this.reassignmentCount = reassignmentCount;
    }

    @JsonProperty("u_created_by_tier_1")
    public String getUCreatedByTier1() {
        return uCreatedByTier1;
    }

    @JsonProperty("u_created_by_tier_1")
    public void setUCreatedByTier1(String uCreatedByTier1) {
        this.uCreatedByTier1 = uCreatedByTier1;
    }

    @JsonProperty("assigned_to")
    public String getAssignedTo() {
        return assignedTo;
    }

    @JsonProperty("assigned_to")
    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    @JsonProperty("u_reporting_subcategory")
    public Object getUReportingSubcategory() {
        return uReportingSubcategory;
    }

    @JsonProperty("u_reporting_subcategory")
    public void setUReportingSubcategory(Object uReportingSubcategory) {
        this.uReportingSubcategory = uReportingSubcategory;
    }

    @JsonProperty("u_wrong_classification")
    public String getUWrongClassification() {
        return uWrongClassification;
    }

    @JsonProperty("u_wrong_classification")
    public void setUWrongClassification(String uWrongClassification) {
        this.uWrongClassification = uWrongClassification;
    }

    @JsonProperty("u_reporting_indicator")
    public Object getUReportingIndicator() {
        return uReportingIndicator;
    }

    @JsonProperty("u_reporting_indicator")
    public void setUReportingIndicator(Object uReportingIndicator) {
        this.uReportingIndicator = uReportingIndicator;
    }

    @JsonProperty("sla_due")
    public String getSlaDue() {
        return slaDue;
    }

    @JsonProperty("sla_due")
    public void setSlaDue(String slaDue) {
        this.slaDue = slaDue;
    }

    @JsonProperty("u_actual_response_date")
    public String getUActualResponseDate() {
        return uActualResponseDate;
    }

    @JsonProperty("u_actual_response_date")
    public void setUActualResponseDate(String uActualResponseDate) {
        this.uActualResponseDate = uActualResponseDate;
    }

    @JsonProperty("comments_and_work_notes")
    public String getCommentsAndWorkNotes() {
        return commentsAndWorkNotes;
    }

    @JsonProperty("comments_and_work_notes")
    public void setCommentsAndWorkNotes(String commentsAndWorkNotes) {
        this.commentsAndWorkNotes = commentsAndWorkNotes;
    }

    @JsonProperty("u_sla_met")
    public String getUSlaMet() {
        return uSlaMet;
    }

    @JsonProperty("u_sla_met")
    public void setUSlaMet(String uSlaMet) {
        this.uSlaMet = uSlaMet;
    }

    @JsonProperty("u_customer_confirmation_y_n")
    public String getUCustomerConfirmationYN() {
        return uCustomerConfirmationYN;
    }

    @JsonProperty("u_customer_confirmation_y_n")
    public void setUCustomerConfirmationYN(String uCustomerConfirmationYN) {
        this.uCustomerConfirmationYN = uCustomerConfirmationYN;
    }

    @JsonProperty("escalation")
    public String getEscalation() {
        return escalation;
    }

    @JsonProperty("escalation")
    public void setEscalation(String escalation) {
        this.escalation = escalation;
    }

    @JsonProperty("upon_approval")
    public String getUponApproval() {
        return uponApproval;
    }

    @JsonProperty("upon_approval")
    public void setUponApproval(String uponApproval) {
        this.uponApproval = uponApproval;
    }

    @JsonProperty("u_lateral_assignment")
    public String getULateralAssignment() {
        return uLateralAssignment;
    }

    @JsonProperty("u_lateral_assignment")
    public void setULateralAssignment(String uLateralAssignment) {
        this.uLateralAssignment = uLateralAssignment;
    }

    @JsonProperty("u_service_category")
    public UServiceCategory getUServiceCategory() {
        return uServiceCategory;
    }

    @JsonProperty("u_service_category")
    public void setUServiceCategory(UServiceCategory uServiceCategory) {
        this.uServiceCategory = uServiceCategory;
    }

    @JsonProperty("correlation_id")
    public String getCorrelationId() {
        return correlationId;
    }

    @JsonProperty("correlation_id")
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    @JsonProperty("u_resolution_duration")
    public String getUResolutionDuration() {
        return uResolutionDuration;
    }

    @JsonProperty("u_resolution_duration")
    public void setUResolutionDuration(String uResolutionDuration) {
        this.uResolutionDuration = uResolutionDuration;
    }

    @JsonProperty("u_requested_by_name")
    public String getURequestedByName() {
        return uRequestedByName;
    }

    @JsonProperty("u_requested_by_name")
    public void setURequestedByName(String uRequestedByName) {
        this.uRequestedByName = uRequestedByName;
    }

    @JsonProperty("made_sla")
    public String getMadeSla() {
        return madeSla;
    }

    @JsonProperty("made_sla")
    public void setMadeSla(String madeSla) {
        this.madeSla = madeSla;
    }

    @JsonProperty("u_major_incident")
    public String getUMajorIncident() {
        return uMajorIncident;
    }

    @JsonProperty("u_major_incident")
    public void setUMajorIncident(String uMajorIncident) {
        this.uMajorIncident = uMajorIncident;
    }

    @JsonProperty("u_requested_by_email")
    public String getURequestedByEmail() {
        return uRequestedByEmail;
    }

    @JsonProperty("u_requested_by_email")
    public void setURequestedByEmail(String uRequestedByEmail) {
        this.uRequestedByEmail = uRequestedByEmail;
    }

    @JsonProperty("child_incidents")
    public String getChildIncidents() {
        return childIncidents;
    }

    @JsonProperty("child_incidents")
    public void setChildIncidents(String childIncidents) {
        this.childIncidents = childIncidents;
    }

    @JsonProperty("hold_reason")
    public String getHoldReason() {
        return holdReason;
    }

    @JsonProperty("hold_reason")
    public void setHoldReason(String holdReason) {
        this.holdReason = holdReason;
    }

    @JsonProperty("resolved_by")
    public ResolvedBy getResolvedBy() {
        return resolvedBy;
    }

    @JsonProperty("resolved_by")
    public void setResolvedBy(ResolvedBy resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    @JsonProperty("u_business_service")
    public UBusinessService getUBusinessService() {
        return uBusinessService;
    }

    @JsonProperty("u_business_service")
    public void setUBusinessService(UBusinessService uBusinessService) {
        this.uBusinessService = uBusinessService;
    }

    @JsonProperty("sys_updated_by")
    public String getSysUpdatedBy() {
        return sysUpdatedBy;
    }

    @JsonProperty("sys_updated_by")
    public void setSysUpdatedBy(String sysUpdatedBy) {
        this.sysUpdatedBy = sysUpdatedBy;
    }

    @JsonProperty("opened_by")
    public OpenedBy getOpenedBy() {
        return openedBy;
    }

    @JsonProperty("opened_by")
    public void setOpenedBy(OpenedBy openedBy) {
        this.openedBy = openedBy;
    }

    @JsonProperty("user_input")
    public String getUserInput() {
        return userInput;
    }

    @JsonProperty("user_input")
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    @JsonProperty("sys_created_on")
    public String getSysCreatedOn() {
        return sysCreatedOn;
    }

    @JsonProperty("sys_created_on")
    public void setSysCreatedOn(String sysCreatedOn) {
        this.sysCreatedOn = sysCreatedOn;
    }

    @JsonProperty("sys_domain")
    public SysDomain getSysDomain() {
        return sysDomain;
    }

    @JsonProperty("sys_domain")
    public void setSysDomain(SysDomain sysDomain) {
        this.sysDomain = sysDomain;
    }

    @JsonProperty("calendar_stc")
    public String getCalendarStc() {
        return calendarStc;
    }

    @JsonProperty("calendar_stc")
    public void setCalendarStc(String calendarStc) {
        this.calendarStc = calendarStc;
    }

    @JsonProperty("closed_at")
    public String getClosedAt() {
        return closedAt;
    }

    @JsonProperty("closed_at")
    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    @JsonProperty("u_relationship")
    public Object getURelationship() {
        return uRelationship;
    }

    @JsonProperty("u_relationship")
    public void setURelationship(Object uRelationship) {
        this.uRelationship = uRelationship;
    }

    @JsonProperty("u_requested_by_not_found")
    public String getURequestedByNotFound() {
        return uRequestedByNotFound;
    }

    @JsonProperty("u_requested_by_not_found")
    public void setURequestedByNotFound(String uRequestedByNotFound) {
        this.uRequestedByNotFound = uRequestedByNotFound;
    }

    @JsonProperty("business_service")
    public BusinessService getBusinessService() {
        return businessService;
    }

    @JsonProperty("business_service")
    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
    }

    @JsonProperty("u_requested_by")
    public URequestedBy getURequestedBy() {
        return uRequestedBy;
    }

    @JsonProperty("u_requested_by")
    public void setURequestedBy(URequestedBy uRequestedBy) {
        this.uRequestedBy = uRequestedBy;
    }

    @JsonProperty("u_escalation_requested_by")
    public String getUEscalationRequestedBy() {
        return uEscalationRequestedBy;
    }

    @JsonProperty("u_escalation_requested_by")
    public void setUEscalationRequestedBy(String uEscalationRequestedBy) {
        this.uEscalationRequestedBy = uEscalationRequestedBy;
    }

    @JsonProperty("u_symptom")
    public USymptom getUSymptom() {
        return uSymptom;
    }

    @JsonProperty("u_symptom")
    public void setUSymptom(USymptom uSymptom) {
        this.uSymptom = uSymptom;
    }

    @JsonProperty("rfc")
    public String getRfc() {
        return rfc;
    }

    @JsonProperty("rfc")
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @JsonProperty("time_worked")
    public String getTimeWorked() {
        return timeWorked;
    }

    @JsonProperty("time_worked")
    public void setTimeWorked(String timeWorked) {
        this.timeWorked = timeWorked;
    }

    @JsonProperty("expected_start")
    public String getExpectedStart() {
        return expectedStart;
    }

    @JsonProperty("expected_start")
    public void setExpectedStart(String expectedStart) {
        this.expectedStart = expectedStart;
    }

    @JsonProperty("opened_at")
    public String getOpenedAt() {
        return openedAt;
    }

    @JsonProperty("opened_at")
    public void setOpenedAt(String openedAt) {
        this.openedAt = openedAt;
    }

    @JsonProperty("work_end")
    public String getWorkEnd() {
        return workEnd;
    }

    @JsonProperty("work_end")
    public void setWorkEnd(String workEnd) {
        this.workEnd = workEnd;
    }

    @JsonProperty("caller_id")
    public CallerId getCallerId() {
        return callerId;
    }

    @JsonProperty("caller_id")
    public void setCallerId(CallerId callerId) {
        this.callerId = callerId;
    }

    @JsonProperty("resolved_at")
    public String getResolvedAt() {
        return resolvedAt;
    }

    @JsonProperty("resolved_at")
    public void setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    @JsonProperty("u_resolution_summary")
    public String getUResolutionSummary() {
        return uResolutionSummary;
    }

    @JsonProperty("u_resolution_summary")
    public void setUResolutionSummary(String uResolutionSummary) {
        this.uResolutionSummary = uResolutionSummary;
    }

    @JsonProperty("subcategory")
    public Object getSubcategory() {
        return subcategory;
    }

    @JsonProperty("subcategory")
    public void setSubcategory(Object subcategory) {
        this.subcategory = subcategory;
    }

    @JsonProperty("u_escalation_customer")
    public Object getUEscalationCustomer() {
        return uEscalationCustomer;
    }

    @JsonProperty("u_escalation_customer")
    public void setUEscalationCustomer(Object uEscalationCustomer) {
        this.uEscalationCustomer = uEscalationCustomer;
    }

    @JsonProperty("work_notes")
    public String getWorkNotes() {
        return workNotes;
    }

    @JsonProperty("work_notes")
    public void setWorkNotes(String workNotes) {
        this.workNotes = workNotes;
    }

    @JsonProperty("close_code")
    public String getCloseCode() {
        return closeCode;
    }

    @JsonProperty("close_code")
    public void setCloseCode(String closeCode) {
        this.closeCode = closeCode;
    }

    @JsonProperty("u_sub_contact")
    public Object getUSubContact() {
        return uSubContact;
    }

    @JsonProperty("u_sub_contact")
    public void setUSubContact(Object uSubContact) {
        this.uSubContact = uSubContact;
    }

    @JsonProperty("assignment_group")
    public AssignmentGroup getAssignmentGroup() {
        return assignmentGroup;
    }

    @JsonProperty("assignment_group")
    public void setAssignmentGroup(AssignmentGroup assignmentGroup) {
        this.assignmentGroup = assignmentGroup;
    }

    @JsonProperty("u_kb_article")
    public String getUKbArticle() {
        return uKbArticle;
    }

    @JsonProperty("u_kb_article")
    public void setUKbArticle(String uKbArticle) {
        this.uKbArticle = uKbArticle;
    }

    @JsonProperty("u_asset_redeployable")
    public Object getUAssetRedeployable() {
        return uAssetRedeployable;
    }

    @JsonProperty("u_asset_redeployable")
    public void setUAssetRedeployable(Object uAssetRedeployable) {
        this.uAssetRedeployable = uAssetRedeployable;
    }

    @JsonProperty("business_stc")
    public String getBusinessStc() {
        return businessStc;
    }

    @JsonProperty("business_stc")
    public void setBusinessStc(String businessStc) {
        this.businessStc = businessStc;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("u_first_line_resolved")
    public String getUFirstLineResolved() {
        return uFirstLineResolved;
    }

    @JsonProperty("u_first_line_resolved")
    public void setUFirstLineResolved(String uFirstLineResolved) {
        this.uFirstLineResolved = uFirstLineResolved;
    }

    @JsonProperty("u_legacy_rgm")
    public String getULegacyRgm() {
        return uLegacyRgm;
    }

    @JsonProperty("u_legacy_rgm")
    public void setULegacyRgm(String uLegacyRgm) {
        this.uLegacyRgm = uLegacyRgm;
    }

    @JsonProperty("u_planned_resolved_date")
    public String getUPlannedResolvedDate() {
        return uPlannedResolvedDate;
    }

    @JsonProperty("u_planned_resolved_date")
    public void setUPlannedResolvedDate(String uPlannedResolvedDate) {
        this.uPlannedResolvedDate = uPlannedResolvedDate;
    }

    @JsonProperty("calendar_duration")
    public String getCalendarDuration() {
        return calendarDuration;
    }

    @JsonProperty("calendar_duration")
    public void setCalendarDuration(String calendarDuration) {
        this.calendarDuration = calendarDuration;
    }

    @JsonProperty("u_on_hold_type")
    public Object getUOnHoldType() {
        return uOnHoldType;
    }

    @JsonProperty("u_on_hold_type")
    public void setUOnHoldType(Object uOnHoldType) {
        this.uOnHoldType = uOnHoldType;
    }

    @JsonProperty("close_notes")
    public String getCloseNotes() {
        return closeNotes;
    }

    @JsonProperty("close_notes")
    public void setCloseNotes(String closeNotes) {
        this.closeNotes = closeNotes;
    }

    @JsonProperty("u_stockroom")
    public String getUStockroom() {
        return uStockroom;
    }

    @JsonProperty("u_stockroom")
    public void setUStockroom(String uStockroom) {
        this.uStockroom = uStockroom;
    }

    @JsonProperty("sys_id")
    public String getSysId() {
        return sysId;
    }

    @JsonProperty("sys_id")
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    @JsonProperty("contact_type")
    public String getContactType() {
        return contactType;
    }

    @JsonProperty("contact_type")
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    @JsonProperty("incident_state")
    public String getIncidentState() {
        return incidentState;
    }

    @JsonProperty("incident_state")
    public void setIncidentState(String incidentState) {
        this.incidentState = incidentState;
    }

    @JsonProperty("urgency")
    public String getUrgency() {
        return urgency;
    }

    @JsonProperty("urgency")
    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    @JsonProperty("problem_id")
    public String getProblemId() {
        return problemId;
    }

    @JsonProperty("problem_id")
    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    @JsonProperty("u_response_duration")
    public String getUResponseDuration() {
        return uResponseDuration;
    }

    @JsonProperty("u_response_duration")
    public void setUResponseDuration(String uResponseDuration) {
        this.uResponseDuration = uResponseDuration;
    }

    @JsonProperty("company")
    public Company getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(Company company) {
        this.company = company;
    }

    @JsonProperty("activity_due")
    public String getActivityDue() {
        return activityDue;
    }

    @JsonProperty("activity_due")
    public void setActivityDue(String activityDue) {
        this.activityDue = activityDue;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("u_in_stock")
    public Object getUInStock() {
        return uInStock;
    }

    @JsonProperty("u_in_stock")
    public void setUInStock(Object uInStock) {
        this.uInStock = uInStock;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("approval")
    public String getApproval() {
        return approval;
    }

    @JsonProperty("approval")
    public void setApproval(String approval) {
        this.approval = approval;
    }

    @JsonProperty("u_assigned_above_tier_1")
    public String getUAssignedAboveTier1() {
        return uAssignedAboveTier1;
    }

    @JsonProperty("u_assigned_above_tier_1")
    public void setUAssignedAboveTier1(String uAssignedAboveTier1) {
        this.uAssignedAboveTier1 = uAssignedAboveTier1;
    }

    @JsonProperty("due_date")
    public String getDueDate() {
        return dueDate;
    }

    @JsonProperty("due_date")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @JsonProperty("sys_mod_count")
    public String getSysModCount() {
        return sysModCount;
    }

    @JsonProperty("sys_mod_count")
    public void setSysModCount(String sysModCount) {
        this.sysModCount = sysModCount;
    }

    @JsonProperty("reopen_count")
    public String getReopenCount() {
        return reopenCount;
    }

    @JsonProperty("reopen_count")
    public void setReopenCount(String reopenCount) {
        this.reopenCount = reopenCount;
    }

    @JsonProperty("sys_tags")
    public String getSysTags() {
        return sysTags;
    }

    @JsonProperty("sys_tags")
    public void setSysTags(String sysTags) {
        this.sysTags = sysTags;
    }

    @JsonProperty("u_first_call_resolution")
    public String getUFirstCallResolution() {
        return uFirstCallResolution;
    }

    @JsonProperty("u_first_call_resolution")
    public void setUFirstCallResolution(String uFirstCallResolution) {
        this.uFirstCallResolution = uFirstCallResolution;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("u_set_to_p1")
    public String getUSetToP1() {
        return uSetToP1;
    }

    @JsonProperty("u_set_to_p1")
    public void setUSetToP1(String uSetToP1) {
        this.uSetToP1 = uSetToP1;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "ServiceNowModel [" + (parent != null ? "parent=" + parent + ", " : "")
				+ (causedBy != null ? "causedBy=" + causedBy + ", " : "")
				+ (watchList != null ? "watchList=" + watchList + ", " : "")
				+ (uCallBackNumber != null ? "uCallBackNumber=" + uCallBackNumber + ", " : "")
				+ (uponReject != null ? "uponReject=" + uponReject + ", " : "")
				+ (sysUpdatedOn != null ? "sysUpdatedOn=" + sysUpdatedOn + ", " : "")
				+ (uResolvedByTier1 != null ? "uResolvedByTier1=" + uResolvedByTier1 + ", " : "")
				+ (uUdParent != null ? "uUdParent=" + uUdParent + ", " : "")
				+ (uResolvedWithin1Hour != null ? "uResolvedWithin1Hour=" + uResolvedWithin1Hour + ", " : "")
				+ (uRoutingRule != null ? "uRoutingRule=" + uRoutingRule + ", " : "")
				+ (approvalHistory != null ? "approvalHistory=" + approvalHistory + ", " : "")
				+ (skills != null ? "skills=" + skills + ", " : "") + (number != null ? "number=" + number + ", " : "")
				+ (uActualResolutionDate != null ? "uActualResolutionDate=" + uActualResolutionDate + ", " : "")
				+ (uTechnicalService != null ? "uTechnicalService=" + uTechnicalService + ", " : "")
				+ (state != null ? "state=" + state + ", " : "")
				+ (sysCreatedBy != null ? "sysCreatedBy=" + sysCreatedBy + ", " : "")
				+ (knowledge != null ? "knowledge=" + knowledge + ", " : "")
				+ (order != null ? "order=" + order + ", " : "") + (cmdbCi != null ? "cmdbCi=" + cmdbCi + ", " : "")
				+ (impact != null ? "impact=" + impact + ", " : "")
				+ (uRequestedFor != null ? "uRequestedFor=" + uRequestedFor + ", " : "")
				+ (active != null ? "active=" + active + ", " : "")
				+ (workNotesList != null ? "workNotesList=" + workNotesList + ", " : "")
				+ (priority != null ? "priority=" + priority + ", " : "")
				+ (sysDomainPath != null ? "sysDomainPath=" + sysDomainPath + ", " : "")
				+ (uHiddenData != null ? "uHiddenData=" + uHiddenData + ", " : "")
				+ (businessDuration != null ? "businessDuration=" + businessDuration + ", " : "")
				+ (groupList != null ? "groupList=" + groupList + ", " : "")
				+ (uReopened != null ? "uReopened=" + uReopened + ", " : "")
				+ (uTemplate != null ? "uTemplate=" + uTemplate + ", " : "")
				+ (uProtocolNotFollowed != null ? "uProtocolNotFollowed=" + uProtocolNotFollowed + ", " : "")
				+ (approvalSet != null ? "approvalSet=" + approvalSet + ", " : "")
				+ (uIncidentStateCount != null ? "uIncidentStateCount=" + uIncidentStateCount + ", " : "")
				+ (uContactNumberEffort != null ? "uContactNumberEffort=" + uContactNumberEffort + ", " : "")
				+ (uRequestedByPhone != null ? "uRequestedByPhone=" + uRequestedByPhone + ", " : "")
				+ (shortDescription != null ? "shortDescription=" + shortDescription + ", " : "")
				+ (correlationDisplay != null ? "correlationDisplay=" + correlationDisplay + ", " : "")
				+ (uErrorCode != null ? "uErrorCode=" + uErrorCode + ", " : "")
				+ (workStart != null ? "workStart=" + workStart + ", " : "")
				+ (additionalAssigneeList != null ? "additionalAssigneeList=" + additionalAssigneeList + ", " : "")
				+ (notify != null ? "notify=" + notify + ", " : "")
				+ (serviceOffering != null ? "serviceOffering=" + serviceOffering + ", " : "")
				+ (sysClassName != null ? "sysClassName=" + sysClassName + ", " : "")
				+ (closedBy != null ? "closedBy=" + closedBy + ", " : "")
				+ (followUp != null ? "followUp=" + followUp + ", " : "")
				+ (parentIncident != null ? "parentIncident=" + parentIncident + ", " : "")
				+ (uCustomerEscalationTimestamp != null
						? "uCustomerEscalationTimestamp=" + uCustomerEscalationTimestamp + ", " : "")
				+ (uPlannedResponseDate != null ? "uPlannedResponseDate=" + uPlannedResponseDate + ", " : "")
				+ (vendor != null ? "vendor=" + vendor + ", " : "")
				+ (reassignmentCount != null ? "reassignmentCount=" + reassignmentCount + ", " : "")
				+ (uCreatedByTier1 != null ? "uCreatedByTier1=" + uCreatedByTier1 + ", " : "")
				+ (assignedTo != null ? "assignedTo=" + assignedTo + ", " : "")
				+ (uReportingSubcategory != null ? "uReportingSubcategory=" + uReportingSubcategory + ", " : "")
				+ (uWrongClassification != null ? "uWrongClassification=" + uWrongClassification + ", " : "")
				+ (uReportingIndicator != null ? "uReportingIndicator=" + uReportingIndicator + ", " : "")
				+ (slaDue != null ? "slaDue=" + slaDue + ", " : "")
				+ (uActualResponseDate != null ? "uActualResponseDate=" + uActualResponseDate + ", " : "")
				+ (commentsAndWorkNotes != null ? "commentsAndWorkNotes=" + commentsAndWorkNotes + ", " : "")
				+ (uSlaMet != null ? "uSlaMet=" + uSlaMet + ", " : "")
				+ (uCustomerConfirmationYN != null ? "uCustomerConfirmationYN=" + uCustomerConfirmationYN + ", " : "")
				+ (escalation != null ? "escalation=" + escalation + ", " : "")
				+ (uponApproval != null ? "uponApproval=" + uponApproval + ", " : "")
				+ (uLateralAssignment != null ? "uLateralAssignment=" + uLateralAssignment + ", " : "")
				+ (uServiceCategory != null ? "uServiceCategory=" + uServiceCategory + ", " : "")
				+ (correlationId != null ? "correlationId=" + correlationId + ", " : "")
				+ (uResolutionDuration != null ? "uResolutionDuration=" + uResolutionDuration + ", " : "")
				+ (uRequestedByName != null ? "uRequestedByName=" + uRequestedByName + ", " : "")
				+ (madeSla != null ? "madeSla=" + madeSla + ", " : "")
				+ (uMajorIncident != null ? "uMajorIncident=" + uMajorIncident + ", " : "")
				+ (uRequestedByEmail != null ? "uRequestedByEmail=" + uRequestedByEmail + ", " : "")
				+ (childIncidents != null ? "childIncidents=" + childIncidents + ", " : "")
				+ (holdReason != null ? "holdReason=" + holdReason + ", " : "")
				+ (resolvedBy != null ? "resolvedBy=" + resolvedBy + ", " : "")
				+ (uBusinessService != null ? "uBusinessService=" + uBusinessService + ", " : "")
				+ (sysUpdatedBy != null ? "sysUpdatedBy=" + sysUpdatedBy + ", " : "")
				+ (openedBy != null ? "openedBy=" + openedBy + ", " : "")
				+ (userInput != null ? "userInput=" + userInput + ", " : "")
				+ (sysCreatedOn != null ? "sysCreatedOn=" + sysCreatedOn + ", " : "")
				+ (sysDomain != null ? "sysDomain=" + sysDomain + ", " : "")
				+ (calendarStc != null ? "calendarStc=" + calendarStc + ", " : "")
				+ (closedAt != null ? "closedAt=" + closedAt + ", " : "")
				+ (uRelationship != null ? "uRelationship=" + uRelationship + ", " : "")
				+ (uRequestedByNotFound != null ? "uRequestedByNotFound=" + uRequestedByNotFound + ", " : "")
				+ (businessService != null ? "businessService=" + businessService + ", " : "")
				+ (uRequestedBy != null ? "uRequestedBy=" + uRequestedBy + ", " : "")
				+ (uEscalationRequestedBy != null ? "uEscalationRequestedBy=" + uEscalationRequestedBy + ", " : "")
				+ (uSymptom != null ? "uSymptom=" + uSymptom + ", " : "") + (rfc != null ? "rfc=" + rfc + ", " : "")
				+ (timeWorked != null ? "timeWorked=" + timeWorked + ", " : "")
				+ (expectedStart != null ? "expectedStart=" + expectedStart + ", " : "")
				+ (openedAt != null ? "openedAt=" + openedAt + ", " : "")
				+ (workEnd != null ? "workEnd=" + workEnd + ", " : "")
				+ (callerId != null ? "callerId=" + callerId + ", " : "")
				+ (resolvedAt != null ? "resolvedAt=" + resolvedAt + ", " : "")
				+ (uResolutionSummary != null ? "uResolutionSummary=" + uResolutionSummary + ", " : "")
				+ (subcategory != null ? "subcategory=" + subcategory + ", " : "")
				+ (uEscalationCustomer != null ? "uEscalationCustomer=" + uEscalationCustomer + ", " : "")
				+ (workNotes != null ? "workNotes=" + workNotes + ", " : "")
				+ (closeCode != null ? "closeCode=" + closeCode + ", " : "")
				+ (uSubContact != null ? "uSubContact=" + uSubContact + ", " : "")
				+ (assignmentGroup != null ? "assignmentGroup=" + assignmentGroup + ", " : "")
				+ (uKbArticle != null ? "uKbArticle=" + uKbArticle + ", " : "")
				+ (uAssetRedeployable != null ? "uAssetRedeployable=" + uAssetRedeployable + ", " : "")
				+ (businessStc != null ? "businessStc=" + businessStc + ", " : "")
				+ (description != null ? "description=" + description + ", " : "")
				+ (uFirstLineResolved != null ? "uFirstLineResolved=" + uFirstLineResolved + ", " : "")
				+ (uLegacyRgm != null ? "uLegacyRgm=" + uLegacyRgm + ", " : "")
				+ (uPlannedResolvedDate != null ? "uPlannedResolvedDate=" + uPlannedResolvedDate + ", " : "")
				+ (calendarDuration != null ? "calendarDuration=" + calendarDuration + ", " : "")
				+ (uOnHoldType != null ? "uOnHoldType=" + uOnHoldType + ", " : "")
				+ (closeNotes != null ? "closeNotes=" + closeNotes + ", " : "")
				+ (uStockroom != null ? "uStockroom=" + uStockroom + ", " : "")
				+ (sysId != null ? "sysId=" + sysId + ", " : "")
				+ (contactType != null ? "contactType=" + contactType + ", " : "")
				+ (incidentState != null ? "incidentState=" + incidentState + ", " : "")
				+ (urgency != null ? "urgency=" + urgency + ", " : "")
				+ (problemId != null ? "problemId=" + problemId + ", " : "")
				+ (uResponseDuration != null ? "uResponseDuration=" + uResponseDuration + ", " : "")
				+ (company != null ? "company=" + company + ", " : "")
				+ (activityDue != null ? "activityDue=" + activityDue + ", " : "")
				+ (severity != null ? "severity=" + severity + ", " : "")
				+ (uInStock != null ? "uInStock=" + uInStock + ", " : "")
				+ (comments != null ? "comments=" + comments + ", " : "")
				+ (approval != null ? "approval=" + approval + ", " : "")
				+ (uAssignedAboveTier1 != null ? "uAssignedAboveTier1=" + uAssignedAboveTier1 + ", " : "")
				+ (dueDate != null ? "dueDate=" + dueDate + ", " : "")
				+ (sysModCount != null ? "sysModCount=" + sysModCount + ", " : "")
				+ (reopenCount != null ? "reopenCount=" + reopenCount + ", " : "")
				+ (sysTags != null ? "sysTags=" + sysTags + ", " : "")
				+ (uFirstCallResolution != null ? "uFirstCallResolution=" + uFirstCallResolution + ", " : "")
				+ (location != null ? "location=" + location + ", " : "")
				+ (category != null ? "category=" + category + ", " : "")
				+ (uSetToP1 != null ? "uSetToP1=" + uSetToP1 + ", " : "")
				+ (additionalProperties != null ? "additionalProperties=" + additionalProperties : "") + "]";
	}

}
