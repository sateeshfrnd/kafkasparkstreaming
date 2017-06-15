
package com.poc.datamodel;

import java.io.Serializable;

public class ServiceNowModel implements Serializable
{

    private Parent parent;
    private String caused_by;
    private String watch_list;
    private String u_call_back_number;
    private String upon_reject;
    private String sys_updated_on;
    private String u_resolved_by_tier_1;
    private String u_ud_parent;
    private String u_resolved_within_1_hour;
    private U_routing_rule u_routing_rule;
    private String approval_history;
    private String skills;
    private String number;
    private String u_actual_resolution_date;
    private String u_technical_service;
    private String state;
    private String sys_created_by;
    private String knowledge;
    private String order;
    private String cmdb_ci;
    private String impact;
    private U_requested_for u_requested_for;
    private String active;
    private String work_notes_list;
    private String priority;
    private String sys_domain_path;
    private String u_hidden_data;
    private String business_duration;
    private String group_list;
    private String u_reopened;
    private String u_template;
    private String u_protocol_not_followed;
    private String approval_set;
    private String u_incident_state_count;
    private String u_contact_number_effort;
    private String u_requested_by_phone;
    private String short_description;
    private String correlation_display;
    private Object u_error_code;
    private String work_start;
    private String additional_assignee_list;
    private String notify;
    private String service_offering;
    private String sys_class_name;
    private Closed_by closed_by;
    private String follow_up;
    private Parent_incident parent_incident;
    private String u_customer_escalation_timestamp;
    private String u_planned_response_date;
    private String vendor;
    private String reassignment_count;
    private String u_created_by_tier_1;
    private String assigned_to;
    private Object u_reporting_subcategory;
    private String u_wrong_classification;
    private Object u_reporting_indicator;
    private String sla_due;
    private String u_actual_response_date;
    private String comments_and_work_notes;
    private String u_sla_met;
    private String u_customer_confirmation_y_n;
    private String escalation;
    private String upon_approval;
    private String u_lateral_assignment;
    private U_service_category u_service_category;
    private String correlation_id;
    private String u_resolution_duration;
    private String u_requested_by_name;
    private String made_sla;
    private String u_major_incident;
    private String u_requested_by_email;
    private String child_incidents;
    private String hold_reason;
    private Resolved_by resolved_by;
    private U_business_service u_business_service;
    private String sys_updated_by;
    private Opened_by opened_by;
    private String user_input;
    private String sys_created_on;
    private Sys_domain sys_domain;
    private String calendar_stc;
    private String closed_at;
    private Object u_relationship;
    private String u_requested_by_not_found;
    private Business_service business_service;
    private U_requested_by u_requested_by;
    private String u_escalation_requested_by;
    private U_symptom u_symptom;
    private String rfc;
    private String time_worked;
    private String expected_start;
    private String opened_at;
    private String work_end;
    private Caller_id caller_id;
    private String resolved_at;
    private String u_resolution_summary;
    private Object subcategory;
    private Object u_escalation_customer;
    private String work_notes;
    private String close_code;
    private Object u_sub_contact;
    private Assignment_group assignment_group;
    private String u_kb_article;
    private Object u_asset_redeployable;
    private String business_stc;
    private String description;
    private String u_first_line_resolved;
    private String u_legacy_rgm;
    private String u_planned_resolved_date;
    private String calendar_duration;
    private Object u_on_hold_type;
    private String close_notes;
    private String u_stockroom;
    private String sys_id;
    private String contact_type;
    private String incident_state;
    private String urgency;
    private String problem_id;
    private String u_response_duration;
    private Company company;
    private String activity_due;
    private String severity;
    private Object u_in_stock;
    private String comments;
    private String approval;
    private String u_assigned_above_tier_1;
    private String due_date;
    private String sys_mod_count;
    private String reopen_count;
    private String sys_tags;
    private String u_first_call_resolution;
    private Location location;
    private String category;
    private String u_set_to_p1;
    private final static long serialVersionUID = 795861020674398285L;

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public String getCaused_by() {
        return caused_by;
    }

    public void setCaused_by(String caused_by) {
        this.caused_by = caused_by;
    }

    public String getWatch_list() {
        return watch_list;
    }

    public void setWatch_list(String watch_list) {
        this.watch_list = watch_list;
    }

    public String getU_call_back_number() {
        return u_call_back_number;
    }

    public void setU_call_back_number(String u_call_back_number) {
        this.u_call_back_number = u_call_back_number;
    }

    public String getUpon_reject() {
        return upon_reject;
    }

    public void setUpon_reject(String upon_reject) {
        this.upon_reject = upon_reject;
    }

    public String getSys_updated_on() {
        return sys_updated_on;
    }

    public void setSys_updated_on(String sys_updated_on) {
        this.sys_updated_on = sys_updated_on;
    }

    public String getU_resolved_by_tier_1() {
        return u_resolved_by_tier_1;
    }

    public void setU_resolved_by_tier_1(String u_resolved_by_tier_1) {
        this.u_resolved_by_tier_1 = u_resolved_by_tier_1;
    }

    public String getU_ud_parent() {
        return u_ud_parent;
    }

    public void setU_ud_parent(String u_ud_parent) {
        this.u_ud_parent = u_ud_parent;
    }

    public String getU_resolved_within_1_hour() {
        return u_resolved_within_1_hour;
    }

    public void setU_resolved_within_1_hour(String u_resolved_within_1_hour) {
        this.u_resolved_within_1_hour = u_resolved_within_1_hour;
    }

    public U_routing_rule getU_routing_rule() {
        return u_routing_rule;
    }

    public void setU_routing_rule(U_routing_rule u_routing_rule) {
        this.u_routing_rule = u_routing_rule;
    }

    public String getApproval_history() {
        return approval_history;
    }

    public void setApproval_history(String approval_history) {
        this.approval_history = approval_history;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getU_actual_resolution_date() {
        return u_actual_resolution_date;
    }

    public void setU_actual_resolution_date(String u_actual_resolution_date) {
        this.u_actual_resolution_date = u_actual_resolution_date;
    }

    public String getU_technical_service() {
        return u_technical_service;
    }

    public void setU_technical_service(String u_technical_service) {
        this.u_technical_service = u_technical_service;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSys_created_by() {
        return sys_created_by;
    }

    public void setSys_created_by(String sys_created_by) {
        this.sys_created_by = sys_created_by;
    }

    public String getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getCmdb_ci() {
        return cmdb_ci;
    }

    public void setCmdb_ci(String cmdb_ci) {
        this.cmdb_ci = cmdb_ci;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public U_requested_for getU_requested_for() {
        return u_requested_for;
    }

    public void setU_requested_for(U_requested_for u_requested_for) {
        this.u_requested_for = u_requested_for;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getWork_notes_list() {
        return work_notes_list;
    }

    public void setWork_notes_list(String work_notes_list) {
        this.work_notes_list = work_notes_list;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSys_domain_path() {
        return sys_domain_path;
    }

    public void setSys_domain_path(String sys_domain_path) {
        this.sys_domain_path = sys_domain_path;
    }

    public String getU_hidden_data() {
        return u_hidden_data;
    }

    public void setU_hidden_data(String u_hidden_data) {
        this.u_hidden_data = u_hidden_data;
    }

    public String getBusiness_duration() {
        return business_duration;
    }

    public void setBusiness_duration(String business_duration) {
        this.business_duration = business_duration;
    }

    public String getGroup_list() {
        return group_list;
    }

    public void setGroup_list(String group_list) {
        this.group_list = group_list;
    }

    public String getU_reopened() {
        return u_reopened;
    }

    public void setU_reopened(String u_reopened) {
        this.u_reopened = u_reopened;
    }

    public String getU_template() {
        return u_template;
    }

    public void setU_template(String u_template) {
        this.u_template = u_template;
    }

    public String getU_protocol_not_followed() {
        return u_protocol_not_followed;
    }

    public void setU_protocol_not_followed(String u_protocol_not_followed) {
        this.u_protocol_not_followed = u_protocol_not_followed;
    }

    public String getApproval_set() {
        return approval_set;
    }

    public void setApproval_set(String approval_set) {
        this.approval_set = approval_set;
    }

    public String getU_incident_state_count() {
        return u_incident_state_count;
    }

    public void setU_incident_state_count(String u_incident_state_count) {
        this.u_incident_state_count = u_incident_state_count;
    }

    public String getU_contact_number_effort() {
        return u_contact_number_effort;
    }

    public void setU_contact_number_effort(String u_contact_number_effort) {
        this.u_contact_number_effort = u_contact_number_effort;
    }

    public String getU_requested_by_phone() {
        return u_requested_by_phone;
    }

    public void setU_requested_by_phone(String u_requested_by_phone) {
        this.u_requested_by_phone = u_requested_by_phone;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getCorrelation_display() {
        return correlation_display;
    }

    public void setCorrelation_display(String correlation_display) {
        this.correlation_display = correlation_display;
    }

    public Object getU_error_code() {
        return u_error_code;
    }

    public void setU_error_code(Object u_error_code) {
        this.u_error_code = u_error_code;
    }

    public String getWork_start() {
        return work_start;
    }

    public void setWork_start(String work_start) {
        this.work_start = work_start;
    }

    public String getAdditional_assignee_list() {
        return additional_assignee_list;
    }

    public void setAdditional_assignee_list(String additional_assignee_list) {
        this.additional_assignee_list = additional_assignee_list;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public String getService_offering() {
        return service_offering;
    }

    public void setService_offering(String service_offering) {
        this.service_offering = service_offering;
    }

    public String getSys_class_name() {
        return sys_class_name;
    }

    public void setSys_class_name(String sys_class_name) {
        this.sys_class_name = sys_class_name;
    }

    public Closed_by getClosed_by() {
        return closed_by;
    }

    public void setClosed_by(Closed_by closed_by) {
        this.closed_by = closed_by;
    }

    public String getFollow_up() {
        return follow_up;
    }

    public void setFollow_up(String follow_up) {
        this.follow_up = follow_up;
    }

    public Parent_incident getParent_incident() {
        return parent_incident;
    }

    public void setParent_incident(Parent_incident parent_incident) {
        this.parent_incident = parent_incident;
    }

    public String getU_customer_escalation_timestamp() {
        return u_customer_escalation_timestamp;
    }

    public void setU_customer_escalation_timestamp(String u_customer_escalation_timestamp) {
        this.u_customer_escalation_timestamp = u_customer_escalation_timestamp;
    }

    public String getU_planned_response_date() {
        return u_planned_response_date;
    }

    public void setU_planned_response_date(String u_planned_response_date) {
        this.u_planned_response_date = u_planned_response_date;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getReassignment_count() {
        return reassignment_count;
    }

    public void setReassignment_count(String reassignment_count) {
        this.reassignment_count = reassignment_count;
    }

    public String getU_created_by_tier_1() {
        return u_created_by_tier_1;
    }

    public void setU_created_by_tier_1(String u_created_by_tier_1) {
        this.u_created_by_tier_1 = u_created_by_tier_1;
    }

    public String getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    public Object getU_reporting_subcategory() {
        return u_reporting_subcategory;
    }

    public void setU_reporting_subcategory(Object u_reporting_subcategory) {
        this.u_reporting_subcategory = u_reporting_subcategory;
    }

    public String getU_wrong_classification() {
        return u_wrong_classification;
    }

    public void setU_wrong_classification(String u_wrong_classification) {
        this.u_wrong_classification = u_wrong_classification;
    }

    public Object getU_reporting_indicator() {
        return u_reporting_indicator;
    }

    public void setU_reporting_indicator(Object u_reporting_indicator) {
        this.u_reporting_indicator = u_reporting_indicator;
    }

    public String getSla_due() {
        return sla_due;
    }

    public void setSla_due(String sla_due) {
        this.sla_due = sla_due;
    }

    public String getU_actual_response_date() {
        return u_actual_response_date;
    }

    public void setU_actual_response_date(String u_actual_response_date) {
        this.u_actual_response_date = u_actual_response_date;
    }

    public String getComments_and_work_notes() {
        return comments_and_work_notes;
    }

    public void setComments_and_work_notes(String comments_and_work_notes) {
        this.comments_and_work_notes = comments_and_work_notes;
    }

    public String getU_sla_met() {
        return u_sla_met;
    }

    public void setU_sla_met(String u_sla_met) {
        this.u_sla_met = u_sla_met;
    }

    public String getU_customer_confirmation_y_n() {
        return u_customer_confirmation_y_n;
    }

    public void setU_customer_confirmation_y_n(String u_customer_confirmation_y_n) {
        this.u_customer_confirmation_y_n = u_customer_confirmation_y_n;
    }

    public String getEscalation() {
        return escalation;
    }

    public void setEscalation(String escalation) {
        this.escalation = escalation;
    }

    public String getUpon_approval() {
        return upon_approval;
    }

    public void setUpon_approval(String upon_approval) {
        this.upon_approval = upon_approval;
    }

    public String getU_lateral_assignment() {
        return u_lateral_assignment;
    }

    public void setU_lateral_assignment(String u_lateral_assignment) {
        this.u_lateral_assignment = u_lateral_assignment;
    }

    public U_service_category getU_service_category() {
        return u_service_category;
    }

    public void setU_service_category(U_service_category u_service_category) {
        this.u_service_category = u_service_category;
    }

    public String getCorrelation_id() {
        return correlation_id;
    }

    public void setCorrelation_id(String correlation_id) {
        this.correlation_id = correlation_id;
    }

    public String getU_resolution_duration() {
        return u_resolution_duration;
    }

    public void setU_resolution_duration(String u_resolution_duration) {
        this.u_resolution_duration = u_resolution_duration;
    }

    public String getU_requested_by_name() {
        return u_requested_by_name;
    }

    public void setU_requested_by_name(String u_requested_by_name) {
        this.u_requested_by_name = u_requested_by_name;
    }

    public String getMade_sla() {
        return made_sla;
    }

    public void setMade_sla(String made_sla) {
        this.made_sla = made_sla;
    }

    public String getU_major_incident() {
        return u_major_incident;
    }

    public void setU_major_incident(String u_major_incident) {
        this.u_major_incident = u_major_incident;
    }

    public String getU_requested_by_email() {
        return u_requested_by_email;
    }

    public void setU_requested_by_email(String u_requested_by_email) {
        this.u_requested_by_email = u_requested_by_email;
    }

    public String getChild_incidents() {
        return child_incidents;
    }

    public void setChild_incidents(String child_incidents) {
        this.child_incidents = child_incidents;
    }

    public String getHold_reason() {
        return hold_reason;
    }

    public void setHold_reason(String hold_reason) {
        this.hold_reason = hold_reason;
    }

    public Resolved_by getResolved_by() {
        return resolved_by;
    }

    public void setResolved_by(Resolved_by resolved_by) {
        this.resolved_by = resolved_by;
    }

    public U_business_service getU_business_service() {
        return u_business_service;
    }

    public void setU_business_service(U_business_service u_business_service) {
        this.u_business_service = u_business_service;
    }

    public String getSys_updated_by() {
        return sys_updated_by;
    }

    public void setSys_updated_by(String sys_updated_by) {
        this.sys_updated_by = sys_updated_by;
    }

    public Opened_by getOpened_by() {
        return opened_by;
    }

    public void setOpened_by(Opened_by opened_by) {
        this.opened_by = opened_by;
    }

    public String getUser_input() {
        return user_input;
    }

    public void setUser_input(String user_input) {
        this.user_input = user_input;
    }

    public String getSys_created_on() {
        return sys_created_on;
    }

    public void setSys_created_on(String sys_created_on) {
        this.sys_created_on = sys_created_on;
    }

    public Sys_domain getSys_domain() {
        return sys_domain;
    }

    public void setSys_domain(Sys_domain sys_domain) {
        this.sys_domain = sys_domain;
    }

    public String getCalendar_stc() {
        return calendar_stc;
    }

    public void setCalendar_stc(String calendar_stc) {
        this.calendar_stc = calendar_stc;
    }

    public String getClosed_at() {
        return closed_at;
    }

    public void setClosed_at(String closed_at) {
        this.closed_at = closed_at;
    }

    public Object getU_relationship() {
        return u_relationship;
    }

    public void setU_relationship(Object u_relationship) {
        this.u_relationship = u_relationship;
    }

    public String getU_requested_by_not_found() {
        return u_requested_by_not_found;
    }

    public void setU_requested_by_not_found(String u_requested_by_not_found) {
        this.u_requested_by_not_found = u_requested_by_not_found;
    }

    public Business_service getBusiness_service() {
        return business_service;
    }

    public void setBusiness_service(Business_service business_service) {
        this.business_service = business_service;
    }

    public U_requested_by getU_requested_by() {
        return u_requested_by;
    }

    public void setU_requested_by(U_requested_by u_requested_by) {
        this.u_requested_by = u_requested_by;
    }

    public String getU_escalation_requested_by() {
        return u_escalation_requested_by;
    }

    public void setU_escalation_requested_by(String u_escalation_requested_by) {
        this.u_escalation_requested_by = u_escalation_requested_by;
    }

    public U_symptom getU_symptom() {
        return u_symptom;
    }

    public void setU_symptom(U_symptom u_symptom) {
        this.u_symptom = u_symptom;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTime_worked() {
        return time_worked;
    }

    public void setTime_worked(String time_worked) {
        this.time_worked = time_worked;
    }

    public String getExpected_start() {
        return expected_start;
    }

    public void setExpected_start(String expected_start) {
        this.expected_start = expected_start;
    }

    public String getOpened_at() {
        return opened_at;
    }

    public void setOpened_at(String opened_at) {
        this.opened_at = opened_at;
    }

    public String getWork_end() {
        return work_end;
    }

    public void setWork_end(String work_end) {
        this.work_end = work_end;
    }

    public Caller_id getCaller_id() {
        return caller_id;
    }

    public void setCaller_id(Caller_id caller_id) {
        this.caller_id = caller_id;
    }

    public String getResolved_at() {
        return resolved_at;
    }

    public void setResolved_at(String resolved_at) {
        this.resolved_at = resolved_at;
    }

    public String getU_resolution_summary() {
        return u_resolution_summary;
    }

    public void setU_resolution_summary(String u_resolution_summary) {
        this.u_resolution_summary = u_resolution_summary;
    }

    public Object getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Object subcategory) {
        this.subcategory = subcategory;
    }

    public Object getU_escalation_customer() {
        return u_escalation_customer;
    }

    public void setU_escalation_customer(Object u_escalation_customer) {
        this.u_escalation_customer = u_escalation_customer;
    }

    public String getWork_notes() {
        return work_notes;
    }

    public void setWork_notes(String work_notes) {
        this.work_notes = work_notes;
    }

    public String getClose_code() {
        return close_code;
    }

    public void setClose_code(String close_code) {
        this.close_code = close_code;
    }

    public Object getU_sub_contact() {
        return u_sub_contact;
    }

    public void setU_sub_contact(Object u_sub_contact) {
        this.u_sub_contact = u_sub_contact;
    }

    public Assignment_group getAssignment_group() {
        return assignment_group;
    }

    public void setAssignment_group(Assignment_group assignment_group) {
        this.assignment_group = assignment_group;
    }

    public String getU_kb_article() {
        return u_kb_article;
    }

    public void setU_kb_article(String u_kb_article) {
        this.u_kb_article = u_kb_article;
    }

    public Object getU_asset_redeployable() {
        return u_asset_redeployable;
    }

    public void setU_asset_redeployable(Object u_asset_redeployable) {
        this.u_asset_redeployable = u_asset_redeployable;
    }

    public String getBusiness_stc() {
        return business_stc;
    }

    public void setBusiness_stc(String business_stc) {
        this.business_stc = business_stc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getU_first_line_resolved() {
        return u_first_line_resolved;
    }

    public void setU_first_line_resolved(String u_first_line_resolved) {
        this.u_first_line_resolved = u_first_line_resolved;
    }

    public String getU_legacy_rgm() {
        return u_legacy_rgm;
    }

    public void setU_legacy_rgm(String u_legacy_rgm) {
        this.u_legacy_rgm = u_legacy_rgm;
    }

    public String getU_planned_resolved_date() {
        return u_planned_resolved_date;
    }

    public void setU_planned_resolved_date(String u_planned_resolved_date) {
        this.u_planned_resolved_date = u_planned_resolved_date;
    }

    public String getCalendar_duration() {
        return calendar_duration;
    }

    public void setCalendar_duration(String calendar_duration) {
        this.calendar_duration = calendar_duration;
    }

    public Object getU_on_hold_type() {
        return u_on_hold_type;
    }

    public void setU_on_hold_type(Object u_on_hold_type) {
        this.u_on_hold_type = u_on_hold_type;
    }

    public String getClose_notes() {
        return close_notes;
    }

    public void setClose_notes(String close_notes) {
        this.close_notes = close_notes;
    }

    public String getU_stockroom() {
        return u_stockroom;
    }

    public void setU_stockroom(String u_stockroom) {
        this.u_stockroom = u_stockroom;
    }

    public String getSys_id() {
        return sys_id;
    }

    public void setSys_id(String sys_id) {
        this.sys_id = sys_id;
    }

    public String getContact_type() {
        return contact_type;
    }

    public void setContact_type(String contact_type) {
        this.contact_type = contact_type;
    }

    public String getIncident_state() {
        return incident_state;
    }

    public void setIncident_state(String incident_state) {
        this.incident_state = incident_state;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getProblem_id() {
        return problem_id;
    }

    public void setProblem_id(String problem_id) {
        this.problem_id = problem_id;
    }

    public String getU_response_duration() {
        return u_response_duration;
    }

    public void setU_response_duration(String u_response_duration) {
        this.u_response_duration = u_response_duration;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getActivity_due() {
        return activity_due;
    }

    public void setActivity_due(String activity_due) {
        this.activity_due = activity_due;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Object getU_in_stock() {
        return u_in_stock;
    }

    public void setU_in_stock(Object u_in_stock) {
        this.u_in_stock = u_in_stock;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public String getU_assigned_above_tier_1() {
        return u_assigned_above_tier_1;
    }

    public void setU_assigned_above_tier_1(String u_assigned_above_tier_1) {
        this.u_assigned_above_tier_1 = u_assigned_above_tier_1;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getSys_mod_count() {
        return sys_mod_count;
    }

    public void setSys_mod_count(String sys_mod_count) {
        this.sys_mod_count = sys_mod_count;
    }

    public String getReopen_count() {
        return reopen_count;
    }

    public void setReopen_count(String reopen_count) {
        this.reopen_count = reopen_count;
    }

    public String getSys_tags() {
        return sys_tags;
    }

    public void setSys_tags(String sys_tags) {
        this.sys_tags = sys_tags;
    }

    public String getU_first_call_resolution() {
        return u_first_call_resolution;
    }

    public void setU_first_call_resolution(String u_first_call_resolution) {
        this.u_first_call_resolution = u_first_call_resolution;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getU_set_to_p1() {
        return u_set_to_p1;
    }

    public void setU_set_to_p1(String u_set_to_p1) {
        this.u_set_to_p1 = u_set_to_p1;
    }

}
