/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat;


import org.jooq.SQLDialect;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
public class Syscat extends SchemaImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of SYSCAT
	 */
	public static final Syscat SYSCAT = new Syscat();

	/**
	 * No further instances allowed
	 */
	private Syscat() {
		super(SQLDialect.DB2, "SYSCAT");
	}
}