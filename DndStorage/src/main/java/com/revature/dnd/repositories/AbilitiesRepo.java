package com.revature.dnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.dnd.beans.Abilities;

public interface AbilitiesRepo extends JpaRepository<Abilities, Integer> {

}
