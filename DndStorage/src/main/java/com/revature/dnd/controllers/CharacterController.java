package com.revature.dnd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Character> getCharacter(@PathVariable Integer id) {

		return ResponseEntity.ok(characterService.getCharacterById(id));
	}

	@GetMapping("/character/name/{characterName}")
	public ResponseEntity<Character> getCharacter(@PathVariable String characterName) {

		return ResponseEntity.ok(characterService.getCharacterByName(characterName));
	}

	@PostMapping("/character")
	public ResponseEntity<Boolean> postCharacter(@RequestBody Character character) {

		return ResponseEntity.ok(characterService.postCharacter(character));
	}

	@GetMapping("/characters")
	public ResponseEntity<List<Character>> getAllCharacters() {

		return ResponseEntity.ok(characterService.getAllCharacters());
	}

}
