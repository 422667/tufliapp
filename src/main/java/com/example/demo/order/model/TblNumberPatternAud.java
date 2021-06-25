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
 * TblNumberPatternAud generated by hbm2java
 */
@Entity
@Table(name = "tbl_number_pattern_aud", catalog = "crmord")
public class TblNumberPatternAud implements java.io.Serializable {

	private TblNumberPatternAudId id;
	private Byte revtype;
	private String type;
	private String PType;
	private String shortForm;
	private long lastNumberUsed;
	private String lastDateElementUsed;
	private long numberLength;
	private String dateElementFormat;
	private String resetOnDateElement;
	private String separatorChar;
	private String requireCheckDigit;
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

	public TblNumberPatternAud() {
	}

	public TblNumberPatternAud(TblNumberPatternAudId id, String type, long lastNumberUsed, long numberLength) {
		this.id = id;
		this.type = type;
		this.lastNumberUsed = lastNumberUsed;
		this.numberLength = numberLength;
	}

	public TblNumberPatternAud(TblNumberPatternAudId id, Byte revtype, String type, String PType, String shortForm,
			long lastNumberUsed, String lastDateElementUsed, long numberLength, String dateElementFormat,
			String resetOnDateElement, String separatorChar, String requireCheckDigit, String createProleType,
			Long createProleId, String createProleName, String createProleCode, Date createTime, String modifyProleType,
			Long modifyProleId, String modifyProleName, String modifyProleCode, Date modifyTime) {
		this.id = id;
		this.revtype = revtype;
		this.type = type;
		this.PType = PType;
		this.shortForm = shortForm;
		this.lastNumberUsed = lastNumberUsed;
		this.lastDateElementUsed = lastDateElementUsed;
		this.numberLength = numberLength;
		this.dateElementFormat = dateElementFormat;
		this.resetOnDateElement = resetOnDateElement;
		this.separatorChar = separatorChar;
		this.requireCheckDigit = requireCheckDigit;
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
	public TblNumberPatternAudId getId() {
		return this.id;
	}

	public void setId(TblNumberPatternAudId id) {
		this.id = id;
	}

	@Column(name = "REVTYPE")
	public Byte getRevtype() {
		return this.revtype;
	}

	public void setRevtype(Byte revtype) {
		this.revtype = revtype;
	}

	@Column(name = "type", nullable = false, length = 64)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "p_type", length = 64)
	public String getPType() {
		return this.PType;
	}

	public void setPType(String PType) {
		this.PType = PType;
	}

	@Column(name = "short_form", length = 64)
	public String getShortForm() {
		return this.shortForm;
	}

	public void setShortForm(String shortForm) {
		this.shortForm = shortForm;
	}

	@Column(name = "last_number_used", nullable = false)
	public long getLastNumberUsed() {
		return this.lastNumberUsed;
	}

	public void setLastNumberUsed(long lastNumberUsed) {
		this.lastNumberUsed = lastNumberUsed;
	}

	@Column(name = "last_date_element_used", length = 32)
	public String getLastDateElementUsed() {
		return this.lastDateElementUsed;
	}

	public void setLastDateElementUsed(String lastDateElementUsed) {
		this.lastDateElementUsed = lastDateElementUsed;
	}

	@Column(name = "number_length", nullable = false)
	public long getNumberLength() {
		return this.numberLength;
	}

	public void setNumberLength(long numberLength) {
		this.numberLength = numberLength;
	}

	@Column(name = "date_element_format", length = 32)
	public String getDateElementFormat() {
		return this.dateElementFormat;
	}

	public void setDateElementFormat(String dateElementFormat) {
		this.dateElementFormat = dateElementFormat;
	}

	@Column(name = "reset_on_date_element", length = 12)
	public String getResetOnDateElement() {
		return this.resetOnDateElement;
	}

	public void setResetOnDateElement(String resetOnDateElement) {
		this.resetOnDateElement = resetOnDateElement;
	}

	@Column(name = "separator_char", length = 12)
	public String getSeparatorChar() {
		return this.separatorChar;
	}

	public void setSeparatorChar(String separatorChar) {
		this.separatorChar = separatorChar;
	}

	@Column(name = "require_check_digit", length = 12)
	public String getRequireCheckDigit() {
		return this.requireCheckDigit;
	}

	public void setRequireCheckDigit(String requireCheckDigit) {
		this.requireCheckDigit = requireCheckDigit;
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