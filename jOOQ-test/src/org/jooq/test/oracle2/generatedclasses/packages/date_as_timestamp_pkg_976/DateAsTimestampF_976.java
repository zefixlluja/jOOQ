/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses.packages.date_as_timestamp_pkg_976;

/**
 * This class is generated by jOOQ.
 */
public class DateAsTimestampF_976 extends org.jooq.impl.AbstractRoutine<java.sql.Timestamp> {

	private static final long serialVersionUID = 1227752667;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> DATE_AS_TIMESTAMP_RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> DATE_AS_TIMESTAMP_I = createParameter("I", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public DateAsTimestampF_976() {
		super("F_976", org.jooq.test.oracle2.generatedclasses.DateAsTimestampTest.DATE_AS_TIMESTAMP_TEST, org.jooq.test.oracle2.generatedclasses.packages.DateAsTimestampPkg_976.DATE_AS_TIMESTAMP_PKG_976, org.jooq.impl.SQLDataType.TIMESTAMP);

		setReturnParameter(DATE_AS_TIMESTAMP_RETURN_VALUE);
		addInParameter(DATE_AS_TIMESTAMP_I);
	}

	/**
	 * Set the <code>I</code> parameter to the routine
	 */
	public void setI(java.sql.Timestamp value) {
		setValue(DATE_AS_TIMESTAMP_I, value);
	}

	/**
	 * Set the <code>I</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setI(org.jooq.Field<java.sql.Timestamp> field) {
		setField(DATE_AS_TIMESTAMP_I, field);
	}
}
