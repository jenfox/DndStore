package com.revature.dnd.beans;

import javax.persistence.Id;

/**
 * Skill Table, stores each skill multiplier value for a character
 */
public class Skills {

	@Id
	private Integer characterId;

	/*
	 * storing prof multiplier 0- not prof, 1- prof, 2- expertise (2x)
	 */
	private Integer Acrobatics, AnimalHandling, Arcana, Athletics, Deception, History, Insight, Intimidation,
			Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, SlightOfHand, Stealth,
			Survival;

	public Skills() {
	}

	public Skills(Integer characterId, Integer acrobatics, Integer animalHandling, Integer arcana, Integer athletics,
			Integer deception, Integer history, Integer insight, Integer intimidation, Integer investigation,
			Integer medicine, Integer nature, Integer perception, Integer performance, Integer persuasion,
			Integer religion, Integer slightOfHand, Integer stealth, Integer survival) {
		super();
		this.characterId = characterId;
		Acrobatics = acrobatics;
		AnimalHandling = animalHandling;
		Arcana = arcana;
		Athletics = athletics;
		Deception = deception;
		History = history;
		Insight = insight;
		Intimidation = intimidation;
		Investigation = investigation;
		Medicine = medicine;
		Nature = nature;
		Perception = perception;
		Performance = performance;
		Persuasion = persuasion;
		Religion = religion;
		SlightOfHand = slightOfHand;
		Stealth = stealth;
		Survival = survival;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public Integer getAcrobatics() {
		return Acrobatics;
	}

	public void setAcrobatics(Integer acrobatics) {
		Acrobatics = acrobatics;
	}

	public Integer getAnimalHandling() {
		return AnimalHandling;
	}

	public void setAnimalHandling(Integer animalHandling) {
		AnimalHandling = animalHandling;
	}

	public Integer getArcana() {
		return Arcana;
	}

	public void setArcana(Integer arcana) {
		Arcana = arcana;
	}

	public Integer getAthletics() {
		return Athletics;
	}

	public void setAthletics(Integer athletics) {
		Athletics = athletics;
	}

	public Integer getDeception() {
		return Deception;
	}

	public void setDeception(Integer deception) {
		Deception = deception;
	}

	public Integer getHistory() {
		return History;
	}

	public void setHistory(Integer history) {
		History = history;
	}

	public Integer getInsight() {
		return Insight;
	}

	public void setInsight(Integer insight) {
		Insight = insight;
	}

	public Integer getIntimidation() {
		return Intimidation;
	}

	public void setIntimidation(Integer intimidation) {
		Intimidation = intimidation;
	}

	public Integer getInvestigation() {
		return Investigation;
	}

	public void setInvestigation(Integer investigation) {
		Investigation = investigation;
	}

	public Integer getMedicine() {
		return Medicine;
	}

	public void setMedicine(Integer medicine) {
		Medicine = medicine;
	}

	public Integer getNature() {
		return Nature;
	}

	public void setNature(Integer nature) {
		Nature = nature;
	}

	public Integer getPerception() {
		return Perception;
	}

	public void setPerception(Integer perception) {
		Perception = perception;
	}

	public Integer getPerformance() {
		return Performance;
	}

	public void setPerformance(Integer performance) {
		Performance = performance;
	}

	public Integer getPersuasion() {
		return Persuasion;
	}

	public void setPersuasion(Integer persuasion) {
		Persuasion = persuasion;
	}

	public Integer getReligion() {
		return Religion;
	}

	public void setReligion(Integer religion) {
		Religion = religion;
	}

	public Integer getSlightOfHand() {
		return SlightOfHand;
	}

	public void setSlightOfHand(Integer slightOfHand) {
		SlightOfHand = slightOfHand;
	}

	public Integer getStealth() {
		return Stealth;
	}

	public void setStealth(Integer stealth) {
		Stealth = stealth;
	}

	public Integer getSurvival() {
		return Survival;
	}

	public void setSurvival(Integer survival) {
		Survival = survival;
	}

}
