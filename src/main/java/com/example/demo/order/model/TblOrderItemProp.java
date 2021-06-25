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
 * TblOrderItemProp generated by hbm2java
 */
@Entity
@Table(name = "tbl_order_item_prop", catalog = "crmord")
public class TblOrderItemProp implements java.io.Serializable {

	private long recordId;
	private TblOrderItem tblOrderItem;
	private Long orderId;
	private Long propId;
	private String propCode;
	private String module;
	private Long propNewValueId;
	private String newValue;
	private Long propOldValueId;
	private String oldValue;
	private String actionType;
	private String markDelInd;
	private String priceImpactRecurringFlag;
	private String priceImpactOneTimeFlag;
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

	public TblOrderItemProp() {
	}

	public TblOrderItemProp(long recordId) {
		this.recordId = recordId;
	}

	public TblOrderItemProp(long recordId, TblOrderItem tblOrderItem, Long orderId, Long propId, String propCode,
			String module, Long propNewValueId, String newValue, Long propOldValueId, String oldValue,
			String actionType, String markDelInd, String priceImpactRecurringFlag, String priceImpactOneTimeFlag,
			String createProleType, Long createProleId, String createProleName, String createProleCode, Date createTime,
			String modifyProleType, Long modifyProleId, String modifyProleName, String modifyProleCode,
			Date modifyTime) {
		this.recordId = recordId;
		this.tblOrderItem = tblOrderItem;
		this.orderId = orderId;
		this.propId = propId;
		this.propCode = propCode;
		this.module = module;
		this.propNewValueId = propNewValueId;
		this.newValue = newValue;
		this.propOldValueId = propOldValueId;
		this.oldValue = oldValue;
		this.actionType = actionType;
		this.markDelInd = markDelInd;
		this.priceImpactRecurringFlag = priceImpactRecurringFlag;
		this.priceImpactOneTimeFlag = priceImpactOneTimeFlag;
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

	@Column(name = "prop_id")
	public Long getPropId() {
		return this.propId;
	}

	public void setPropId(Long propId) {
		this.propId = propId;
	}

	@Column(name = "prop_code", length = 512)
	public String getPropCode() {
		return this.propCode;
	}

	public void setPropCode(String propCode) {
		this.propCode = propCode;
	}

	@Column(name = "module", length = 32)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "prop_new_value_id")
	public Long getPropNewValueId() {
		return this.propNewValueId;
	}

	public void setPropNewValueId(Long propNewValueId) {
		this.propNewValueId = propNewValueId;
	}

	@Column(name = "new_value", length = 4000)
	public String getNewValue() {
		return this.newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	@Column(name = "prop_old_value_id")
	public Long getPropOldValueId() {
		return this.propOldValueId;
	}

	public void setPropOldValueId(Long propOldValueId) {
		this.propOldValueId = propOldValueId;
	}

	@Column(name = "old_value", length = 4000)
	public String getOldValue() {
		return this.oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	@Column(name = "action_type", length = 32)
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

	@Column(name = "price_impact_recurring_flag", length = 12)
	public String getPriceImpactRecurringFlag() {
		return this.priceImpactRecurringFlag;
	}

	public void setPriceImpactRecurringFlag(String priceImpactRecurringFlag) {
		this.priceImpactRecurringFlag = priceImpactRecurringFlag;
	}

	@Column(name = "price_impact_one_time_flag", length = 12)
	public String getPriceImpactOneTimeFlag() {
		return this.priceImpactOneTimeFlag;
	}

	public void setPriceImpactOneTimeFlag(String priceImpactOneTimeFlag) {
		this.priceImpactOneTimeFlag = priceImpactOneTimeFlag;
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
