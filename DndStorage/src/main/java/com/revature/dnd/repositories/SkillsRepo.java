package com.revature.dnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.dnd.beans.Skills;

public interface SkillsRepo extends JpaRepository<Skills, Integer> {

}
