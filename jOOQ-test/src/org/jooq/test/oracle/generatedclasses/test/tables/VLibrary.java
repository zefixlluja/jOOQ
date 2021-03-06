/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 314494363;

	/**
	 * The singleton instance of TEST.V_LIBRARY
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.VLibrary V_LIBRARY = new org.jooq.test.oracle.generatedclasses.test.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord.class;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	public VLibrary() {
		super("V_LIBRARY", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	public VLibrary(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.VLibrary.V_LIBRARY);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.VLibrary as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.VLibrary(alias);
	}
}
