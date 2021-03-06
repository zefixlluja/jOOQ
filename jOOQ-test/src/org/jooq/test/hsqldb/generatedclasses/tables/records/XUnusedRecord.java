/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class XUnusedRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.XUnusedRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IXUnused {

	private static final long serialVersionUID = 1218070983;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_85Record> fetchXTestCase_85List() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID)))
			.and(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.NAME)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.hsqldb.generatedclasses.tables.records.XUnusedRecord> fetchXUnusedList() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID_REF.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID)))
			.and(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.NAME)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_64_69Record> fetchXTestCase_64_69List() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@Override
	public java.lang.String getName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.NAME);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setBigInteger(java.math.BigInteger value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.BIG_INTEGER, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.math.BigInteger getBigInteger() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.BIG_INTEGER);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@Override
	public void setIdRef(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID_REF, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@Override
	public java.lang.Integer getIdRef() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID_REF);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public org.jooq.test.hsqldb.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID_REF)))
			.and(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.NAME.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setClass_(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.CLASS, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getClass_() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.CLASS);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setFields_(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.FIELDS, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getFields_() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.FIELDS);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setConfiguration_(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.CONFIGURATION, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getConfiguration_() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.CONFIGURATION);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setUDT(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.U_D_T, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getUDT() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.U_D_T);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setMetaData_(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.META_DATA, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getMetaData_() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.META_DATA);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setType0_(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.TYPE0, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getType0_() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.TYPE0);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setPrimaryKey(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.PRIMARY_KEY, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getPrimaryKey() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.PRIMARY_KEY);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setPrimarykey(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.PRIMARYKEY, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getPrimarykey() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.PRIMARYKEY);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@Override
	public void setNameRef(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@Override
	public java.lang.String getNameRef() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setField_737(java.math.BigDecimal value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.FIELD_737, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.math.BigDecimal getField_737() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.FIELD_737);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setConnection(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.CONNECTION, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getConnection() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.CONNECTION);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setPreparedStatement(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.PREPARED_STATEMENT, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getPreparedStatement() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.PREPARED_STATEMENT);
	}

	/**
	 * Create a detached XUnusedRecord
	 */
	public XUnusedRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED);
	}
}
