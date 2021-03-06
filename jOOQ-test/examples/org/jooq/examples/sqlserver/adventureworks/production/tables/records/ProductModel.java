/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductModel", schema = "Production")
public class ProductModel extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModel> {

	private static final long serialVersionUID = -955608273;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setProductModelID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.ProductModelID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductModelID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getProductModelID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.ProductModelID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.Name, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.Name);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setCatalogDescription(java.lang.Object value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.CatalogDescription, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	@javax.persistence.Column(name = "CatalogDescription")
	public java.lang.Object getCatalogDescription() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.CatalogDescription);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setInstructions(java.lang.Object value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.Instructions, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	@javax.persistence.Column(name = "Instructions")
	public java.lang.Object getInstructions() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.Instructions);
	}

	/**
	 * An uncommented item
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.rowguid, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.rowguid);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel.ModifiedDate);
	}

	/**
	 * Create a detached ProductModel
	 */
	public ProductModel() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel);
	}
}
