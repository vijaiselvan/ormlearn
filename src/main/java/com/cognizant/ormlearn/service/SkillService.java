package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Skill;

public interface SkillService {

	public Skill get(int id);

	public void save(Skill skill);
}