package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:43 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblOrderItemRscAudId generated by hbm2java
 */
@Embeddable
public class TblOrderItemRscAudId implements java.io.Serializable {

	private long recordId;
	private long rev;

	public TblOrderItemRscAudId() {
	}

	public TblOrderItemRscAudId(long recordId, long rev) {
		this.recordId = recordId;
		this.rev = rev;
	}

	@Column(name = "record_id", nullable = false)
	public long getRecordId() {
		return this.recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	@Column(name = "REV", nullable = false)
	public long getRev() {
		return this.rev;
	}

	public void setRev(long rev) {
		this.rev = rev;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TblOrderItemRscAudId))
			return false;
		TblOrderItemRscAudId castOther = (TblOrderItemRscAudId) other;

		return (this.getRecordId() == castOther.getRecordId()) && (this.getRev() == castOther.getRev());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getRecordId();
		result = 37 * result + (int) this.getRev();
		return result;
	}

}
