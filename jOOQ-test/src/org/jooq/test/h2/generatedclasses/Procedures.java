/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures in PUBLIC
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public final class Procedures {

	/**
	 * Invoke P_CREATE_AUTHOR
	 *
	 */
	public static void pCreateAuthor(org.jooq.Configuration configuration) throws java.sql.SQLException {
		org.jooq.test.h2.generatedclasses.procedures.PCreateAuthor p = new org.jooq.test.h2.generatedclasses.procedures.PCreateAuthor();

		p.execute(configuration);
	}

	/**
	 * Invoke P_CREATE_AUTHOR
	 *
	 *
	 * @deprecated 1.6.1 [#453] This method of calling stored functions is not supported anymore<br/>
	 *             See {@link org.jooq.StoredObject#execute(java.sql.Connection)} for details.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public static void pCreateAuthor(java.sql.Connection connection) throws java.sql.SQLException {
		org.jooq.test.h2.generatedclasses.procedures.PCreateAuthor p = new org.jooq.test.h2.generatedclasses.procedures.PCreateAuthor();

		p.execute(connection);
	}

	/**
	 * Invoke P_CREATE_AUTHOR_BY_NAME
	 *
	 * @param p2 IN parameter
	 * @param p3 IN parameter
	 */
	public static void pCreateAuthorByName(org.jooq.Configuration configuration, java.lang.String p2, java.lang.String p3) throws java.sql.SQLException {
		org.jooq.test.h2.generatedclasses.procedures.PCreateAuthorByName p = new org.jooq.test.h2.generatedclasses.procedures.PCreateAuthorByName();
		p.setP2(p2);
		p.setP3(p3);

		p.execute(configuration);
	}

	/**
	 * Invoke P_CREATE_AUTHOR_BY_NAME
	 *
	 * @param p2 IN parameter
	 * @param p3 IN parameter
	 *
	 * @deprecated 1.6.1 [#453] This method of calling stored functions is not supported anymore<br/>
	 *             See {@link org.jooq.StoredObject#execute(java.sql.Connection)} for details.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public static void pCreateAuthorByName(java.sql.Connection connection, java.lang.String p2, java.lang.String p3) throws java.sql.SQLException {
		org.jooq.test.h2.generatedclasses.procedures.PCreateAuthorByName p = new org.jooq.test.h2.generatedclasses.procedures.PCreateAuthorByName();
		p.setP2(p2);
		p.setP3(p3);

		p.execute(connection);
	}

	/**
	 * No instances
	 */
	private Procedures() {}
}