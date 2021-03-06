/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class StoreContact extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact> {

	private static final long serialVersionUID = 1101877073;

	/**
	 * The singleton instance of Sales.StoreContact
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact StoreContact = new org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StoreContact_Store_CustomerID
	 * FOREIGN KEY (CustomerID)
	 * REFERENCES Sales.Store (CustomerID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact, java.lang.Integer> CustomerID = createField("CustomerID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StoreContact_Contact_ContactID
	 * FOREIGN KEY (ContactID)
	 * REFERENCES Person.Contact (ContactID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact, java.lang.Integer> ContactID = createField("ContactID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StoreContact_ContactType_ContactTypeID
	 * FOREIGN KEY (ContactTypeID)
	 * REFERENCES Person.ContactType (ContactTypeID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact, java.lang.Integer> ContactTypeID = createField("ContactTypeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public StoreContact() {
		super("StoreContact", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	public StoreContact(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_StoreContact_CustomerID_ContactID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_StoreContact_CustomerID_ContactID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_StoreContact_Store_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_StoreContact_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_StoreContact_ContactType_ContactTypeID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact(alias);
	}
}
