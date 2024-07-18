package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nt.utility.Employee;

@Component
public class EmployeeDao {

	@Autowired
	private JdbcTemplate template;

	public void employeeDataInsert(Employee e) {
		Object[] args = { e.getId(), e.getName(), e.getSal() };
		int result = template.update("insert into emp values(?,?,?)", args);
		System.out.println(result + " record added");

	}

	public void employeeDataUpdate(Employee e) {
		Object[] args = { e.getId(), e.getName(), e.getSal() };
		int result = template.update("insert into emp values(?,?,?)", args);
		System.out.println(result + " record added");

	}

	public void employeeDataUpdate(int id, int sal) {
		Object[] args = { sal, id };
		int result = template.update("update emp set sal = ? where id=?", args);
		System.out.println(result + " record update");

	}

	public void employeeDataDelete(int id) {
		Object[] args = { id };
		int result = template.update("DELETE FROM emp WHERE id=?;", args);
		System.out.println(result + " record delete");

	}

	public Employee employeeDataSelect(int id) {
		Object[] args = { id };
		Employee e = template.queryForObject("select * from emp where id=?", new EmployeeMapper(), args);
		System.out.println(e);
		return e;

	}

	public List<Employee> employeeDataSelectAll() {
		List<Employee> list = template.query( "select * from emp", new EmployeeMapper() );
		return list;
	}



	

}
