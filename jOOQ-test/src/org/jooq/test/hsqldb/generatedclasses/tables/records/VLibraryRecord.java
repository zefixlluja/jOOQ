/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.VLibraryRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IVLibrary {

	private static final long serialVersionUID = -130292311;

	/**
	 * An uncommented item
	 */
	@Override
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY.TITLE);
	}

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY);
	}
}
