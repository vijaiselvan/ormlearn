package com.vijay.ormlearn.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.ormlearn.model.Skill;
import com.vijay.ormlearn.repository.SkillRepository;
import com.vijay.ormlearn.service.SkillService;

@Service
@Transactional
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillRepository repository;

	@Override
	public Skill get(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void save(Skill skill) {
		repository.save(skill);
	}
}