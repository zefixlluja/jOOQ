/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables;


import java.sql.Date;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.oracle.generatedclasses.OdsTest;
import org.jooq.test.oracle.generatedclasses.tables.records.TAuthorRecord;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
public class TAuthor extends UpdatableTableImpl<TAuthorRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of T_AUTHOR
	 */
	public static final TAuthor T_AUTHOR = new TAuthor();

	/**
	 * The class holding records for this table
	 */
	private static final Class<TAuthorRecord> __RECORD_TYPE = TAuthorRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<TAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TAuthorRecord, Integer> ID = new TableFieldImpl<TAuthorRecord, Integer>(SQLDialect.ORACLE, "ID", Integer.class, T_AUTHOR);

	/**
	 * The author's first name
	 */
	public static final TableField<TAuthorRecord, String> FIRST_NAME = new TableFieldImpl<TAuthorRecord, String>(SQLDialect.ORACLE, "FIRST_NAME", String.class, T_AUTHOR);

	/**
	 * The author's last name
	 */
	public static final TableField<TAuthorRecord, String> LAST_NAME = new TableFieldImpl<TAuthorRecord, String>(SQLDialect.ORACLE, "LAST_NAME", String.class, T_AUTHOR);

	/**
	 * The author's date of birth
	 */
	public static final TableField<TAuthorRecord, Date> DATE_OF_BIRTH = new TableFieldImpl<TAuthorRecord, Date>(SQLDialect.ORACLE, "DATE_OF_BIRTH", Date.class, T_AUTHOR);

	/**
	 * The author's year of birth
	 */
	public static final TableField<TAuthorRecord, Integer> YEAR_OF_BIRTH = new TableFieldImpl<TAuthorRecord, Integer>(SQLDialect.ORACLE, "YEAR_OF_BIRTH", Integer.class, T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super(SQLDialect.ORACLE, "T_AUTHOR", OdsTest.ODS_TEST);
	}

	/*
	 * static initialiser
	 */
	static {
		T_AUTHOR.addToPrimaryKey(ID);
	}

}
