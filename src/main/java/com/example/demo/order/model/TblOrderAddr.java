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
 * TblOrderAddr generated by hbm2java
 */
@Entity
@Table(name = "tbl_order_addr", catalog = "crmord")
public class TblOrderAddr implements java.io.Serializable {

	private long recordId;
	private TblOrderItem tblOrderItem;
	private Long orderId;
	private String addrType;
	private Long addrId;
	private Long refAddrId;
	private String postalCode;
	private String country;
	private String addressDtl;
	private String actionType;
	private String markDelInd;
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

	public TblOrderAddr() {
	}

	public TblOrderAddr(long recordId) {
		this.recordId = recordId;
	}

	public TblOrderAddr(long recordId, TblOrderItem tblOrderItem, Long orderId, String addrType, Long addrId,
			Long refAddrId, String postalCode, String country, String addressDtl, String actionType, String markDelInd,
			String createProleType, Long createProleId, String createProleName, String createProleCode, Date createTime,
			String modifyProleType, Long modifyProleId, String modifyProleName, String modifyProleCode,
			Date modifyTime) {
		this.recordId = recordId;
		this.tblOrderItem = tblOrderItem;
		this.orderId = orderId;
		this.addrType = addrType;
		this.addrId = addrId;
		this.refAddrId = refAddrId;
		this.postalCode = postalCode;
		this.country = country;
		this.addressDtl = addressDtl;
		this.actionType = actionType;
		this.markDelInd = markDelInd;
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
	@JoinColumn(name = "order_item_id")
	public TblOrderItem getTblOrderItem() {
		return this.tblOrderItem;
	}

	public void setTblOrderItem(TblOrderItem tblOrderItem) {
		this.tblOrderItem = tblOrderItem;
	}

	@Column(name = "order_id")
	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Column(name = "addr_type", length = 12)
	public String getAddrType() {
		return this.addrType;
	}

	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}

	@Column(name = "addr_id")
	public Long getAddrId() {
		return this.addrId;
	}

	public void setAddrId(Long addrId) {
		this.addrId = addrId;
	}

	@Column(name = "ref_addr_id")
	public Long getRefAddrId() {
		return this.refAddrId;
	}

	public void setRefAddrId(Long refAddrId) {
		this.refAddrId = refAddrId;
	}

	@Column(name = "postal_code", length = 32)
	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Column(name = "country", length = 512)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "address_dtl", length = 4000)
	public String getAddressDtl() {
		return this.addressDtl;
	}

	public void setAddressDtl(String addressDtl) {
		this.addressDtl = addressDtl;
	}

	@Column(name = "action_type", length = 12)
	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	@Column(name = "mark_del_ind", length = 12)
	public String getMarkDelInd() {
		return this.markDelInd;
	}

	public void setMarkDelInd(String markDelInd) {
		this.markDelInd = markDelInd;
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
