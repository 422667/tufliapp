package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:43 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblOrder generated by hbm2java
 */
@Entity
@Table(name = "tbl_order", catalog = "crmord")
public class TblOrder implements java.io.Serializable {

	private long recordId;
	private String code;
	private Long partitionId;
	private Long processFailCount;
	private Long POrderId;
	private String quoteRef;
	private String source;
	private String cancellationReason;
	private Date cancellationDate;
	private String processInstId;
	private String ownerProleType;
	private Long ownerProleId;
	private String ownerProleUuid;
	private String ownerProleCode;
	private String applyProleType;
	private Long applyProleId;
	private String applyProleUuid;
	private String applyProleCode;
	private Date complDate;
	private Date expComplDate;
	private Date applDate;
	private String orderType;
	private String orderSubType;
	private String status;
	private Long salesId;
	private String salesUuid;
	private Long salesTeamId;
	private Long salesDeptId;
	private Long bulkOrderId;
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
	private Set<TblOrderItem> tblOrderItems = new HashSet(0);
	private Set<TblOrderMeta> tblOrderMetas = new HashSet(0);

	public TblOrder() {
	}

	public TblOrder(long recordId) {
		this.recordId = recordId;
	}

	public TblOrder(long recordId, String code, Long partitionId, Long processFailCount, Long POrderId, String quoteRef,
			String source, String cancellationReason, Date cancellationDate, String processInstId,
			String ownerProleType, Long ownerProleId, String ownerProleUuid, String ownerProleCode,
			String applyProleType, Long applyProleId, String applyProleUuid, String applyProleCode, Date complDate,
			Date expComplDate, Date applDate, String orderType, String orderSubType, String status, Long salesId,
			String salesUuid, Long salesTeamId, Long salesDeptId, Long bulkOrderId, String createProleType,
			Long createProleId, String createProleName, String createProleCode, Date createTime, String modifyProleType,
			Long modifyProleId, String modifyProleName, String modifyProleCode, Date modifyTime, Set<TblOrderItem> tblOrderItems,
			Set<TblOrderMeta> tblOrderMetas) {
		this.recordId = recordId;
		this.code = code;
		this.partitionId = partitionId;
		this.processFailCount = processFailCount;
		this.POrderId = POrderId;
		this.quoteRef = quoteRef;
		this.source = source;
		this.cancellationReason = cancellationReason;
		this.cancellationDate = cancellationDate;
		this.processInstId = processInstId;
		this.ownerProleType = ownerProleType;
		this.ownerProleId = ownerProleId;
		this.ownerProleUuid = ownerProleUuid;
		this.ownerProleCode = ownerProleCode;
		this.applyProleType = applyProleType;
		this.applyProleId = applyProleId;
		this.applyProleUuid = applyProleUuid;
		this.applyProleCode = applyProleCode;
		this.complDate = complDate;
		this.expComplDate = expComplDate;
		this.applDate = applDate;
		this.orderType = orderType;
		this.orderSubType = orderSubType;
		this.status = status;
		this.salesId = salesId;
		this.salesUuid = salesUuid;
		this.salesTeamId = salesTeamId;
		this.salesDeptId = salesDeptId;
		this.bulkOrderId = bulkOrderId;
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
		this.tblOrderItems = tblOrderItems;
		this.tblOrderMetas = tblOrderMetas;
	}

	@Id

	@Column(name = "record_id", unique = true, nullable = false)
	public long getRecordId() {
		return this.recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	@Column(name = "code", length = 64)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "partition_id")
	public Long getPartitionId() {
		return this.partitionId;
	}

	public void setPartitionId(Long partitionId) {
		this.partitionId = partitionId;
	}

	@Column(name = "process_fail_count")
	public Long getProcessFailCount() {
		return this.processFailCount;
	}

	public void setProcessFailCount(Long processFailCount) {
		this.processFailCount = processFailCount;
	}

	@Column(name = "p_order_id")
	public Long getPOrderId() {
		return this.POrderId;
	}

	public void setPOrderId(Long POrderId) {
		this.POrderId = POrderId;
	}

	@Column(name = "quote_ref", length = 64)
	public String getQuoteRef() {
		return this.quoteRef;
	}

	public void setQuoteRef(String quoteRef) {
		this.quoteRef = quoteRef;
	}

	@Column(name = "source", length = 50)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "cancellation_reason", length = 4000)
	public String getCancellationReason() {
		return this.cancellationReason;
	}

	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cancellation_date", length = 19)
	public Date getCancellationDate() {
		return this.cancellationDate;
	}

	public void setCancellationDate(Date cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	@Column(name = "process_inst_id", length = 64)
	public String getProcessInstId() {
		return this.processInstId;
	}

	public void setProcessInstId(String processInstId) {
		this.processInstId = processInstId;
	}

	@Column(name = "owner_prole_type", length = 50)
	public String getOwnerProleType() {
		return this.ownerProleType;
	}

	public void setOwnerProleType(String ownerProleType) {
		this.ownerProleType = ownerProleType;
	}

	@Column(name = "owner_prole_id")
	public Long getOwnerProleId() {
		return this.ownerProleId;
	}

	public void setOwnerProleId(Long ownerProleId) {
		this.ownerProleId = ownerProleId;
	}

	@Column(name = "owner_prole_uuid", length = 64)
	public String getOwnerProleUuid() {
		return this.ownerProleUuid;
	}

	public void setOwnerProleUuid(String ownerProleUuid) {
		this.ownerProleUuid = ownerProleUuid;
	}

	@Column(name = "owner_prole_code", length = 64)
	public String getOwnerProleCode() {
		return this.ownerProleCode;
	}

	public void setOwnerProleCode(String ownerProleCode) {
		this.ownerProleCode = ownerProleCode;
	}

	@Column(name = "apply_prole_type", length = 50)
	public String getApplyProleType() {
		return this.applyProleType;
	}

	public void setApplyProleType(String applyProleType) {
		this.applyProleType = applyProleType;
	}

	@Column(name = "apply_prole_id")
	public Long getApplyProleId() {
		return this.applyProleId;
	}

	public void setApplyProleId(Long applyProleId) {
		this.applyProleId = applyProleId;
	}

	@Column(name = "apply_prole_uuid", length = 64)
	public String getApplyProleUuid() {
		return this.applyProleUuid;
	}

	public void setApplyProleUuid(String applyProleUuid) {
		this.applyProleUuid = applyProleUuid;
	}

	@Column(name = "apply_prole_code", length = 64)
	public String getApplyProleCode() {
		return this.applyProleCode;
	}

	public void setApplyProleCode(String applyProleCode) {
		this.applyProleCode = applyProleCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "compl_date", length = 19)
	public Date getComplDate() {
		return this.complDate;
	}

	public void setComplDate(Date complDate) {
		this.complDate = complDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "exp_compl_date", length = 19)
	public Date getExpComplDate() {
		return this.expComplDate;
	}

	public void setExpComplDate(Date expComplDate) {
		this.expComplDate = expComplDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "appl_date", length = 19)
	public Date getApplDate() {
		return this.applDate;
	}

	public void setApplDate(Date applDate) {
		this.applDate = applDate;
	}

	@Column(name = "order_type", length = 50)
	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Column(name = "order_sub_type", length = 50)
	public String getOrderSubType() {
		return this.orderSubType;
	}

	public void setOrderSubType(String orderSubType) {
		this.orderSubType = orderSubType;
	}

	@Column(name = "status", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "sales_id")
	public Long getSalesId() {
		return this.salesId;
	}

	public void setSalesId(Long salesId) {
		this.salesId = salesId;
	}

	@Column(name = "sales_uuid", length = 64)
	public String getSalesUuid() {
		return this.salesUuid;
	}

	public void setSalesUuid(String salesUuid) {
		this.salesUuid = salesUuid;
	}

	@Column(name = "sales_team_id")
	public Long getSalesTeamId() {
		return this.salesTeamId;
	}

	public void setSalesTeamId(Long salesTeamId) {
		this.salesTeamId = salesTeamId;
	}

	@Column(name = "sales_dept_id")
	public Long getSalesDeptId() {
		return this.salesDeptId;
	}

	public void setSalesDeptId(Long salesDeptId) {
		this.salesDeptId = salesDeptId;
	}

	@Column(name = "bulk_order_id")
	public Long getBulkOrderId() {
		return this.bulkOrderId;
	}

	public void setBulkOrderId(Long bulkOrderId) {
		this.bulkOrderId = bulkOrderId;
	}

	@Column(name = "create_prole_type", length = 50)
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

	@Column(name = "modify_prole_type", length = 50)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOrder")
	public Set<TblOrderItem> getTblOrderItems() {
		return this.tblOrderItems;
	}

	public void setTblOrderItems(Set<TblOrderItem> tblOrderItems) {
		this.tblOrderItems = tblOrderItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOrder")
	public Set<TblOrderMeta> getTblOrderMetas() {
		return this.tblOrderMetas;
	}

	public void setTblOrderMetas(Set<TblOrderMeta> tblOrderMetas) {
		this.tblOrderMetas = tblOrderMetas;
	}

}
