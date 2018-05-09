package com.revature.dnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.dnd.beans.Character;

public interface CharacterRepo extends JpaRepository<Character, Integer> {

	public Character getByCharacterName(String characterName);
}
