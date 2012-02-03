/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class Contactcreditcard extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord> {

	private static final long serialVersionUID = 1001487545;

	/**
	 * The singleton instance of ContactCreditCard
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard CONTACTCREDITCARD = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.ContactCreditCard.ContactID]
	 * REFERENCES Contact [Person.Contact.ContactID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord, java.lang.Integer> CONTACTID = createField("ContactID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.ContactCreditCard.CreditCardID]
	 * REFERENCES CreditCard [Sales.CreditCard.CreditCardID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord, java.lang.Integer> CREDITCARDID = createField("CreditCardID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Contactcreditcard() {
		super("ContactCreditCard", org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES);
	}

	/**
	 * No further instances allowed
	 */
	private Contactcreditcard(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES, org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_ContactCreditCard_ContactID_CreditCardID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_ContactCreditCard_ContactID_CreditCardID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_ContactCreditCard_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_ContactCreditCard_CreditCard_CreditCardID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard(alias);
	}
}