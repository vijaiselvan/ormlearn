package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Employee;

public interface EmployeeService {

	public Employee get(int id);

	public void save(Employee employee);
}