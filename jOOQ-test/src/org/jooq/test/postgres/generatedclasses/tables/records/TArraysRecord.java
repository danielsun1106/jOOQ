/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_arrays", schema = "public")
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.String[], java.lang.Integer[], java.sql.Date[], org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[], org.jooq.test.postgres.generatedclasses.enums.UCountry[], java.lang.Integer[]> {

	private static final long serialVersionUID = -235973469;

	/**
	 * Setter for <code>public.t_arrays.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ID, value);
	}

	/**
	 * Getter for <code>public.t_arrays.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ID);
	}

	/**
	 * Setter for <code>public.t_arrays.string_array</code>. 
	 */
	public void setStringArray(java.lang.String[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.STRING_ARRAY, value);
	}

	/**
	 * Getter for <code>public.t_arrays.string_array</code>. 
	 */
	@javax.persistence.Column(name = "string_array")
	public java.lang.String[] getStringArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.STRING_ARRAY);
	}

	/**
	 * Setter for <code>public.t_arrays.number_array</code>. 
	 */
	public void setNumberArray(java.lang.Integer[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.NUMBER_ARRAY, value);
	}

	/**
	 * Getter for <code>public.t_arrays.number_array</code>. 
	 */
	@javax.persistence.Column(name = "number_array")
	public java.lang.Integer[] getNumberArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.NUMBER_ARRAY);
	}

	/**
	 * Setter for <code>public.t_arrays.date_array</code>. 
	 */
	public void setDateArray(java.sql.Date[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.DATE_ARRAY, value);
	}

	/**
	 * Getter for <code>public.t_arrays.date_array</code>. 
	 */
	@javax.persistence.Column(name = "date_array")
	public java.sql.Date[] getDateArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.DATE_ARRAY);
	}

	/**
	 * Setter for <code>public.t_arrays.udt_array</code>. 
	 */
	public void setUdtArray(org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.UDT_ARRAY, value);
	}

	/**
	 * Getter for <code>public.t_arrays.udt_array</code>. 
	 */
	@javax.persistence.Column(name = "udt_array")
	public org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] getUdtArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.UDT_ARRAY);
	}

	/**
	 * Setter for <code>public.t_arrays.enum_array</code>. 
	 */
	public void setEnumArray(org.jooq.test.postgres.generatedclasses.enums.UCountry[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ENUM_ARRAY, value);
	}

	/**
	 * Getter for <code>public.t_arrays.enum_array</code>. 
	 */
	@javax.persistence.Column(name = "enum_array")
	public org.jooq.test.postgres.generatedclasses.enums.UCountry[] getEnumArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ENUM_ARRAY);
	}

	/**
	 * Setter for <code>public.t_arrays.array_array</code>. 
	 */
	public void setArrayArray(java.lang.Integer[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ARRAY_ARRAY, value);
	}

	/**
	 * Getter for <code>public.t_arrays.array_array</code>. 
	 */
	@javax.persistence.Column(name = "array_array")
	public java.lang.Integer[] getArrayArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ARRAY_ARRAY);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String[], java.lang.Integer[], java.sql.Date[], org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[], org.jooq.test.postgres.generatedclasses.enums.UCountry[], java.lang.Integer[]> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String[], java.lang.Integer[], java.sql.Date[], org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[], org.jooq.test.postgres.generatedclasses.enums.UCountry[], java.lang.Integer[]> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String[]> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.STRING_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer[]> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.NUMBER_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date[]> field4() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.DATE_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[]> field5() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.UDT_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.postgres.generatedclasses.enums.UCountry[]> field6() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ENUM_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer[]> field7() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ARRAY_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String[] value2() {
		return getStringArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer[] value3() {
		return getNumberArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date[] value4() {
		return getDateArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] value5() {
		return getUdtArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.enums.UCountry[] value6() {
		return getEnumArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer[] value7() {
		return getArrayArray();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS);
	}
}
