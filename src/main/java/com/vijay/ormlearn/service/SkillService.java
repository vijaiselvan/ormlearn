package com.vijay.ormlearn.service;

import com.vijay.ormlearn.model.Skill;

public interface SkillService {

	public Skill get(int id);

	public void save(Skill skill);
}