package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Department;

public interface DepartmentService {

	public Department get(int id);

	public void save(Department department);
}