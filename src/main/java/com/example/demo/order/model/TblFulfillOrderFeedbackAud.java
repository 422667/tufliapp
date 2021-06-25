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
 * TblFulfillOrderFeedbackAud generated by hbm2java
 */
@Entity
@Table(name = "tbl_fulfill_order_feedback_aud", catalog = "crmord")
public class TblFulfillOrderFeedbackAud implements java.io.Serializable {

	private TblFulfillOrderFeedbackAudId id;
	private Byte revtype;
	private Long txnId;
	private String txnCode;
	private Long fulfillOrderId;
	private String txnRefId;
	private String txnStatus;
	private String errorMsg;
	private String createProleType;
	private Long createProleId;
	private String createProleName;
	private String createProleCode;
	private Date createTime;
	private String modifyProleType;
	private Long modifyProleId;
	private String modifyProleName;
	private String modifyProleCode;
	private Date modifyTime;

	public TblFulfillOrderFeedbackAud() {
	}

	public TblFulfillOrderFeedbackAud(TblFulfillOrderFeedbackAudId id) {
		this.id = id;
	}

	public TblFulfillOrderFeedbackAud(TblFulfillOrderFeedbackAudId id, Byte revtype, Long txnId, String txnCode,
			Long fulfillOrderId, String txnRefId, String txnStatus, String errorMsg, String createProleType,
			Long createProleId, String createProleName, String createProleCode, Date createTime, String modifyProleType,
			Long modifyProleId, String modifyProleName, String modifyProleCode, Date modifyTime) {
		this.id = id;
		this.revtype = revtype;
		this.txnId = txnId;
		this.txnCode = txnCode;
		this.fulfillOrderId = fulfillOrderId;
		this.txnRefId = txnRefId;
		this.txnStatus = txnStatus;
		this.errorMsg = errorMsg;
		this.createProleType = createProleType;
		this.createProleId = createProleId;
		this.createProleName = createProleName;
		this.createProleCode = createProleCode;
		this.createTime = createTime;
		this.modifyProleType = modifyProleType;
		this.modifyProleId = modifyProleId;
		this.modifyProleName = modifyProleName;
		this.modifyProleCode = modifyProleCode;
		this.modifyTime = modifyTime;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "recordId", column = @Column(name = "record_id", nullable = false)),
			@AttributeOverride(name = "rev", column = @Column(name = "REV", nullable = false)) })
	public TblFulfillOrderFeedbackAudId getId() {
		return this.id;
	}

	public void setId(TblFulfillOrderFeedbackAudId id) {
		this.id = id;
	}

	@Column(name = "REVTYPE")
	public Byte getRevtype() {
		return this.revtype;
	}

	public void setRevtype(Byte revtype) {
		this.revtype = revtype;
	}

	@Column(name = "txn_id")
	public Long getTxnId() {
		return this.txnId;
	}

	public void setTxnId(Long txnId) {
		this.txnId = txnId;
	}

	@Column(name = "txn_code", length = 32)
	public String getTxnCode() {
		return this.txnCode;
	}

	public void setTxnCode(String txnCode) {
		this.txnCode = txnCode;
	}

	@Column(name = "fulfill_order_id")
	public Long getFulfillOrderId() {
		return this.fulfillOrderId;
	}

	public void setFulfillOrderId(Long fulfillOrderId) {
		this.fulfillOrderId = fulfillOrderId;
	}

	@Column(name = "txn_ref_id", length = 32)
	public String getTxnRefId() {
		return this.txnRefId;
	}

	public void setTxnRefId(String txnRefId) {
		this.txnRefId = txnRefId;
	}

	@Column(name = "txn_status", length = 50)
	public String getTxnStatus() {
		return this.txnStatus;
	}

	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}

	@Column(name = "error_msg", length = 4000)
	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Column(name = "create_prole_type", length = 12)
	public String getCreateProleType() {
		return this.createProleType;
	}

	public void setCreateProleType(String createProleType) {
		this.createProleType = createProleType;
	}

	@Column(name = "create_prole_id")
	public Long getCreateProleId() {
		return this.createProleId;
	}

	public void setCreateProleId(Long createProleId) {
		this.createProleId = createProleId;
	}

	@Column(name = "create_prole_name", length = 64)
	public String getCreateProleName() {
		return this.createProleName;
	}

	public void setCreateProleName(String createProleName) {
		this.createProleName = createProleName;
	}

	@Column(name = "create_prole_code", length = 64)
	public String getCreateProleCode() {
		return this.createProleCode;
	}

	public void setCreateProleCode(String createProleCode) {
		this.createProleCode = createProleCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "modify_prole_type", length = 12)
	public String getModifyProleType() {
		return this.modifyProleType;
	}

	public void setModifyProleType(String modifyProleType) {
		this.modifyProleType = modifyProleType;
	}

	@Column(name = "modify_prole_id")
	public Long getModifyProleId() {
		return this.modifyProleId;
	}

	public void setModifyProleId(Long modifyProleId) {
		this.modifyProleId = modifyProleId;
	}

	@Column(name = "modify_prole_name", length = 64)
	public String getModifyProleName() {
		return this.modifyProleName;
	}

	public void setModifyProleName(String modifyProleName) {
		this.modifyProleName = modifyProleName;
	}

	@Column(name = "modify_prole_code", length = 64)
	public String getModifyProleCode() {
		return this.modifyProleCode;
	}

	public void setModifyProleCode(String modifyProleCode) {
		this.modifyProleCode = modifyProleCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_time", length = 19)
	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
