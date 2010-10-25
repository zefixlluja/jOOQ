/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;


import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_71;


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
	 * FOREIGN KEY [public.x_test_case_71.test_case_64_69_id] REFERENCES x_test_case_64_69 [public.x_test_case_64_69.id]
	 */
	public void setTestCase_64_69Id(Short value) {
		setValue(XTestCase_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [public.x_test_case_71.test_case_64_69_id] REFERENCES x_test_case_64_69 [public.x_test_case_64_69.id]
	 */
	public Short getTestCase_64_69Id() {
		return getValue(XTestCase_71.TEST_CASE_64_69_ID);
	}

	public XTestCase_71Record(Configuration configuration) {
		super(configuration, XTestCase_71.X_TEST_CASE_71);
	}
}