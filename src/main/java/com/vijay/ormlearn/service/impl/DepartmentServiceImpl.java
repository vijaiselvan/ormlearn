package com.vijay.ormlearn.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.ormlearn.model.Department;
import com.vijay.ormlearn.repository.DepartmentRepository;
import com.vijay.ormlearn.service.DepartmentService;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository repository;

	@Override
	public Department get(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void save(Department department) {
		repository.save(department);
	}
}