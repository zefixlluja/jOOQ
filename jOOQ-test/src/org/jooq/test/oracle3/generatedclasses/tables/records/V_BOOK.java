/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "V_BOOK", schema = "TEST")
public class V_BOOK extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.V_BOOK> {

	private static final long serialVersionUID = 1381213716;

	/**
	 * An uncommented item
	 */
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.ID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ID")
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setAUTHOR_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "AUTHOR_ID")
	public java.lang.Integer getAUTHOR_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setCO_AUTHOR_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID")
	public java.lang.Integer getCO_AUTHOR_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setDETAILS_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DETAILS_ID")
	public java.lang.Integer getDETAILS_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTITLE(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TITLE")
	public java.lang.String getTITLE() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPUBLISHED_IN(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN")
	public java.lang.Integer getPUBLISHED_IN() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 */
	public void setLANGUAGE_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID")
	public java.lang.Integer getLANGUAGE_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setCONTENT_TEXT(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.String getCONTENT_TEXT() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setCONTENT_PDF(byte[] value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	public byte[] getCONTENT_PDF() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CONTENT_PDF);
	}

	/**
	 * Create a detached V_BOOK
	 */
	public V_BOOK() {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK);
	}
}