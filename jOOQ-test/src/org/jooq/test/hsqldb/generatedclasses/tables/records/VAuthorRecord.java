/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class VAuthorRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.VAuthorRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IVAuthor {

	private static final long serialVersionUID = -705546013;

	/**
	 * An uncommented item
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.ID, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.ID);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.ADDRESS, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.String getAddress() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR.ADDRESS);
	}

	/**
	 * Create a detached VAuthorRecord
	 */
	public VAuthorRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR);
	}
}
