
package com.poc.datamodel;

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
    private String caused_by;
    @JsonProperty("watch_list")
    private String watch_list;
    @JsonProperty("u_call_back_number")
    private String u_call_back_number;
    @JsonProperty("upon_reject")
    private String upon_reject;
    @JsonProperty("sys_updated_on")
    private String sys_updated_on;
    @JsonProperty("u_resolved_by_tier_1")
    private String u_resolved_by_tier_1;
    @JsonProperty("u_ud_parent")
    private String u_ud_parent;
    @JsonProperty("u_resolved_within_1_hour")
    private String u_resolved_within_1_hour;
    @JsonProperty("u_routing_rule")
    private U_routing_rule u_routing_rule;
    @JsonProperty("approval_history")
    private String approval_history;
    @JsonProperty("skills")
    private String skills;
    @JsonProperty("number")
    private String number;
    @JsonProperty("u_actual_resolution_date")
    private String u_actual_resolution_date;
    @JsonProperty("u_technical_service")
    private String u_technical_service;
    @JsonProperty("state")
    private String state;
    @JsonProperty("sys_created_by")
    private String sys_created_by;
    @JsonProperty("knowledge")
    private String knowledge;
    @JsonProperty("order")
    private String order;
    @JsonProperty("cmdb_ci")
    private String cmdb_ci;
    @JsonProperty("impact")
    private String impact;
    @JsonProperty("u_requested_for")
    private U_requested_for u_requested_for;
    @JsonProperty("active")
    private String active;
    @JsonProperty("work_notes_list")
    private String work_notes_list;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("sys_domain_path")
    private String sys_domain_path;
    @JsonProperty("u_hidden_data")
    private String u_hidden_data;
    @JsonProperty("business_duration")
    private String business_duration;
    @JsonProperty("group_list")
    private String group_list;
    @JsonProperty("u_reopened")
    private String u_reopened;
    @JsonProperty("u_template")
    private String u_template;
    @JsonProperty("u_protocol_not_followed")
    private String u_protocol_not_followed;
    @JsonProperty("approval_set")
    private String approval_set;
    @JsonProperty("u_incident_state_count")
    private String u_incident_state_count;
    @JsonProperty("u_contact_number_effort")
    private String u_contact_number_effort;
    @JsonProperty("u_requested_by_phone")
    private String u_requested_by_phone;
    @JsonProperty("short_description")
    private String short_description;
    @JsonProperty("correlation_display")
    private String correlation_display;
    @JsonProperty("u_error_code")
    private Object u_error_code;
    @JsonProperty("work_start")
    private String work_start;
    @JsonProperty("additional_assignee_list")
    private String additional_assignee_list;
    @JsonProperty("notify")
    private String notify;
    @JsonProperty("service_offering")
    private String service_offering;
    @JsonProperty("sys_class_name")
    private String sys_class_name;
    @JsonProperty("closed_by")
    private Closed_by closed_by;
    @JsonProperty("follow_up")
    private String follow_up;
    @JsonProperty("parent_incident")
    private Parent_incident parent_incident;
    @JsonProperty("u_customer_escalation_timestamp")
    private String u_customer_escalation_timestamp;
    @JsonProperty("u_planned_response_date")
    private String u_planned_response_date;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("reassignment_count")
    private String reassignment_count;
    @JsonProperty("u_created_by_tier_1")
    private String u_created_by_tier_1;
    @JsonProperty("assigned_to")
    private String assigned_to;
    @JsonProperty("u_reporting_subcategory")
    private Object u_reporting_subcategory;
    @JsonProperty("u_wrong_classification")
    private String u_wrong_classification;
    @JsonProperty("u_reporting_indicator")
    private Object u_reporting_indicator;
    @JsonProperty("sla_due")
    private String sla_due;
    @JsonProperty("u_actual_response_date")
    private String u_actual_response_date;
    @JsonProperty("comments_and_work_notes")
    private String comments_and_work_notes;
    @JsonProperty("u_sla_met")
    private String u_sla_met;
    @JsonProperty("u_customer_confirmation_y_n")
    private String u_customer_confirmation_y_n;
    @JsonProperty("escalation")
    private String escalation;
    @JsonProperty("upon_approval")
    private String upon_approval;
    @JsonProperty("u_lateral_assignment")
    private String u_lateral_assignment;
    @JsonProperty("u_service_category")
    private U_service_category u_service_category;
    @JsonProperty("correlation_id")
    private String correlation_id;
    @JsonProperty("u_resolution_duration")
    private String u_resolution_duration;
    @JsonProperty("u_requested_by_name")
    private String u_requested_by_name;
    @JsonProperty("made_sla")
    private String made_sla;
    @JsonProperty("u_major_incident")
    private String u_major_incident;
    @JsonProperty("u_requested_by_email")
    private String u_requested_by_email;
    @JsonProperty("child_incidents")
    private String child_incidents;
    @JsonProperty("hold_reason")
    private String hold_reason;
    @JsonProperty("resolved_by")
    private Resolved_by resolved_by;
    @JsonProperty("u_business_service")
    private U_business_service u_business_service;
    @JsonProperty("sys_updated_by")
    private String sys_updated_by;
    @JsonProperty("opened_by")
    private Opened_by opened_by;
    @JsonProperty("user_input")
    private String user_input;
    @JsonProperty("sys_created_on")
    private String sys_created_on;
    @JsonProperty("sys_domain")
    private Sys_domain sys_domain;
    @JsonProperty("calendar_stc")
    private String calendar_stc;
    @JsonProperty("closed_at")
    private String closed_at;
    @JsonProperty("u_relationship")
    private Object u_relationship;
    @JsonProperty("u_requested_by_not_found")
    private String u_requested_by_not_found;
    @JsonProperty("business_service")
    private Business_service business_service;
    @JsonProperty("u_requested_by")
    private U_requested_by u_requested_by;
    @JsonProperty("u_escalation_requested_by")
    private String u_escalation_requested_by;
    @JsonProperty("u_symptom")
    private U_symptom u_symptom;
    @JsonProperty("rfc")
    private String rfc;
    @JsonProperty("time_worked")
    private String time_worked;
    @JsonProperty("expected_start")
    private String expected_start;
    @JsonProperty("opened_at")
    private String opened_at;
    @JsonProperty("work_end")
    private String work_end;
    @JsonProperty("caller_id")
    private Caller_id caller_id;
    @JsonProperty("resolved_at")
    private String resolved_at;
    @JsonProperty("u_resolution_summary")
    private String u_resolution_summary;
    @JsonProperty("subcategory")
    private Object subcategory;
    @JsonProperty("u_escalation_customer")
    private Object u_escalation_customer;
    @JsonProperty("work_notes")
    private String work_notes;
    @JsonProperty("close_code")
    private String close_code;
    @JsonProperty("u_sub_contact")
    private Object u_sub_contact;
    @JsonProperty("assignment_group")
    private Assignment_group assignment_group;
    @JsonProperty("u_kb_article")
    private String u_kb_article;
    @JsonProperty("u_asset_redeployable")
    private Object u_asset_redeployable;
    @JsonProperty("business_stc")
    private String business_stc;
    @JsonProperty("description")
    private String description;
    @JsonProperty("u_first_line_resolved")
    private String u_first_line_resolved;
    @JsonProperty("u_legacy_rgm")
    private String u_legacy_rgm;
    @JsonProperty("u_planned_resolved_date")
    private String u_planned_resolved_date;
    @JsonProperty("calendar_duration")
    private String calendar_duration;
    @JsonProperty("u_on_hold_type")
    private Object u_on_hold_type;
    @JsonProperty("close_notes")
    private String close_notes;
    @JsonProperty("u_stockroom")
    private String u_stockroom;
    @JsonProperty("sys_id")
    private String sys_id;
    @JsonProperty("contact_type")
    private String contact_type;
    @JsonProperty("incident_state")
    private String incident_state;
    @JsonProperty("urgency")
    private String urgency;
    @JsonProperty("problem_id")
    private String problem_id;
    @JsonProperty("u_response_duration")
    private String u_response_duration;
    @JsonProperty("company")
    private Company company;
    @JsonProperty("activity_due")
    private String activity_due;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("u_in_stock")
    private Object u_in_stock;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("approval")
    private String approval;
    @JsonProperty("u_assigned_above_tier_1")
    private String u_assigned_above_tier_1;
    @JsonProperty("due_date")
    private String due_date;
    @JsonProperty("sys_mod_count")
    private String sys_mod_count;
    @JsonProperty("reopen_count")
    private String reopen_count;
    @JsonProperty("sys_tags")
    private String sys_tags;
    @JsonProperty("u_first_call_resolution")
    private String u_first_call_resolution;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("category")
    private String category;
    @JsonProperty("u_set_to_p1")
    private String u_set_to_p1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6209478189301877133L;

    @JsonProperty("parent")
    public Parent getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @JsonProperty("caused_by")
    public String getCaused_by() {
        return caused_by;
    }

    @JsonProperty("caused_by")
    public void setCaused_by(String caused_by) {
        this.caused_by = caused_by;
    }

    @JsonProperty("watch_list")
    public String getWatch_list() {
        return watch_list;
    }

    @JsonProperty("watch_list")
    public void setWatch_list(String watch_list) {
        this.watch_list = watch_list;
    }

    @JsonProperty("u_call_back_number")
    public String getU_call_back_number() {
        return u_call_back_number;
    }

    @JsonProperty("u_call_back_number")
    public void setU_call_back_number(String u_call_back_number) {
        this.u_call_back_number = u_call_back_number;
    }

    @JsonProperty("upon_reject")
    public String getUpon_reject() {
        return upon_reject;
    }

    @JsonProperty("upon_reject")
    public void setUpon_reject(String upon_reject) {
        this.upon_reject = upon_reject;
    }

    @JsonProperty("sys_updated_on")
    public String getSys_updated_on() {
        return sys_updated_on;
    }

    @JsonProperty("sys_updated_on")
    public void setSys_updated_on(String sys_updated_on) {
        this.sys_updated_on = sys_updated_on;
    }

    @JsonProperty("u_resolved_by_tier_1")
    public String getU_resolved_by_tier_1() {
        return u_resolved_by_tier_1;
    }

    @JsonProperty("u_resolved_by_tier_1")
    public void setU_resolved_by_tier_1(String u_resolved_by_tier_1) {
        this.u_resolved_by_tier_1 = u_resolved_by_tier_1;
    }

    @JsonProperty("u_ud_parent")
    public String getU_ud_parent() {
        return u_ud_parent;
    }

    @JsonProperty("u_ud_parent")
    public void setU_ud_parent(String u_ud_parent) {
        this.u_ud_parent = u_ud_parent;
    }

    @JsonProperty("u_resolved_within_1_hour")
    public String getU_resolved_within_1_hour() {
        return u_resolved_within_1_hour;
    }

    @JsonProperty("u_resolved_within_1_hour")
    public void setU_resolved_within_1_hour(String u_resolved_within_1_hour) {
        this.u_resolved_within_1_hour = u_resolved_within_1_hour;
    }

    @JsonProperty("u_routing_rule")
    public U_routing_rule getU_routing_rule() {
        return u_routing_rule;
    }

    @JsonProperty("u_routing_rule")
    public void setU_routing_rule(U_routing_rule u_routing_rule) {
        this.u_routing_rule = u_routing_rule;
    }

    @JsonProperty("approval_history")
    public String getApproval_history() {
        return approval_history;
    }

    @JsonProperty("approval_history")
    public void setApproval_history(String approval_history) {
        this.approval_history = approval_history;
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
    public String getU_actual_resolution_date() {
        return u_actual_resolution_date;
    }

    @JsonProperty("u_actual_resolution_date")
    public void setU_actual_resolution_date(String u_actual_resolution_date) {
        this.u_actual_resolution_date = u_actual_resolution_date;
    }

    @JsonProperty("u_technical_service")
    public String getU_technical_service() {
        return u_technical_service;
    }

    @JsonProperty("u_technical_service")
    public void setU_technical_service(String u_technical_service) {
        this.u_technical_service = u_technical_service;
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
    public String getSys_created_by() {
        return sys_created_by;
    }

    @JsonProperty("sys_created_by")
    public void setSys_created_by(String sys_created_by) {
        this.sys_created_by = sys_created_by;
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
    public String getCmdb_ci() {
        return cmdb_ci;
    }

    @JsonProperty("cmdb_ci")
    public void setCmdb_ci(String cmdb_ci) {
        this.cmdb_ci = cmdb_ci;
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
    public U_requested_for getU_requested_for() {
        return u_requested_for;
    }

    @JsonProperty("u_requested_for")
    public void setU_requested_for(U_requested_for u_requested_for) {
        this.u_requested_for = u_requested_for;
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
    public String getWork_notes_list() {
        return work_notes_list;
    }

    @JsonProperty("work_notes_list")
    public void setWork_notes_list(String work_notes_list) {
        this.work_notes_list = work_notes_list;
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
    public String getSys_domain_path() {
        return sys_domain_path;
    }

    @JsonProperty("sys_domain_path")
    public void setSys_domain_path(String sys_domain_path) {
        this.sys_domain_path = sys_domain_path;
    }

    @JsonProperty("u_hidden_data")
    public String getU_hidden_data() {
        return u_hidden_data;
    }

    @JsonProperty("u_hidden_data")
    public void setU_hidden_data(String u_hidden_data) {
        this.u_hidden_data = u_hidden_data;
    }

    @JsonProperty("business_duration")
    public String getBusiness_duration() {
        return business_duration;
    }

    @JsonProperty("business_duration")
    public void setBusiness_duration(String business_duration) {
        this.business_duration = business_duration;
    }

    @JsonProperty("group_list")
    public String getGroup_list() {
        return group_list;
    }

    @JsonProperty("group_list")
    public void setGroup_list(String group_list) {
        this.group_list = group_list;
    }

    @JsonProperty("u_reopened")
    public String getU_reopened() {
        return u_reopened;
    }

    @JsonProperty("u_reopened")
    public void setU_reopened(String u_reopened) {
        this.u_reopened = u_reopened;
    }

    @JsonProperty("u_template")
    public String getU_template() {
        return u_template;
    }

    @JsonProperty("u_template")
    public void setU_template(String u_template) {
        this.u_template = u_template;
    }

    @JsonProperty("u_protocol_not_followed")
    public String getU_protocol_not_followed() {
        return u_protocol_not_followed;
    }

    @JsonProperty("u_protocol_not_followed")
    public void setU_protocol_not_followed(String u_protocol_not_followed) {
        this.u_protocol_not_followed = u_protocol_not_followed;
    }

    @JsonProperty("approval_set")
    public String getApproval_set() {
        return approval_set;
    }

    @JsonProperty("approval_set")
    public void setApproval_set(String approval_set) {
        this.approval_set = approval_set;
    }

    @JsonProperty("u_incident_state_count")
    public String getU_incident_state_count() {
        return u_incident_state_count;
    }

    @JsonProperty("u_incident_state_count")
    public void setU_incident_state_count(String u_incident_state_count) {
        this.u_incident_state_count = u_incident_state_count;
    }

    @JsonProperty("u_contact_number_effort")
    public String getU_contact_number_effort() {
        return u_contact_number_effort;
    }

    @JsonProperty("u_contact_number_effort")
    public void setU_contact_number_effort(String u_contact_number_effort) {
        this.u_contact_number_effort = u_contact_number_effort;
    }

    @JsonProperty("u_requested_by_phone")
    public String getU_requested_by_phone() {
        return u_requested_by_phone;
    }

    @JsonProperty("u_requested_by_phone")
    public void setU_requested_by_phone(String u_requested_by_phone) {
        this.u_requested_by_phone = u_requested_by_phone;
    }

    @JsonProperty("short_description")
    public String getShort_description() {
        return short_description;
    }

    @JsonProperty("short_description")
    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    @JsonProperty("correlation_display")
    public String getCorrelation_display() {
        return correlation_display;
    }

    @JsonProperty("correlation_display")
    public void setCorrelation_display(String correlation_display) {
        this.correlation_display = correlation_display;
    }

    @JsonProperty("u_error_code")
    public Object getU_error_code() {
        return u_error_code;
    }

    @JsonProperty("u_error_code")
    public void setU_error_code(Object u_error_code) {
        this.u_error_code = u_error_code;
    }

    @JsonProperty("work_start")
    public String getWork_start() {
        return work_start;
    }

    @JsonProperty("work_start")
    public void setWork_start(String work_start) {
        this.work_start = work_start;
    }

    @JsonProperty("additional_assignee_list")
    public String getAdditional_assignee_list() {
        return additional_assignee_list;
    }

    @JsonProperty("additional_assignee_list")
    public void setAdditional_assignee_list(String additional_assignee_list) {
        this.additional_assignee_list = additional_assignee_list;
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
    public String getService_offering() {
        return service_offering;
    }

    @JsonProperty("service_offering")
    public void setService_offering(String service_offering) {
        this.service_offering = service_offering;
    }

    @JsonProperty("sys_class_name")
    public String getSys_class_name() {
        return sys_class_name;
    }

    @JsonProperty("sys_class_name")
    public void setSys_class_name(String sys_class_name) {
        this.sys_class_name = sys_class_name;
    }

    @JsonProperty("closed_by")
    public Closed_by getClosed_by() {
        return closed_by;
    }

    @JsonProperty("closed_by")
    public void setClosed_by(Closed_by closed_by) {
        this.closed_by = closed_by;
    }

    @JsonProperty("follow_up")
    public String getFollow_up() {
        return follow_up;
    }

    @JsonProperty("follow_up")
    public void setFollow_up(String follow_up) {
        this.follow_up = follow_up;
    }

    @JsonProperty("parent_incident")
    public Parent_incident getParent_incident() {
        return parent_incident;
    }

    @JsonProperty("parent_incident")
    public void setParent_incident(Parent_incident parent_incident) {
        this.parent_incident = parent_incident;
    }

    @JsonProperty("u_customer_escalation_timestamp")
    public String getU_customer_escalation_timestamp() {
        return u_customer_escalation_timestamp;
    }

    @JsonProperty("u_customer_escalation_timestamp")
    public void setU_customer_escalation_timestamp(String u_customer_escalation_timestamp) {
        this.u_customer_escalation_timestamp = u_customer_escalation_timestamp;
    }

    @JsonProperty("u_planned_response_date")
    public String getU_planned_response_date() {
        return u_planned_response_date;
    }

    @JsonProperty("u_planned_response_date")
    public void setU_planned_response_date(String u_planned_response_date) {
        this.u_planned_response_date = u_planned_response_date;
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
    public String getReassignment_count() {
        return reassignment_count;
    }

    @JsonProperty("reassignment_count")
    public void setReassignment_count(String reassignment_count) {
        this.reassignment_count = reassignment_count;
    }

    @JsonProperty("u_created_by_tier_1")
    public String getU_created_by_tier_1() {
        return u_created_by_tier_1;
    }

    @JsonProperty("u_created_by_tier_1")
    public void setU_created_by_tier_1(String u_created_by_tier_1) {
        this.u_created_by_tier_1 = u_created_by_tier_1;
    }

    @JsonProperty("assigned_to")
    public String getAssigned_to() {
        return assigned_to;
    }

    @JsonProperty("assigned_to")
    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    @JsonProperty("u_reporting_subcategory")
    public Object getU_reporting_subcategory() {
        return u_reporting_subcategory;
    }

    @JsonProperty("u_reporting_subcategory")
    public void setU_reporting_subcategory(Object u_reporting_subcategory) {
        this.u_reporting_subcategory = u_reporting_subcategory;
    }

    @JsonProperty("u_wrong_classification")
    public String getU_wrong_classification() {
        return u_wrong_classification;
    }

    @JsonProperty("u_wrong_classification")
    public void setU_wrong_classification(String u_wrong_classification) {
        this.u_wrong_classification = u_wrong_classification;
    }

    @JsonProperty("u_reporting_indicator")
    public Object getU_reporting_indicator() {
        return u_reporting_indicator;
    }

    @JsonProperty("u_reporting_indicator")
    public void setU_reporting_indicator(Object u_reporting_indicator) {
        this.u_reporting_indicator = u_reporting_indicator;
    }

    @JsonProperty("sla_due")
    public String getSla_due() {
        return sla_due;
    }

    @JsonProperty("sla_due")
    public void setSla_due(String sla_due) {
        this.sla_due = sla_due;
    }

    @JsonProperty("u_actual_response_date")
    public String getU_actual_response_date() {
        return u_actual_response_date;
    }

    @JsonProperty("u_actual_response_date")
    public void setU_actual_response_date(String u_actual_response_date) {
        this.u_actual_response_date = u_actual_response_date;
    }

    @JsonProperty("comments_and_work_notes")
    public String getComments_and_work_notes() {
        return comments_and_work_notes;
    }

    @JsonProperty("comments_and_work_notes")
    public void setComments_and_work_notes(String comments_and_work_notes) {
        this.comments_and_work_notes = comments_and_work_notes;
    }

    @JsonProperty("u_sla_met")
    public String getU_sla_met() {
        return u_sla_met;
    }

    @JsonProperty("u_sla_met")
    public void setU_sla_met(String u_sla_met) {
        this.u_sla_met = u_sla_met;
    }

    @JsonProperty("u_customer_confirmation_y_n")
    public String getU_customer_confirmation_y_n() {
        return u_customer_confirmation_y_n;
    }

    @JsonProperty("u_customer_confirmation_y_n")
    public void setU_customer_confirmation_y_n(String u_customer_confirmation_y_n) {
        this.u_customer_confirmation_y_n = u_customer_confirmation_y_n;
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
    public String getUpon_approval() {
        return upon_approval;
    }

    @JsonProperty("upon_approval")
    public void setUpon_approval(String upon_approval) {
        this.upon_approval = upon_approval;
    }

    @JsonProperty("u_lateral_assignment")
    public String getU_lateral_assignment() {
        return u_lateral_assignment;
    }

    @JsonProperty("u_lateral_assignment")
    public void setU_lateral_assignment(String u_lateral_assignment) {
        this.u_lateral_assignment = u_lateral_assignment;
    }

    @JsonProperty("u_service_category")
    public U_service_category getU_service_category() {
        return u_service_category;
    }

    @JsonProperty("u_service_category")
    public void setU_service_category(U_service_category u_service_category) {
        this.u_service_category = u_service_category;
    }

    @JsonProperty("correlation_id")
    public String getCorrelation_id() {
        return correlation_id;
    }

    @JsonProperty("correlation_id")
    public void setCorrelation_id(String correlation_id) {
        this.correlation_id = correlation_id;
    }

    @JsonProperty("u_resolution_duration")
    public String getU_resolution_duration() {
        return u_resolution_duration;
    }

    @JsonProperty("u_resolution_duration")
    public void setU_resolution_duration(String u_resolution_duration) {
        this.u_resolution_duration = u_resolution_duration;
    }

    @JsonProperty("u_requested_by_name")
    public String getU_requested_by_name() {
        return u_requested_by_name;
    }

    @JsonProperty("u_requested_by_name")
    public void setU_requested_by_name(String u_requested_by_name) {
        this.u_requested_by_name = u_requested_by_name;
    }

    @JsonProperty("made_sla")
    public String getMade_sla() {
        return made_sla;
    }

    @JsonProperty("made_sla")
    public void setMade_sla(String made_sla) {
        this.made_sla = made_sla;
    }

    @JsonProperty("u_major_incident")
    public String getU_major_incident() {
        return u_major_incident;
    }

    @JsonProperty("u_major_incident")
    public void setU_major_incident(String u_major_incident) {
        this.u_major_incident = u_major_incident;
    }

    @JsonProperty("u_requested_by_email")
    public String getU_requested_by_email() {
        return u_requested_by_email;
    }

    @JsonProperty("u_requested_by_email")
    public void setU_requested_by_email(String u_requested_by_email) {
        this.u_requested_by_email = u_requested_by_email;
    }

    @JsonProperty("child_incidents")
    public String getChild_incidents() {
        return child_incidents;
    }

    @JsonProperty("child_incidents")
    public void setChild_incidents(String child_incidents) {
        this.child_incidents = child_incidents;
    }

    @JsonProperty("hold_reason")
    public String getHold_reason() {
        return hold_reason;
    }

    @JsonProperty("hold_reason")
    public void setHold_reason(String hold_reason) {
        this.hold_reason = hold_reason;
    }

    @JsonProperty("resolved_by")
    public Resolved_by getResolved_by() {
        return resolved_by;
    }

    @JsonProperty("resolved_by")
    public void setResolved_by(Resolved_by resolved_by) {
        this.resolved_by = resolved_by;
    }

    @JsonProperty("u_business_service")
    public U_business_service getU_business_service() {
        return u_business_service;
    }

    @JsonProperty("u_business_service")
    public void setU_business_service(U_business_service u_business_service) {
        this.u_business_service = u_business_service;
    }

    @JsonProperty("sys_updated_by")
    public String getSys_updated_by() {
        return sys_updated_by;
    }

    @JsonProperty("sys_updated_by")
    public void setSys_updated_by(String sys_updated_by) {
        this.sys_updated_by = sys_updated_by;
    }

    @JsonProperty("opened_by")
    public Opened_by getOpened_by() {
        return opened_by;
    }

    @JsonProperty("opened_by")
    public void setOpened_by(Opened_by opened_by) {
        this.opened_by = opened_by;
    }

    @JsonProperty("user_input")
    public String getUser_input() {
        return user_input;
    }

    @JsonProperty("user_input")
    public void setUser_input(String user_input) {
        this.user_input = user_input;
    }

    @JsonProperty("sys_created_on")
    public String getSys_created_on() {
        return sys_created_on;
    }

    @JsonProperty("sys_created_on")
    public void setSys_created_on(String sys_created_on) {
        this.sys_created_on = sys_created_on;
    }

    @JsonProperty("sys_domain")
    public Sys_domain getSys_domain() {
        return sys_domain;
    }

    @JsonProperty("sys_domain")
    public void setSys_domain(Sys_domain sys_domain) {
        this.sys_domain = sys_domain;
    }

    @JsonProperty("calendar_stc")
    public String getCalendar_stc() {
        return calendar_stc;
    }

    @JsonProperty("calendar_stc")
    public void setCalendar_stc(String calendar_stc) {
        this.calendar_stc = calendar_stc;
    }

    @JsonProperty("closed_at")
    public String getClosed_at() {
        return closed_at;
    }

    @JsonProperty("closed_at")
    public void setClosed_at(String closed_at) {
        this.closed_at = closed_at;
    }

    @JsonProperty("u_relationship")
    public Object getU_relationship() {
        return u_relationship;
    }

    @JsonProperty("u_relationship")
    public void setU_relationship(Object u_relationship) {
        this.u_relationship = u_relationship;
    }

    @JsonProperty("u_requested_by_not_found")
    public String getU_requested_by_not_found() {
        return u_requested_by_not_found;
    }

    @JsonProperty("u_requested_by_not_found")
    public void setU_requested_by_not_found(String u_requested_by_not_found) {
        this.u_requested_by_not_found = u_requested_by_not_found;
    }

    @JsonProperty("business_service")
    public Business_service getBusiness_service() {
        return business_service;
    }

    @JsonProperty("business_service")
    public void setBusiness_service(Business_service business_service) {
        this.business_service = business_service;
    }

    @JsonProperty("u_requested_by")
    public U_requested_by getU_requested_by() {
        return u_requested_by;
    }

    @JsonProperty("u_requested_by")
    public void setU_requested_by(U_requested_by u_requested_by) {
        this.u_requested_by = u_requested_by;
    }

    @JsonProperty("u_escalation_requested_by")
    public String getU_escalation_requested_by() {
        return u_escalation_requested_by;
    }

    @JsonProperty("u_escalation_requested_by")
    public void setU_escalation_requested_by(String u_escalation_requested_by) {
        this.u_escalation_requested_by = u_escalation_requested_by;
    }

    @JsonProperty("u_symptom")
    public U_symptom getU_symptom() {
        return u_symptom;
    }

    @JsonProperty("u_symptom")
    public void setU_symptom(U_symptom u_symptom) {
        this.u_symptom = u_symptom;
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
    public String getTime_worked() {
        return time_worked;
    }

    @JsonProperty("time_worked")
    public void setTime_worked(String time_worked) {
        this.time_worked = time_worked;
    }

    @JsonProperty("expected_start")
    public String getExpected_start() {
        return expected_start;
    }

    @JsonProperty("expected_start")
    public void setExpected_start(String expected_start) {
        this.expected_start = expected_start;
    }

    @JsonProperty("opened_at")
    public String getOpened_at() {
        return opened_at;
    }

    @JsonProperty("opened_at")
    public void setOpened_at(String opened_at) {
        this.opened_at = opened_at;
    }

    @JsonProperty("work_end")
    public String getWork_end() {
        return work_end;
    }

    @JsonProperty("work_end")
    public void setWork_end(String work_end) {
        this.work_end = work_end;
    }

    @JsonProperty("caller_id")
    public Caller_id getCaller_id() {
        return caller_id;
    }

    @JsonProperty("caller_id")
    public void setCaller_id(Caller_id caller_id) {
        this.caller_id = caller_id;
    }

    @JsonProperty("resolved_at")
    public String getResolved_at() {
        return resolved_at;
    }

    @JsonProperty("resolved_at")
    public void setResolved_at(String resolved_at) {
        this.resolved_at = resolved_at;
    }

    @JsonProperty("u_resolution_summary")
    public String getU_resolution_summary() {
        return u_resolution_summary;
    }

    @JsonProperty("u_resolution_summary")
    public void setU_resolution_summary(String u_resolution_summary) {
        this.u_resolution_summary = u_resolution_summary;
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
    public Object getU_escalation_customer() {
        return u_escalation_customer;
    }

    @JsonProperty("u_escalation_customer")
    public void setU_escalation_customer(Object u_escalation_customer) {
        this.u_escalation_customer = u_escalation_customer;
    }

    @JsonProperty("work_notes")
    public String getWork_notes() {
        return work_notes;
    }

    @JsonProperty("work_notes")
    public void setWork_notes(String work_notes) {
        this.work_notes = work_notes;
    }

    @JsonProperty("close_code")
    public String getClose_code() {
        return close_code;
    }

    @JsonProperty("close_code")
    public void setClose_code(String close_code) {
        this.close_code = close_code;
    }

    @JsonProperty("u_sub_contact")
    public Object getU_sub_contact() {
        return u_sub_contact;
    }

    @JsonProperty("u_sub_contact")
    public void setU_sub_contact(Object u_sub_contact) {
        this.u_sub_contact = u_sub_contact;
    }

    @JsonProperty("assignment_group")
    public Assignment_group getAssignment_group() {
        return assignment_group;
    }

    @JsonProperty("assignment_group")
    public void setAssignment_group(Assignment_group assignment_group) {
        this.assignment_group = assignment_group;
    }

    @JsonProperty("u_kb_article")
    public String getU_kb_article() {
        return u_kb_article;
    }

    @JsonProperty("u_kb_article")
    public void setU_kb_article(String u_kb_article) {
        this.u_kb_article = u_kb_article;
    }

    @JsonProperty("u_asset_redeployable")
    public Object getU_asset_redeployable() {
        return u_asset_redeployable;
    }

    @JsonProperty("u_asset_redeployable")
    public void setU_asset_redeployable(Object u_asset_redeployable) {
        this.u_asset_redeployable = u_asset_redeployable;
    }

    @JsonProperty("business_stc")
    public String getBusiness_stc() {
        return business_stc;
    }

    @JsonProperty("business_stc")
    public void setBusiness_stc(String business_stc) {
        this.business_stc = business_stc;
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
    public String getU_first_line_resolved() {
        return u_first_line_resolved;
    }

    @JsonProperty("u_first_line_resolved")
    public void setU_first_line_resolved(String u_first_line_resolved) {
        this.u_first_line_resolved = u_first_line_resolved;
    }

    @JsonProperty("u_legacy_rgm")
    public String getU_legacy_rgm() {
        return u_legacy_rgm;
    }

    @JsonProperty("u_legacy_rgm")
    public void setU_legacy_rgm(String u_legacy_rgm) {
        this.u_legacy_rgm = u_legacy_rgm;
    }

    @JsonProperty("u_planned_resolved_date")
    public String getU_planned_resolved_date() {
        return u_planned_resolved_date;
    }

    @JsonProperty("u_planned_resolved_date")
    public void setU_planned_resolved_date(String u_planned_resolved_date) {
        this.u_planned_resolved_date = u_planned_resolved_date;
    }

    @JsonProperty("calendar_duration")
    public String getCalendar_duration() {
        return calendar_duration;
    }

    @JsonProperty("calendar_duration")
    public void setCalendar_duration(String calendar_duration) {
        this.calendar_duration = calendar_duration;
    }

    @JsonProperty("u_on_hold_type")
    public Object getU_on_hold_type() {
        return u_on_hold_type;
    }

    @JsonProperty("u_on_hold_type")
    public void setU_on_hold_type(Object u_on_hold_type) {
        this.u_on_hold_type = u_on_hold_type;
    }

    @JsonProperty("close_notes")
    public String getClose_notes() {
        return close_notes;
    }

    @JsonProperty("close_notes")
    public void setClose_notes(String close_notes) {
        this.close_notes = close_notes;
    }

    @JsonProperty("u_stockroom")
    public String getU_stockroom() {
        return u_stockroom;
    }

    @JsonProperty("u_stockroom")
    public void setU_stockroom(String u_stockroom) {
        this.u_stockroom = u_stockroom;
    }

    @JsonProperty("sys_id")
    public String getSys_id() {
        return sys_id;
    }

    @JsonProperty("sys_id")
    public void setSys_id(String sys_id) {
        this.sys_id = sys_id;
    }

    @JsonProperty("contact_type")
    public String getContact_type() {
        return contact_type;
    }

    @JsonProperty("contact_type")
    public void setContact_type(String contact_type) {
        this.contact_type = contact_type;
    }

    @JsonProperty("incident_state")
    public String getIncident_state() {
        return incident_state;
    }

    @JsonProperty("incident_state")
    public void setIncident_state(String incident_state) {
        this.incident_state = incident_state;
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
    public String getProblem_id() {
        return problem_id;
    }

    @JsonProperty("problem_id")
    public void setProblem_id(String problem_id) {
        this.problem_id = problem_id;
    }

    @JsonProperty("u_response_duration")
    public String getU_response_duration() {
        return u_response_duration;
    }

    @JsonProperty("u_response_duration")
    public void setU_response_duration(String u_response_duration) {
        this.u_response_duration = u_response_duration;
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
    public String getActivity_due() {
        return activity_due;
    }

    @JsonProperty("activity_due")
    public void setActivity_due(String activity_due) {
        this.activity_due = activity_due;
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
    public Object getU_in_stock() {
        return u_in_stock;
    }

    @JsonProperty("u_in_stock")
    public void setU_in_stock(Object u_in_stock) {
        this.u_in_stock = u_in_stock;
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
    public String getU_assigned_above_tier_1() {
        return u_assigned_above_tier_1;
    }

    @JsonProperty("u_assigned_above_tier_1")
    public void setU_assigned_above_tier_1(String u_assigned_above_tier_1) {
        this.u_assigned_above_tier_1 = u_assigned_above_tier_1;
    }

    @JsonProperty("due_date")
    public String getDue_date() {
        return due_date;
    }

    @JsonProperty("due_date")
    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    @JsonProperty("sys_mod_count")
    public String getSys_mod_count() {
        return sys_mod_count;
    }

    @JsonProperty("sys_mod_count")
    public void setSys_mod_count(String sys_mod_count) {
        this.sys_mod_count = sys_mod_count;
    }

    @JsonProperty("reopen_count")
    public String getReopen_count() {
        return reopen_count;
    }

    @JsonProperty("reopen_count")
    public void setReopen_count(String reopen_count) {
        this.reopen_count = reopen_count;
    }

    @JsonProperty("sys_tags")
    public String getSys_tags() {
        return sys_tags;
    }

    @JsonProperty("sys_tags")
    public void setSys_tags(String sys_tags) {
        this.sys_tags = sys_tags;
    }

    @JsonProperty("u_first_call_resolution")
    public String getU_first_call_resolution() {
        return u_first_call_resolution;
    }

    @JsonProperty("u_first_call_resolution")
    public void setU_first_call_resolution(String u_first_call_resolution) {
        this.u_first_call_resolution = u_first_call_resolution;
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
    public String getU_set_to_p1() {
        return u_set_to_p1;
    }

    @JsonProperty("u_set_to_p1")
    public void setU_set_to_p1(String u_set_to_p1) {
        this.u_set_to_p1 = u_set_to_p1;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
