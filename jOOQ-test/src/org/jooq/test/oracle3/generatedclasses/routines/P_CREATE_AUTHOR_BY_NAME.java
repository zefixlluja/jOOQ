/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class P_CREATE_AUTHOR_BY_NAME extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1520715115;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> FIRST_NAME = createParameter("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> LAST_NAME = createParameter("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public P_CREATE_AUTHOR_BY_NAME() {
		super("P_CREATE_AUTHOR_BY_NAME", org.jooq.test.oracle3.generatedclasses.TEST.TEST);

		addInParameter(FIRST_NAME);
		addInParameter(LAST_NAME);
	}

	/**
	 * Set the <code>FIRST_NAME</code> parameter to the routine
	 */
	public void setFIRST_NAME(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.P_CREATE_AUTHOR_BY_NAME.FIRST_NAME, value);
	}

	/**
	 * Set the <code>LAST_NAME</code> parameter to the routine
	 */
	public void setLAST_NAME(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.P_CREATE_AUTHOR_BY_NAME.LAST_NAME, value);
	}
}
