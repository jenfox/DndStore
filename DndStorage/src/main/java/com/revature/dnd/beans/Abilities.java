package com.revature.dnd.beans;

import javax.persistence.Id;

/**
 *
 * Ability Table, stores score of each ability
 */
public class Abilities {

	@Id
	private Integer characterId;

	private Integer Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma;

	public Abilities() {
	}

	public Abilities(Integer characterId, Integer strength, Integer dexterity, Integer constitution,
			Integer intelligence, Integer wisdom, Integer charisma) {
		super();
		this.characterId = characterId;
		Strength = strength;
		Dexterity = dexterity;
		Constitution = constitution;
		Intelligence = intelligence;
		Wisdom = wisdom;
		Charisma = charisma;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public Integer getStrength() {
		return Strength;
	}

	public void setStrength(Integer strength) {
		Strength = strength;
	}

	public Integer getDexterity() {
		return Dexterity;
	}

	public void setDexterity(Integer dexterity) {
		Dexterity = dexterity;
	}

	public Integer getConstitution() {
		return Constitution;
	}

	public void setConstitution(Integer constitution) {
		Constitution = constitution;
	}

	public Integer getIntelligence() {
		return Intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		Intelligence = intelligence;
	}

	public Integer getWisdom() {
		return Wisdom;
	}

	public void setWisdom(Integer wisdom) {
		Wisdom = wisdom;
	}

	public Integer getCharisma() {
		return Charisma;
	}

	public void setCharisma(Integer charisma) {
		Charisma = charisma;
	}

}