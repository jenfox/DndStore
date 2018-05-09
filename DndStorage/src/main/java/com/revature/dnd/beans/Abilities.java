package com.revature.dnd.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * Ability Table, stores score of each ability
 */
@Entity
public class Abilities {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma;

	public Abilities() {
	}

	public Abilities(Integer id, Integer strength, Integer dexterity, Integer constitution, Integer intelligence,
			Integer wisdom, Integer charisma) {
		super();
		this.id = id;
		Strength = strength;
		Dexterity = dexterity;
		Constitution = constitution;
		Intelligence = intelligence;
		Wisdom = wisdom;
		Charisma = charisma;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
