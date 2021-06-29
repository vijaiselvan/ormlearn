package com.vijay.ormlearn.service;

import com.vijay.ormlearn.model.Department;

public interface DepartmentService {

	public Department get(int id);

	public void save(Department department);
}