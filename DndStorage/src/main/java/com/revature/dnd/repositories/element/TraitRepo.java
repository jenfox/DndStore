package com.revature.dnd.repositories.element;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.dnd.beans.element.Trait;

public interface TraitRepo extends JpaRepository<Trait, Integer> {

}
