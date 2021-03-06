/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_658_REF", schema = "TEST")
public interface T_658_REF_INTERFACE extends java.lang.Cloneable {

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_11
	 * FOREIGN KEY (REF_11)
	 * REFERENCES TEST.T_658_11 (ID)
	 * </pre></code>
	 */
	public void setREF_11(org.jooq.test.oracle3.generatedclasses.enums.T_658_11 value);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_11
	 * FOREIGN KEY (REF_11)
	 * REFERENCES TEST.T_658_11 (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "REF_11", length = 3)
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_11 getREF_11();

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_21
	 * FOREIGN KEY (REF_21)
	 * REFERENCES TEST.T_658_21 (ID)
	 * </pre></code>
	 */
	public void setREF_21(org.jooq.test.oracle3.generatedclasses.enums.T_658_21 value);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_21
	 * FOREIGN KEY (REF_21)
	 * REFERENCES TEST.T_658_21 (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "REF_21", precision = 7)
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_21 getREF_21();

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_31
	 * FOREIGN KEY (REF_31)
	 * REFERENCES TEST.T_658_31 (ID)
	 * </pre></code>
	 */
	public void setREF_31(org.jooq.test.oracle3.generatedclasses.enums.T_658_31 value);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_31
	 * FOREIGN KEY (REF_31)
	 * REFERENCES TEST.T_658_31 (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "REF_31", precision = 15)
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_31 getREF_31();

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_12
	 * FOREIGN KEY (REF_12)
	 * REFERENCES TEST.T_658_12 (ID)
	 * </pre></code>
	 */
	public void setREF_12(org.jooq.test.oracle3.generatedclasses.enums.T_658_12 value);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_12
	 * FOREIGN KEY (REF_12)
	 * REFERENCES TEST.T_658_12 (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "REF_12", length = 3)
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_12 getREF_12();

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_22
	 * FOREIGN KEY (REF_22)
	 * REFERENCES TEST.T_658_22 (ID)
	 * </pre></code>
	 */
	public void setREF_22(org.jooq.test.oracle3.generatedclasses.enums.T_658_22 value);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_22
	 * FOREIGN KEY (REF_22)
	 * REFERENCES TEST.T_658_22 (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "REF_22", precision = 7)
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_22 getREF_22();

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_32
	 * FOREIGN KEY (REF_32)
	 * REFERENCES TEST.T_658_32 (ID)
	 * </pre></code>
	 */
	public void setREF_32(org.jooq.test.oracle3.generatedclasses.enums.T_658_32 value);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_658_32
	 * FOREIGN KEY (REF_32)
	 * REFERENCES TEST.T_658_32 (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "REF_32", precision = 15)
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_32 getREF_32();
}
