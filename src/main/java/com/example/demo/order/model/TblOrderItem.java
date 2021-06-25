package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:43 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblOrderItem generated by hbm2java
 */
@Entity
@Table(name = "tbl_order_item", catalog = "crmord")
public class TblOrderItem implements java.io.Serializable {

	private long recordId;
	private TblOrder tblOrder;
	private TblOrderItem tblOrderItem;
	private Integer itemSeq;
	private String categoryDesc;
	private String itemType;
	private String itemSubType;
	private Long itemId;
	private String itemDesc;
	private Date complDate;
	private Date expComplDate;
	private String actionType;
	private String isBundle;
	private Long custItemInstId;
	private String cancellationReason;
	private Date cancellationDate;
	private String processInstId;
	private Date effStartDate;
	private Date effEndDate;
	private String markDelInd;
	private String status;
	private String ownerProleType;
	private Long ownerProleId;
	private String ownerProleUuid;
	private String ownerProleCode;
	private String entityProleType;
	private Long entityProleId;
	private String entityProleUuid;
	private String entityProleCode;
	private String applyProleType;
	private Long applyProleId;
	private String applyProleUuid;
	private String applyProleCode;
	private Long acctId;
	private String acctNo;
	private String waiveInd;
	private BigDecimal penaltyAmt;
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
	private String itemCode;
	private String categoryCode;
	private String itemName;
	private Set<TblOrderItem> tblOrderItems = new HashSet(0);
	private Set<TblOrderItemTermPrice> tblOrderItemTermPrices = new HashSet(0);
	private Set<TblOrderItemPrice> tblOrderItemPrices = new HashSet(0);
	private Set<TblOrderItemProp> tblOrderItemProps = new HashSet(0);
	private Set<TblOrderItemForderAssgn> tblOrderItemForderAssgns = new HashSet(0);
	private Set<TblOrderAddr> tblOrderAddrs = new HashSet(0);
	private Set<TblOrderItemMeta> tblOrderItemMetas = new HashSet(0);
	private Set<TblOrderItemRsc> tblOrderItemRscs = new HashSet(0);
	private Set<TblOrderItemTerm> tblOrderItemTerms = new HashSet(0);

	public TblOrderItem() {
	}

	public TblOrderItem(long recordId) {
		this.recordId = recordId;
	}

	public TblOrderItem(long recordId, TblOrder tblOrder, TblOrderItem tblOrderItem, Integer itemSeq,
			String categoryDesc, String itemType, String itemSubType, Long itemId, String itemDesc, Date complDate,
			Date expComplDate, String actionType, String isBundle, Long custItemInstId, String cancellationReason,
			Date cancellationDate, String processInstId, Date effStartDate, Date effEndDate, String markDelInd,
			String status, String ownerProleType, Long ownerProleId, String ownerProleUuid, String ownerProleCode,
			String entityProleType, Long entityProleId, String entityProleUuid, String entityProleCode,
			String applyProleType, Long applyProleId, String applyProleUuid, String applyProleCode, Long acctId,
			String acctNo, String waiveInd, BigDecimal penaltyAmt, String createProleType, Long createProleId,
			String createProleName, String createProleCode, Date createTime, String modifyProleType, Long modifyProleId,
			String modifyProleName, String modifyProleCode, Date modifyTime, String itemCode, String categoryCode,
			String itemName, Set<TblOrderItem> tblOrderItems, Set<TblOrderItemTermPrice> tblOrderItemTermPrices, Set<TblOrderItemPrice> tblOrderItemPrices,
			Set<TblOrderItemProp> tblOrderItemProps, Set<TblOrderItemForderAssgn> tblOrderItemForderAssgns, Set<TblOrderAddr> tblOrderAddrs, Set<TblOrderItemMeta> tblOrderItemMetas,
			Set<TblOrderItemRsc> tblOrderItemRscs, Set<TblOrderItemTerm> tblOrderItemTerms) {
		this.recordId = recordId;
		this.tblOrder = tblOrder;
		this.tblOrderItem = tblOrderItem;
		this.itemSeq = itemSeq;
		this.categoryDesc = categoryDesc;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemId = itemId;
		this.itemDesc = itemDesc;
		this.complDate = complDate;
		this.expComplDate = expComplDate;
		this.actionType = actionType;
		this.isBundle = isBundle;
		this.custItemInstId = custItemInstId;
		this.cancellationReason = cancellationReason;
		this.cancellationDate = cancellationDate;
		this.processInstId = processInstId;
		this.effStartDate = effStartDate;
		this.effEndDate = effEndDate;
		this.markDelInd = markDelInd;
		this.status = status;
		this.ownerProleType = ownerProleType;
		this.ownerProleId = ownerProleId;
		this.ownerProleUuid = ownerProleUuid;
		this.ownerProleCode = ownerProleCode;
		this.entityProleType = entityProleType;
		this.entityProleId = entityProleId;
		this.entityProleUuid = entityProleUuid;
		this.entityProleCode = entityProleCode;
		this.applyProleType = applyProleType;
		this.applyProleId = applyProleId;
		this.applyProleUuid = applyProleUuid;
		this.applyProleCode = applyProleCode;
		this.acctId = acctId;
		this.acctNo = acctNo;
		this.waiveInd = waiveInd;
		this.penaltyAmt = penaltyAmt;
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
		this.itemCode = itemCode;
		this.categoryCode = categoryCode;
		this.itemName = itemName;
		this.tblOrderItems = tblOrderItems;
		this.tblOrderItemTermPrices = tblOrderItemTermPrices;
		this.tblOrderItemPrices = tblOrderItemPrices;
		this.tblOrderItemProps = tblOrderItemProps;
		this.tblOrderItemForderAssgns = tblOrderItemForderAssgns;
		this.tblOrderAddrs = tblOrderAddrs;
		this.tblOrderItemMetas = tblOrderItemMetas;
		this.tblOrderItemRscs = tblOrderItemRscs;
		this.tblOrderItemTerms = tblOrderItemTerms;
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
	@JoinColumn(name = "order_id")
	public TblOrder getTblOrder() {
		return this.tblOrder;
	}

	public void setTblOrder(TblOrder tblOrder) {
		this.tblOrder = tblOrder;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "p_order_item_id")
	public TblOrderItem getTblOrderItem() {
		return this.tblOrderItem;
	}

	public void setTblOrderItem(TblOrderItem tblOrderItem) {
		this.tblOrderItem = tblOrderItem;
	}

	@Column(name = "item_seq")
	public Integer getItemSeq() {
		return this.itemSeq;
	}

	public void setItemSeq(Integer itemSeq) {
		this.itemSeq = itemSeq;
	}

	@Column(name = "category_desc", length = 64)
	public String getCategoryDesc() {
		return this.categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	@Column(name = "item_type", length = 50)
	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	@Column(name = "item_sub_type", length = 50)
	public String getItemSubType() {
		return this.itemSubType;
	}

	public void setItemSubType(String itemSubType) {
		this.itemSubType = itemSubType;
	}

	@Column(name = "item_id")
	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	@Column(name = "item_desc", length = 4000)
	public String getItemDesc() {
		return this.itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
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

	@Column(name = "action_type", length = 32)
	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	@Column(name = "is_bundle", length = 12)
	public String getIsBundle() {
		return this.isBundle;
	}

	public void setIsBundle(String isBundle) {
		this.isBundle = isBundle;
	}

	@Column(name = "cust_item_inst_id")
	public Long getCustItemInstId() {
		return this.custItemInstId;
	}

	public void setCustItemInstId(Long custItemInstId) {
		this.custItemInstId = custItemInstId;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "eff_start_date", length = 19)
	public Date getEffStartDate() {
		return this.effStartDate;
	}

	public void setEffStartDate(Date effStartDate) {
		this.effStartDate = effStartDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "eff_end_date", length = 19)
	public Date getEffEndDate() {
		return this.effEndDate;
	}

	public void setEffEndDate(Date effEndDate) {
		this.effEndDate = effEndDate;
	}

	@Column(name = "mark_del_ind", length = 12)
	public String getMarkDelInd() {
		return this.markDelInd;
	}

	public void setMarkDelInd(String markDelInd) {
		this.markDelInd = markDelInd;
	}

	@Column(name = "status", length = 32)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	@Column(name = "entity_prole_type", length = 50)
	public String getEntityProleType() {
		return this.entityProleType;
	}

	public void setEntityProleType(String entityProleType) {
		this.entityProleType = entityProleType;
	}

	@Column(name = "entity_prole_id")
	public Long getEntityProleId() {
		return this.entityProleId;
	}

	public void setEntityProleId(Long entityProleId) {
		this.entityProleId = entityProleId;
	}

	@Column(name = "entity_prole_uuid", length = 64)
	public String getEntityProleUuid() {
		return this.entityProleUuid;
	}

	public void setEntityProleUuid(String entityProleUuid) {
		this.entityProleUuid = entityProleUuid;
	}

	@Column(name = "entity_prole_code", length = 64)
	public String getEntityProleCode() {
		return this.entityProleCode;
	}

	public void setEntityProleCode(String entityProleCode) {
		this.entityProleCode = entityProleCode;
	}

	@Column(name = "apply_prole_type", length = 12)
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

	@Column(name = "acct_id")
	public Long getAcctId() {
		return this.acctId;
	}

	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}

	@Column(name = "acct_no", length = 64)
	public String getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	@Column(name = "waive_ind", length = 12)
	public String getWaiveInd() {
		return this.waiveInd;
	}

	public void setWaiveInd(String waiveInd) {
		this.waiveInd = waiveInd;
	}

	@Column(name = "penalty_amt", precision = 20)
	public BigDecimal getPenaltyAmt() {
		return this.penaltyAmt;
	}

	public void setPenaltyAmt(BigDecimal penaltyAmt) {
		this.penaltyAmt = penaltyAmt;
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

	@Column(name = "item_code", length = 64)
	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	@Column(name = "category_code", length = 64)
	public String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	@Column(name = "item_name", length = 4000)
	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOrderItem")
	public Set<TblOrderItem> getTblOrderItems() {
		return this.tblOrderItems;
	}

	public void setTblOrderItems(Set<TblOrderItem> tblOrderItems) {
		this.tblOrderItems = tblOrderItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOrderItem")
	public Set<TblOrderItemTermPrice> getTblOrderItemTermPrices() {
		return this.tblOrderItemTermPrices;
	}

	public void setTblOrderItemTermPrices(Set<TblOrderItemTermPrice> tblOrderItemTermPrices) {
		this.tblOrderItemTermPrices = tblOrderItemTermPrices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOrderItem")
	public Set<TblOrderItemPrice> getTblOrderItemPrices() {
		return this.tblOrderItemPrices;
	}

	public void setTblOrderItemPrices(Set<TblOrderItemPrice> tblOrderItemPrices) {
		this.tblOrderItemPrices = tblOrderItemPrices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOrderItem")
	public Set<TblOrderItemProp> getTblOrderItemProps() {
		return this.tblOrderItemProps;
	}

	public void setTblOrderItemProps(Set<TblOrderItemProp> tblOrderItemProps) {
		this.tblOrderItemProps = tblOrderItemProps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOrderItem")
	public Set<TblOrderItemForderAssgn> getTblOrderItemForderAssgns() {
		return this.tblOrderItemForderAssgns;
	}

	public void setTblOrderItemForderAssgns(Set<TblOrderItemForderAssgn> tblOrderItemForderAssgns) {
		this.tblOrderItemForderAssgns = tblOrderItemForderAssgns;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOrderItem")
	public Set<TblOrderAddr> getTblOrderAddrs() {
		return this.tblOrderAddrs;
	}

	public void setTblOrderAddrs(Set<TblOrderAddr> tblOrderAddrs) {
		this.tblOrderAddrs = tblOrderAddrs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOrderItem")
	public Set<TblOrderItemMeta> getTblOrderItemMetas() {
		return this.tblOrderItemMetas;
	}

	public void setTblOrderItemMetas(Set<TblOrderItemMeta> tblOrderItemMetas) {
		this.tblOrderItemMetas = tblOrderItemMetas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOrderItem")
	public Set<TblOrderItemRsc> getTblOrderItemRscs() {
		return this.tblOrderItemRscs;
	}

	public void setTblOrderItemRscs(Set<TblOrderItemRsc> tblOrderItemRscs) {
		this.tblOrderItemRscs = tblOrderItemRscs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOrderItem")
	public Set<TblOrderItemTerm> getTblOrderItemTerms() {
		return this.tblOrderItemTerms;
	}

	public void setTblOrderItemTerms(Set<TblOrderItemTerm> tblOrderItemTerms) {
		this.tblOrderItemTerms = tblOrderItemTerms;
	}

}