package com.vijay.ormlearn.service;

import java.util.List;

import com.vijay.ormlearn.model.Employee;

public interface EmployeeService {

	public Employee get(int id);

	public void save(Employee employee);

	public List<Employee> getAllPermanentEmployees();

	public Double getAverageSalary(Integer id);
	
	public List<Employee> getAllEmployeesNative();
}