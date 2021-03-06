/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
public interface ITBookToBookStore {

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES PUBLIC.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	public void setBookStoreName(java.lang.String value);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES PUBLIC.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	public java.lang.String getBookStoreName();

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES PUBLIC.T_BOOK (ID)
	 * </pre></code>
	 */
	public void setBookId(java.lang.Integer value);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES PUBLIC.T_BOOK (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getBookId();

	/**
	 * An uncommented item
	 */
	public void setStock(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getStock();
}
