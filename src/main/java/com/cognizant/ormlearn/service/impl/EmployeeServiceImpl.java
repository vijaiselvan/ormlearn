package com.cognizant.ormlearn.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import com.cognizant.ormlearn.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee get(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void save(Employee employee) {
		repository.save(employee);
	}

	@Override
	public List<Employee> getAllPermanentEmployees() {
		return repository.getAllPermanentEmployees();
	}

	@Override
	public Double getAverageSalary(Integer id) {
		Double averageSalary = repository.getAverageSalary(id);
		return averageSalary;
	}

	@Override
	public List<Employee> getAllEmployeesNative() {
		List<Employee> employees = repository.getAllEmployeesNative();
		return employees;
	}

}