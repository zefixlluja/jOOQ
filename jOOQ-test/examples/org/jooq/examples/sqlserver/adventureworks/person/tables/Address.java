/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
public class Address extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address> {

	private static final long serialVersionUID = -14981314;

	/**
	 * The singleton instance of Person.Address
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.Address Address = new org.jooq.examples.sqlserver.adventureworks.person.tables.Address();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address, java.lang.Integer> AddressID = createField("AddressID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address, java.lang.String> AddressLine1 = createField("AddressLine1", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address, java.lang.String> AddressLine2 = createField("AddressLine2", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address, java.lang.String> City = createField("City", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_Address_StateProvince_StateProvinceID
	 * FOREIGN KEY (StateProvinceID)
	 * REFERENCES Person.StateProvince (StateProvinceID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address, java.lang.Integer> StateProvinceID = createField("StateProvinceID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address, java.lang.String> PostalCode = createField("PostalCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public Address() {
		super("Address", org.jooq.examples.sqlserver.adventureworks.person.Person.Person);
	}

	public Address(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.Person, org.jooq.examples.sqlserver.adventureworks.person.tables.Address.Address);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.IDENTITY_Address;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Address_AddressID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Address_AddressID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address, ?>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.FK_Address_StateProvince_StateProvinceID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.Address as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.Address(alias);
	}
}
