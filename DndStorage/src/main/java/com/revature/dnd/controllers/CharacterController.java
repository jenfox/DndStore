package com.revature.dnd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dnd.beans.Character;
import com.revature.dnd.services.CharacterService;

@RestController
public class CharacterController {

	@Autowired
	private CharacterService characterService;

	@GetMapping("/character/{id}")
	public Character getCharacter(@PathVariable Integer id) {

		return characterService.getCharacterById(id);
	}

	@PostMapping("/character")
	public String postCharacter(@RequestBody Character character) {

		characterService.postCharacter(character);

		return "Posted?";
	}

	@GetMapping("/characters")
	public List<Character> getCharacters() {

		return characterService.getAllCharacters();
	}

}
