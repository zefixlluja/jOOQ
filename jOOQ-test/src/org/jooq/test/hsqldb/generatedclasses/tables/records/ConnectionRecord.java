/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class ConnectionRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ConnectionRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IConnection {

	private static final long serialVersionUID = 1629662901;

	/**
	 * An uncommented item
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Connection.CONNECTION.ID, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Connection.CONNECTION.ID);
	}

	/**
	 * Create a detached ConnectionRecord
	 */
	public ConnectionRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Connection.CONNECTION);
	}
}
