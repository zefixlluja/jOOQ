/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "V_AUTHOR", schema = "TEST")
public interface V_AUTHOR_INTERFACE extends java.lang.Cloneable {

	/**
	 * An uncommented item
	 */
	public void setID(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * An uncommented item
	 */
	public void setFIRST_NAME(java.lang.String value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "FIRST_NAME", length = 50)
	public java.lang.String getFIRST_NAME();

	/**
	 * An uncommented item
	 */
	public void setLAST_NAME(java.lang.String value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LAST_NAME", nullable = false, length = 50)
	public java.lang.String getLAST_NAME();

	/**
	 * An uncommented item
	 */
	public void setDATE_OF_BIRTH(java.sql.Date value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DATE_OF_BIRTH", length = 7)
	public java.sql.Date getDATE_OF_BIRTH();

	/**
	 * An uncommented item
	 */
	public void setYEAR_OF_BIRTH(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "YEAR_OF_BIRTH", precision = 7)
	public java.lang.Integer getYEAR_OF_BIRTH();

	/**
	 * An uncommented item
	 */
	public void setADDRESS(org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ADDRESS", length = 40)
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE getADDRESS();
}
