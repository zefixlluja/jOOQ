/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class TBookSaleDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale, java.lang.Integer> {

	/**
	 * Create a new TBookSaleDao without any factory
	 */
	public TBookSaleDao() {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE, org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale.class);
	}

	/**
	 * Create a new TBookSaleDao with an attached factory
	 */
	public TBookSaleDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE, org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale object) {
		return object.getId();
	}
}
