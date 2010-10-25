/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables;


import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.test.oracle.generatedclasses.OdsTest;
import org.jooq.test.oracle.generatedclasses.tables.records.VLibraryRecord;


/**
 * This class is generated by jOOQ.
 */
public class VLibrary extends TableImpl<VLibraryRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of V_LIBRARY
	 */
	public static final VLibrary V_LIBRARY = new VLibrary();

	/**
	 * The class holding records for this table
	 */
	private static final Class<VLibraryRecord> __RECORD_TYPE = VLibraryRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<VLibraryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<VLibraryRecord, String> AUTHOR = new TableFieldImpl<VLibraryRecord, String>(SQLDialect.ORACLE, "AUTHOR", String.class, V_LIBRARY);

	/**
	 * An uncommented item
	 */
	public static final TableField<VLibraryRecord, String> TITLE = new TableFieldImpl<VLibraryRecord, String>(SQLDialect.ORACLE, "TITLE", String.class, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super(SQLDialect.ORACLE, "V_LIBRARY", OdsTest.ODS_TEST);
	}

}
