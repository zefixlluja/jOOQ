/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "JobCandidate", schema = "HumanResources")
public class JobCandidate extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate> {

	private static final long serialVersionUID = 1279573507;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setJobCandidateID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate.JobCandidateID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "JobCandidateID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getJobCandidateID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate.JobCandidateID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_JobCandidate_Employee_EmployeeID
	 * FOREIGN KEY (EmployeeID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	public void setEmployeeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate.EmployeeID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_JobCandidate_Employee_EmployeeID
	 * FOREIGN KEY (EmployeeID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "EmployeeID", precision = 10)
	public java.lang.Integer getEmployeeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate.EmployeeID);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setResume(java.lang.Object value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate.Resume, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	@javax.persistence.Column(name = "Resume")
	public java.lang.Object getResume() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate.Resume);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate.ModifiedDate);
	}

	/**
	 * Create a detached JobCandidate
	 */
	public JobCandidate() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate);
	}
}
