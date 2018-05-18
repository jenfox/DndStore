package com.revature.dnd.repositories.element;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.dnd.beans.element.PersonalityTrait;

public interface PersonalityTraitRepo extends JpaRepository<PersonalityTrait, Integer> {

}
