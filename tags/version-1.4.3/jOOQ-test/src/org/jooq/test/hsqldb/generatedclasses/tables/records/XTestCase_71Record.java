/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;


import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71;


/**
 * This class is generated by jOOQ.
 */
public class XTestCase_71Record extends UpdatableRecordImpl<XTestCase_71Record> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XTestCase_71.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XTestCase_71.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID] REFERENCES X_TEST_CASE_64_69 [PUBLIC.X_TEST_CASE_64_69.ID]
	 */
	public void setTestCase_64_69Id(Short value) {
		setValue(XTestCase_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID] REFERENCES X_TEST_CASE_64_69 [PUBLIC.X_TEST_CASE_64_69.ID]
	 */
	public Short getTestCase_64_69Id() {
		return getValue(XTestCase_71.TEST_CASE_64_69_ID);
	}

	public XTestCase_71Record(Configuration configuration) {
		super(configuration, XTestCase_71.X_TEST_CASE_71);
	}
}
