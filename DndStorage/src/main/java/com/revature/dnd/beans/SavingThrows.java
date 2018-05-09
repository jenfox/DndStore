package com.revature.dnd.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Saving Throws Tables - storing proficiencies
 */
@Entity
public class SavingThrows {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Boolean Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma;

	public SavingThrows() {
	}

	public SavingThrows(Integer id, Boolean strength, Boolean dexterity, Boolean constitution, Boolean intelligence,
			Boolean wisdom, Boolean charisma) {
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

	public Boolean getStrength() {
		return Strength;
	}

	public void setStrength(Boolean strength) {
		Strength = strength;
	}

	public Boolean getDexterity() {
		return Dexterity;
	}

	public void setDexterity(Boolean dexterity) {
		Dexterity = dexterity;
	}

	public Boolean getConstitution() {
		return Constitution;
	}

	public void setConstitution(Boolean constitution) {
		Constitution = constitution;
	}

	public Boolean getIntelligence() {
		return Intelligence;
	}

	public void setIntelligence(Boolean intelligence) {
		Intelligence = intelligence;
	}

	public Boolean getWisdom() {
		return Wisdom;
	}

	public void setWisdom(Boolean wisdom) {
		Wisdom = wisdom;
	}

	public Boolean getCharisma() {
		return Charisma;
	}

	public void setCharisma(Boolean charisma) {
		Charisma = charisma;
	}

}
