package com.demo.dao;

import java.util.List;

import com.demo.Form.EmployeeForm;
import com.demo.Form.SearchForm;
import com.demo.domain.Employee;

public interface EmployeeDao {
	public void addEmployee(EmployeeForm employeeForm);

	public List<Employee> displayEmployee(EmployeeForm employeeForm);

	public List<Employee> findEmployee(SearchForm seachForm);

	public void editEmployee(EmployeeForm employeeForm);

	public EmployeeForm findEmployee(int id);

	public void deleteEmployee(int id);
}
