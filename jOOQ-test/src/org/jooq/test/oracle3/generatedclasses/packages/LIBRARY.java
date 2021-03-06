/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in LIBRARY
 */
public final class LIBRARY extends org.jooq.impl.PackageImpl implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -1707209763;

	/**
	 * The singleton instance of TEST.LIBRARY
	 */
	public static final org.jooq.test.oracle3.generatedclasses.packages.LIBRARY LIBRARY = new org.jooq.test.oracle3.generatedclasses.packages.LIBRARY();

	/**
	 * Call TEST.LIBRARY.PKG_F_AUTHOR_EXISTS
	 *
	 * @param AUTHOR_NAME
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.math.BigDecimal call_PKG_F_AUTHOR_EXISTS______ABC_1(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1();
		f.setAUTHOR_NAME(AUTHOR_NAME);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get TEST.LIBRARY.PKG_F_AUTHOR_EXISTS as a field
	 *
	 * @param AUTHOR_NAME
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_PKG_F_AUTHOR_EXISTS______ABC_1(java.lang.String AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1();
		f.setAUTHOR_NAME(AUTHOR_NAME);

		return f.asField();
	}

	/**
	 * Get TEST.LIBRARY.PKG_F_AUTHOR_EXISTS as a field
	 *
	 * @param AUTHOR_NAME
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_PKG_F_AUTHOR_EXISTS______ABC_1(org.jooq.Field<java.lang.String> AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1();
		f.setAUTHOR_NAME(AUTHOR_NAME);

		return f.asField();
	}

	/**
	 * Call TEST.LIBRARY.PKG_F_AUTHOR_EXISTS
	 *
	 * @param AUTHOR_NAME
	 * @param UNUSED
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.math.BigDecimal call_PKG_F_AUTHOR_EXISTS______ABC_2(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME, java.lang.Number UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2();
		f.setAUTHOR_NAME(AUTHOR_NAME);
		f.setUNUSED(UNUSED);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get TEST.LIBRARY.PKG_F_AUTHOR_EXISTS as a field
	 *
	 * @param AUTHOR_NAME
	 * @param UNUSED
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_PKG_F_AUTHOR_EXISTS______ABC_2(java.lang.String AUTHOR_NAME, java.lang.Number UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2();
		f.setAUTHOR_NAME(AUTHOR_NAME);
		f.setUNUSED(UNUSED);

		return f.asField();
	}

	/**
	 * Get TEST.LIBRARY.PKG_F_AUTHOR_EXISTS as a field
	 *
	 * @param AUTHOR_NAME
	 * @param UNUSED
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_PKG_F_AUTHOR_EXISTS______ABC_2(org.jooq.Field<java.lang.String> AUTHOR_NAME, org.jooq.Field<? extends java.lang.Number> UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2();
		f.setAUTHOR_NAME(AUTHOR_NAME);
		f.setUNUSED(UNUSED);

		return f.asField();
	}

	/**
	 * Call TEST.LIBRARY.PKG_F_UNUSED
	 *
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.math.BigDecimal call_PKG_F_UNUSED(org.jooq.Configuration configuration) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get TEST.LIBRARY.PKG_F_UNUSED as a field
	 *
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_PKG_F_UNUSED() {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED();

		return f.asField();
	}

	/**
	 * Call TEST.LIBRARY.PKG_F378
	 *
	 * @param RETURN_VALUE OUT parameter
	 * @param I IN parameter
	 * @param IO IN OUT parameter
	 * @param O OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F378 call_PKG_F378(org.jooq.Configuration configuration, java.lang.Number I, java.lang.Number IO) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F378 p = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F378();
		p.setI(I);
		p.setIO(IO);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call TEST.LIBRARY.PKG_P_AUTHOR_EXISTS
	 *
	 * @param AUTHOR_NAME IN parameter
	 * @param RESULT OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.math.BigDecimal call_PKG_P_AUTHOR_EXISTS______ABC_1(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_1 p = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_1();
		p.setAUTHOR_NAME(AUTHOR_NAME);

		p.execute(configuration);
		return p.getRESULT();
	}

	/**
	 * Call TEST.LIBRARY.PKG_P_AUTHOR_EXISTS
	 *
	 * @param AUTHOR_NAME IN parameter
	 * @param RESULT OUT parameter
	 * @param UNUSED IN OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_2 call_PKG_P_AUTHOR_EXISTS______ABC_2(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME, java.lang.Number UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_2 p = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_2();
		p.setAUTHOR_NAME(AUTHOR_NAME);
		p.setUNUSED(UNUSED);

		p.execute(configuration);
		return p;
	}
	/**
	 * No further instances allowed
	 */
	private LIBRARY() {
		super("LIBRARY", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}
}
