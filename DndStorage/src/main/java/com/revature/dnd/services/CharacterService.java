package com.revature.dnd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dnd.beans.Character;
import com.revature.dnd.repositories.CharacterRepo;

@Service
public class CharacterService {

	@Autowired
	private CharacterRepo characterRepo;

	public Character getCharacterById(Integer id) {
		return characterRepo.getOne(id);
	}

	public void postCharacter(Character character) {
		characterRepo.save(character);
	}

	public List<Character> getAllCharacters() {
		return characterRepo.findAll();
	}

}
