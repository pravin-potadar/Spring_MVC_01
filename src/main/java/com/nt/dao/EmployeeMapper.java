package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nt.utility.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow( ResultSet rs, int rowNum ) throws SQLException {
		int id = rs.getInt( "id" );
		String name = rs.getString( "name" );
		int sal = rs.getInt( "sal" );
		Employee emp = new Employee( id, name, sal );
		return emp;
	}

}
