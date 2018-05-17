package com.revature.dnd.beans;

import javax.persistence.Id;

import com.revature.dnd.beans.Enums.ABILITIES;

//TODO make a valid entity
public class SpellBook {

	@Id
	private Integer characterId;

	private com.revature.dnd.beans.Enums.ABILITIES spellcastingAbility;
	private Integer spellSaveDC;
	private Integer spellAttackBonus;

	private String[][] spells;

	public SpellBook() {
	}

	public SpellBook(Integer characterId, ABILITIES spellcastingAbility, Integer spellSaveDC, Integer spellAttackBonus,
			String[][] spells) {
		super();
		this.characterId = characterId;
		this.spellcastingAbility = spellcastingAbility;
		this.spellSaveDC = spellSaveDC;
		this.spellAttackBonus = spellAttackBonus;
		this.spells = spells;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public ABILITIES getSpellcastingAbility() {
		return spellcastingAbility;
	}

	public void setSpellcastingAbility(ABILITIES spellcastingAbility) {
		this.spellcastingAbility = spellcastingAbility;
	}

	public Integer getSpellSaveDC() {
		return spellSaveDC;
	}

	public void setSpellSaveDC(Integer spellSaveDC) {
		this.spellSaveDC = spellSaveDC;
	}

	public Integer getSpellAttackBonus() {
		return spellAttackBonus;
	}

	public void setSpellAttackBonus(Integer spellAttackBonus) {
		this.spellAttackBonus = spellAttackBonus;
	}

	public String[][] getSpells() {
		return spells;
	}

	public void setSpells(String[][] spells) {
		this.spells = spells;
	}

}
