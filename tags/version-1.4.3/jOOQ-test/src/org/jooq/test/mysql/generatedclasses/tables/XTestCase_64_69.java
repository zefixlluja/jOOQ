/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;


import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.mysql.generatedclasses.Test;
import org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record;


/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
public class XTestCase_64_69 extends UpdatableTableImpl<XTestCase_64_69Record> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of x_test_case_64_69
	 */
	public static final XTestCase_64_69 X_TEST_CASE_64_69 = new XTestCase_64_69();

	/**
	 * The class holding records for this table
	 */
	private static final Class<XTestCase_64_69Record> __RECORD_TYPE = XTestCase_64_69Record.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<XTestCase_64_69Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_64_69Record, Integer> ID = new TableFieldImpl<XTestCase_64_69Record, Integer>(SQLDialect.MYSQL, "ID", Integer.class, X_TEST_CASE_64_69);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [test.x_test_case_64_69.UNUSED_ID] REFERENCES x_unused [test.x_unused.ID, test.x_unused.NAME]
	 */
	public static final TableField<XTestCase_64_69Record, Integer> UNUSED_ID = new TableFieldImpl<XTestCase_64_69Record, Integer>(SQLDialect.MYSQL, "UNUSED_ID", Integer.class, X_TEST_CASE_64_69);

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		super(SQLDialect.MYSQL, "x_test_case_64_69", Test.TEST);
	}

	/*
	 * static initialiser
	 */
	static {
		X_TEST_CASE_64_69.addToPrimaryKey(ID);
	}

}
