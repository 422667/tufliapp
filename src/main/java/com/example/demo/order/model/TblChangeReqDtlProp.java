package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:43 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblChangeReqDtlProp generated by hbm2java
 */
@Entity
@Table(name = "tbl_change_req_dtl_prop", catalog = "crmord")
public class TblChangeReqDtlProp implements java.io.Serializable {

	private long recordId;
	private Long changeReqId;
	private Long changeReqDtlId;
	private Long orderId;
	private Long orderItemId;
	private Long orderItemPropId;
	private String actionInd;
	private Long propId;
	private String propCode;
	private String module;
	private Float propNewValueId;
	private String newValue;
	private Float propOldValueId;
	private String oldValue;
	private String actionType;
	private String priceImpactRecurringFlag;
	private String priceImpactOnetimeFlag;
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

	public TblChangeReqDtlProp() {
	}

	public TblChangeReqDtlProp(long recordId) {
		this.recordId = recordId;
	}

	public TblChangeReqDtlProp(long recordId, Long changeReqId, Long changeReqDtlId, Long orderId, Long orderItemId,
			Long orderItemPropId, String actionInd, Long propId, String propCode, String module, Float propNewValueId,
			String newValue, Float propOldValueId, String oldValue, String actionType, String priceImpactRecurringFlag,
			String priceImpactOnetimeFlag, String createProleType, Long createProleId, String createProleName,
			String createProleCode, Date createTime, String modifyProleType, Long modifyProleId, String modifyProleName,
			String modifyProleCode, Date modifyTime) {
		this.recordId = recordId;
		this.changeReqId = changeReqId;
		this.changeReqDtlId = changeReqDtlId;
		this.orderId = orderId;
		this.orderItemId = orderItemId;
		this.orderItemPropId = orderItemPropId;
		this.actionInd = actionInd;
		this.propId = propId;
		this.propCode = propCode;
		this.module = module;
		this.propNewValueId = propNewValueId;
		this.newValue = newValue;
		this.propOldValueId = propOldValueId;
		this.oldValue = oldValue;
		this.actionType = actionType;
		this.priceImpactRecurringFlag = priceImpactRecurringFlag;
		this.priceImpactOnetimeFlag = priceImpactOnetimeFlag;
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

	@Column(name = "change_req_id")
	public Long getChangeReqId() {
		return this.changeReqId;
	}

	public void setChangeReqId(Long changeReqId) {
		this.changeReqId = changeReqId;
	}

	@Column(name = "change_req_dtl_id")
	public Long getChangeReqDtlId() {
		return this.changeReqDtlId;
	}

	public void setChangeReqDtlId(Long changeReqDtlId) {
		this.changeReqDtlId = changeReqDtlId;
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

	@Column(name = "order_item_prop_id")
	public Long getOrderItemPropId() {
		return this.orderItemPropId;
	}

	public void setOrderItemPropId(Long orderItemPropId) {
		this.orderItemPropId = orderItemPropId;
	}

	@Column(name = "action_ind", length = 12)
	public String getActionInd() {
		return this.actionInd;
	}

	public void setActionInd(String actionInd) {
		this.actionInd = actionInd;
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

	@Column(name = "prop_new_value_id", precision = 20)
	public Float getPropNewValueId() {
		return this.propNewValueId;
	}

	public void setPropNewValueId(Float propNewValueId) {
		this.propNewValueId = propNewValueId;
	}

	@Column(name = "new_value", length = 4000)
	public String getNewValue() {
		return this.newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	@Column(name = "prop_old_value_id", precision = 20)
	public Float getPropOldValueId() {
		return this.propOldValueId;
	}

	public void setPropOldValueId(Float propOldValueId) {
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

	@Column(name = "price_impact_recurring_flag", length = 12)
	public String getPriceImpactRecurringFlag() {
		return this.priceImpactRecurringFlag;
	}

	public void setPriceImpactRecurringFlag(String priceImpactRecurringFlag) {
		this.priceImpactRecurringFlag = priceImpactRecurringFlag;
	}

	@Column(name = "price_impact_onetime_flag", length = 12)
	public String getPriceImpactOnetimeFlag() {
		return this.priceImpactOnetimeFlag;
	}

	public void setPriceImpactOnetimeFlag(String priceImpactOnetimeFlag) {
		this.priceImpactOnetimeFlag = priceImpactOnetimeFlag;
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