package com.revature.dnd.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Saving Throws Tables - storing proficiencies
 */
@Entity
public class SavingThrows {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer characterId;

	@NotNull
	private Boolean strength, dexterity, constitution, intelligence, wisdom, charisma;

	public SavingThrows() {
	}

	public SavingThrows(Integer id, Integer characterId, @NotNull Boolean strength, @NotNull Boolean dexterity,
			@NotNull Boolean constitution, @NotNull Boolean intelligence, @NotNull Boolean wisdom,
			@NotNull Boolean charisma) {
		super();
		this.id = id;
		this.characterId = characterId;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public Boolean getStrength() {
		return strength;
	}

	public void setStrength(Boolean strength) {
		this.strength = strength;
	}

	public Boolean getDexterity() {
		return dexterity;
	}

	public void setDexterity(Boolean dexterity) {
		this.dexterity = dexterity;
	}

	public Boolean getConstitution() {
		return constitution;
	}

	public void setConstitution(Boolean constitution) {
		this.constitution = constitution;
	}

	public Boolean getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Boolean intelligence) {
		this.intelligence = intelligence;
	}

	public Boolean getWisdom() {
		return wisdom;
	}

	public void setWisdom(Boolean wisdom) {
		this.wisdom = wisdom;
	}

	public Boolean getCharisma() {
		return charisma;
	}

	public void setCharisma(Boolean charisma) {
		this.charisma = charisma;
	}

	@Override
	public String toString() {
		return "SavingThrows [id=" + id + ", characterId=" + characterId + ", strength=" + strength + ", dexterity="
				+ dexterity + ", constitution=" + constitution + ", intelligence=" + intelligence + ", wisdom=" + wisdom
				+ ", charisma=" + charisma + "]";
	}

}
