/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 579309671;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.XTestCase_64_69.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.XTestCase_64_69.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_71Record> fetchXTestCase_71List() {
		return create()
			.selectFrom(org.jooq.test.cubrid.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.cubrid.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID.equal(getValue(org.jooq.test.cubrid.generatedclasses.tables.XTestCase_64_69.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
	}

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.cubrid.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}
}
