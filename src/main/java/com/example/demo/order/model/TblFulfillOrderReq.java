package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:43 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblFulfillOrderReq generated by hbm2java
 */
@Entity
@Table(name = "tbl_fulfill_order_req", catalog = "crmord")
public class TblFulfillOrderReq implements java.io.Serializable {

	private long recordId;
	private TblFulfillOrder tblFulfillOrder;
	private String rtnRefId;
	private String rtnType;
	private Long rtnId;
	private String rtnCode;
	private String rtnDesc;
	private Long refTxnId;
	private String rtnOrderNo;
	private String rtnLevel;
	private Date rtnTimestamp;
	private Date rtnReceiveDate;
	private Date rtnFinishDate;
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

	public TblFulfillOrderReq() {
	}

	public TblFulfillOrderReq(long recordId) {
		this.recordId = recordId;
	}

	public TblFulfillOrderReq(long recordId, TblFulfillOrder tblFulfillOrder, String rtnRefId, String rtnType,
			Long rtnId, String rtnCode, String rtnDesc, Long refTxnId, String rtnOrderNo, String rtnLevel,
			Date rtnTimestamp, Date rtnReceiveDate, Date rtnFinishDate, String createProleType, Long createProleId,
			String createProleName, String createProleCode, Date createTime, String modifyProleType, Long modifyProleId,
			String modifyProleName, String modifyProleCode, Date modifyTime) {
		this.recordId = recordId;
		this.tblFulfillOrder = tblFulfillOrder;
		this.rtnRefId = rtnRefId;
		this.rtnType = rtnType;
		this.rtnId = rtnId;
		this.rtnCode = rtnCode;
		this.rtnDesc = rtnDesc;
		this.refTxnId = refTxnId;
		this.rtnOrderNo = rtnOrderNo;
		this.rtnLevel = rtnLevel;
		this.rtnTimestamp = rtnTimestamp;
		this.rtnReceiveDate = rtnReceiveDate;
		this.rtnFinishDate = rtnFinishDate;
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

	@Id

	@Column(name = "record_id", unique = true, nullable = false)
	public long getRecordId() {
		return this.recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fulfill_order_id")
	public TblFulfillOrder getTblFulfillOrder() {
		return this.tblFulfillOrder;
	}

	public void setTblFulfillOrder(TblFulfillOrder tblFulfillOrder) {
		this.tblFulfillOrder = tblFulfillOrder;
	}

	@Column(name = "rtn_ref_id", length = 32)
	public String getRtnRefId() {
		return this.rtnRefId;
	}

	public void setRtnRefId(String rtnRefId) {
		this.rtnRefId = rtnRefId;
	}

	@Column(name = "rtn_type", length = 32)
	public String getRtnType() {
		return this.rtnType;
	}

	public void setRtnType(String rtnType) {
		this.rtnType = rtnType;
	}

	@Column(name = "rtn_id")
	public Long getRtnId() {
		return this.rtnId;
	}

	public void setRtnId(Long rtnId) {
		this.rtnId = rtnId;
	}

	@Column(name = "rtn_code", length = 32)
	public String getRtnCode() {
		return this.rtnCode;
	}

	public void setRtnCode(String rtnCode) {
		this.rtnCode = rtnCode;
	}

	@Column(name = "rtn_desc", length = 4000)
	public String getRtnDesc() {
		return this.rtnDesc;
	}

	public void setRtnDesc(String rtnDesc) {
		this.rtnDesc = rtnDesc;
	}

	@Column(name = "ref_txn_id")
	public Long getRefTxnId() {
		return this.refTxnId;
	}

	public void setRefTxnId(Long refTxnId) {
		this.refTxnId = refTxnId;
	}

	@Column(name = "rtn_order_no", length = 64)
	public String getRtnOrderNo() {
		return this.rtnOrderNo;
	}

	public void setRtnOrderNo(String rtnOrderNo) {
		this.rtnOrderNo = rtnOrderNo;
	}

	@Column(name = "rtn_level", length = 12)
	public String getRtnLevel() {
		return this.rtnLevel;
	}

	public void setRtnLevel(String rtnLevel) {
		this.rtnLevel = rtnLevel;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rtn_timestamp", length = 19)
	public Date getRtnTimestamp() {
		return this.rtnTimestamp;
	}

	public void setRtnTimestamp(Date rtnTimestamp) {
		this.rtnTimestamp = rtnTimestamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rtn_receive_date", length = 19)
	public Date getRtnReceiveDate() {
		return this.rtnReceiveDate;
	}

	public void setRtnReceiveDate(Date rtnReceiveDate) {
		this.rtnReceiveDate = rtnReceiveDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rtn_finish_date", length = 19)
	public Date getRtnFinishDate() {
		return this.rtnFinishDate;
	}

	public void setRtnFinishDate(Date rtnFinishDate) {
		this.rtnFinishDate = rtnFinishDate;
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
