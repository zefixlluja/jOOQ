/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.derby.DerbyDataType;
import org.jooq.util.derby.sys.Sys;
import org.jooq.util.derby.sys.tables.records.SyscolumnsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Syscolumns extends TableImpl<SyscolumnsRecord> {

	private static final long serialVersionUID = -509966608;

	/**
	 * The singleton instance of SYSCOLUMNS
	 */
	public static final Syscolumns SYSCOLUMNS = new Syscolumns();

	/**
	 * The class holding records for this type
	 */
	private static final Class<SyscolumnsRecord> __RECORD_TYPE = SyscolumnsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SyscolumnsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<SyscolumnsRecord, String> REFERENCEID = new TableFieldImpl<SyscolumnsRecord, String>(SQLDialect.DERBY, "REFERENCEID", DerbyDataType.CHAR, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyscolumnsRecord, String> COLUMNNAME = new TableFieldImpl<SyscolumnsRecord, String>(SQLDialect.DERBY, "COLUMNNAME", DerbyDataType.VARCHAR, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyscolumnsRecord, Integer> COLUMNNUMBER = new TableFieldImpl<SyscolumnsRecord, Integer>(SQLDialect.DERBY, "COLUMNNUMBER", DerbyDataType.INTEGER, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyscolumnsRecord, String> COLUMNDATATYPE = new TableFieldImpl<SyscolumnsRecord, String>(SQLDialect.DERBY, "COLUMNDATATYPE", DerbyDataType.ORGAPACHEDERBYCATALOGTYPEDESCRIPTOR, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyscolumnsRecord, String> COLUMNDEFAULT = new TableFieldImpl<SyscolumnsRecord, String>(SQLDialect.DERBY, "COLUMNDEFAULT", DerbyDataType.JAVAIOSERIALIZABLE, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyscolumnsRecord, String> COLUMNDEFAULTID = new TableFieldImpl<SyscolumnsRecord, String>(SQLDialect.DERBY, "COLUMNDEFAULTID", DerbyDataType.CHAR, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyscolumnsRecord, Long> AUTOINCREMENTVALUE = new TableFieldImpl<SyscolumnsRecord, Long>(SQLDialect.DERBY, "AUTOINCREMENTVALUE", DerbyDataType.BIGINT, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyscolumnsRecord, Long> AUTOINCREMENTSTART = new TableFieldImpl<SyscolumnsRecord, Long>(SQLDialect.DERBY, "AUTOINCREMENTSTART", DerbyDataType.BIGINT, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<SyscolumnsRecord, Long> AUTOINCREMENTINC = new TableFieldImpl<SyscolumnsRecord, Long>(SQLDialect.DERBY, "AUTOINCREMENTINC", DerbyDataType.BIGINT, SYSCOLUMNS);

	/**
	 * No further instances allowed
	 */
	private Syscolumns() {
		super(SQLDialect.DERBY, "SYSCOLUMNS", Sys.SYS);
	}
}