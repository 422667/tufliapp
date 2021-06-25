package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:43 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblFollowupTaskAud generated by hbm2java
 */
@Entity
@Table(name = "tbl_followup_task_aud", catalog = "crmord")
public class TblFollowupTaskAud implements java.io.Serializable {

	private TblFollowupTaskAudId id;
	private Byte revtype;
	private String taskType;
	private String taskNature;
	private String url;
	private String method;
	private String header;
	private String body;
	private Long fulfillOrderId;
	private Long orderId;
	private Long orderItemId;
	private String status;
	private Long txnId;
	private String txnReqDtl;
	private String txnRespDtl;
	private String remark;
	private String errorMsg;
	private String refCode;
	private String notifyPartyUuid;
	private String assignedUser;
	private Date createTime;
	private Date notifyTime;
	private Date assignTime;
	private Date executeTime;
	private Date skipTime;
	private String createBy;
	private String notifyBy;
	private String assignBy;
	private String executeBy;
	private String skipBy;

	public TblFollowupTaskAud() {
	}

	public TblFollowupTaskAud(TblFollowupTaskAudId id) {
		this.id = id;
	}

	public TblFollowupTaskAud(TblFollowupTaskAudId id, Byte revtype, String taskType, String taskNature, String url,
			String method, String header, String body, Long fulfillOrderId, Long orderId, Long orderItemId,
			String status, Long txnId, String txnReqDtl, String txnRespDtl, String remark, String errorMsg,
			String refCode, String notifyPartyUuid, String assignedUser, Date createTime, Date notifyTime,
			Date assignTime, Date executeTime, Date skipTime, String createBy, String notifyBy, String assignBy,
			String executeBy, String skipBy) {
		this.id = id;
		this.revtype = revtype;
		this.taskType = taskType;
		this.taskNature = taskNature;
		this.url = url;
		this.method = method;
		this.header = header;
		this.body = body;
		this.fulfillOrderId = fulfillOrderId;
		this.orderId = orderId;
		this.orderItemId = orderItemId;
		this.status = status;
		this.txnId = txnId;
		this.txnReqDtl = txnReqDtl;
		this.txnRespDtl = txnRespDtl;
		this.remark = remark;
		this.errorMsg = errorMsg;
		this.refCode = refCode;
		this.notifyPartyUuid = notifyPartyUuid;
		this.assignedUser = assignedUser;
		this.createTime = createTime;
		this.notifyTime = notifyTime;
		this.assignTime = assignTime;
		this.executeTime = executeTime;
		this.skipTime = skipTime;
		this.createBy = createBy;
		this.notifyBy = notifyBy;
		this.assignBy = assignBy;
		this.executeBy = executeBy;
		this.skipBy = skipBy;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "recordId", column = @Column(name = "record_id", nullable = false)),
			@AttributeOverride(name = "rev", column = @Column(name = "REV", nullable = false)) })
	public TblFollowupTaskAudId getId() {
		return this.id;
	}

	public void setId(TblFollowupTaskAudId id) {
		this.id = id;
	}

	@Column(name = "REVTYPE")
	public Byte getRevtype() {
		return this.revtype;
	}

	public void setRevtype(Byte revtype) {
		this.revtype = revtype;
	}

	@Column(name = "task_type", length = 32)
	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	@Column(name = "task_nature", length = 64)
	public String getTaskNature() {
		return this.taskNature;
	}

	public void setTaskNature(String taskNature) {
		this.taskNature = taskNature;
	}

	@Column(name = "url", length = 4000)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "method", length = 12)
	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	@Column(name = "header")
	public String getHeader() {
		return this.header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	@Column(name = "body")
	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Column(name = "fulfill_order_id")
	public Long getFulfillOrderId() {
		return this.fulfillOrderId;
	}

	public void setFulfillOrderId(Long fulfillOrderId) {
		this.fulfillOrderId = fulfillOrderId;
	}

	@Column(name = "order_id")
	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Column(name = "order_item_id")
	public Long getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	@Column(name = "status", length = 32)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "txn_id")
	public Long getTxnId() {
		return this.txnId;
	}

	public void setTxnId(Long txnId) {
		this.txnId = txnId;
	}

	@Column(name = "txn_req_dtl")
	public String getTxnReqDtl() {
		return this.txnReqDtl;
	}

	public void setTxnReqDtl(String txnReqDtl) {
		this.txnReqDtl = txnReqDtl;
	}

	@Column(name = "txn_resp_dtl")
	public String getTxnRespDtl() {
		return this.txnRespDtl;
	}

	public void setTxnRespDtl(String txnRespDtl) {
		this.txnRespDtl = txnRespDtl;
	}

	@Column(name = "remark", length = 512)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "error_msg", length = 4000)
	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Column(name = "ref_code", length = 512)
	public String getRefCode() {
		return this.refCode;
	}

	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}

	@Column(name = "notify_party_uuid", length = 64)
	public String getNotifyPartyUuid() {
		return this.notifyPartyUuid;
	}

	public void setNotifyPartyUuid(String notifyPartyUuid) {
		this.notifyPartyUuid = notifyPartyUuid;
	}

	@Column(name = "assigned_user", length = 512)
	public String getAssignedUser() {
		return this.assignedUser;
	}

	public void setAssignedUser(String assignedUser) {
		this.assignedUser = assignedUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "notify_time", length = 19)
	public Date getNotifyTime() {
		return this.notifyTime;
	}

	public void setNotifyTime(Date notifyTime) {
		this.notifyTime = notifyTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "assign_time", length = 19)
	public Date getAssignTime() {
		return this.assignTime;
	}

	public void setAssignTime(Date assignTime) {
		this.assignTime = assignTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "execute_time", length = 19)
	public Date getExecuteTime() {
		return this.executeTime;
	}

	public void setExecuteTime(Date executeTime) {
		this.executeTime = executeTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "skip_time", length = 19)
	public Date getSkipTime() {
		return this.skipTime;
	}

	public void setSkipTime(Date skipTime) {
		this.skipTime = skipTime;
	}

	@Column(name = "create_by", length = 64)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "notify_by", length = 64)
	public String getNotifyBy() {
		return this.notifyBy;
	}

	public void setNotifyBy(String notifyBy) {
		this.notifyBy = notifyBy;
	}

	@Column(name = "assign_by", length = 64)
	public String getAssignBy() {
		return this.assignBy;
	}

	public void setAssignBy(String assignBy) {
		this.assignBy = assignBy;
	}

	@Column(name = "execute_by", length = 64)
	public String getExecuteBy() {
		return this.executeBy;
	}

	public void setExecuteBy(String executeBy) {
		this.executeBy = executeBy;
	}

	@Column(name = "skip_by", length = 64)
	public String getSkipBy() {
		return this.skipBy;
	}

	public void setSkipBy(String skipBy) {
		this.skipBy = skipBy;
	}

}
