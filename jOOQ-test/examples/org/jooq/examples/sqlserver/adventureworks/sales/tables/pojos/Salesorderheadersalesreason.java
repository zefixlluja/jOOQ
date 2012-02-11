/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesOrderHeaderSalesReason", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"SalesOrderID", "SalesReasonID"})
})
public class Salesorderheadersalesreason implements java.io.Serializable {

	private static final long serialVersionUID = 267940949;

	private java.lang.Integer  salesorderid;
	private java.lang.Integer  salesreasonid;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Column(name = "SalesOrderID")
	public java.lang.Integer getSalesorderid() {
		return this.salesorderid;
	}

	public void setSalesorderid(java.lang.Integer salesorderid) {
		this.salesorderid = salesorderid;
	}

	@javax.persistence.Column(name = "SalesReasonID")
	public java.lang.Integer getSalesreasonid() {
		return this.salesreasonid;
	}

	public void setSalesreasonid(java.lang.Integer salesreasonid) {
		this.salesreasonid = salesreasonid;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}