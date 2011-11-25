/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 *
 * Check existence of an author
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class PAuthorExists extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1782609203;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("author_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RESULT = createParameter("result", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PAuthorExists() {
		super(org.jooq.SQLDialect.MYSQL, "p_author_exists", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
	}

	/**
	 * Set the <code>author_name</code> parameter to the routine
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(AUTHOR_NAME, value);
	}

	public java.lang.Integer getResult() {
		return getValue(RESULT);
	}
}