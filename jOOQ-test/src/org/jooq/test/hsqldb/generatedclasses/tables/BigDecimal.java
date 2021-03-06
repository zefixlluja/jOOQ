/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class BigDecimal extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord> {

	private static final long serialVersionUID = 291085008;

	/**
	 * The singleton instance of PUBLIC.BIG_DECIMAL
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal BIG_DECIMAL = new org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord.class;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord, java.math.BigInteger> OTHER = createField("OTHER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, this);

	public BigDecimal() {
		super("BIG_DECIMAL", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	public BigDecimal(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal.BIG_DECIMAL);
	}

	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal(alias);
	}
}
