package com.revature.dnd.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * DnD Character Bean
 */
@Entity
public class Character {

	public static enum Alignment {
		LawfulGood, LawfulNeutral, LawfulEvil, NeutralGood, TrueNeutral, NeutralEvil, ChaoticGood, ChaoticNeutral, ChaoticEvil
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer characterId;

	// Top part
	private String characterName;
	private String className;
	private int level;
	private String background;
	private String playerName;
	private String race;
	private Alignment alignment;
	private int experiencePoints;

	// 1/3 Col of character sheet
	@Embedded
	private Abilities abilities;
	private Boolean inspiration;
	private Integer proficiencyBonus;
	@Embedded
	private Skills skills;
	private Integer passivePerception;
	@ElementCollection
	private List<String> languages = new ArrayList<>();
	@ElementCollection
	private List<String> otherProficiences = new ArrayList<>();

	// 2/3 Col of character Sheet
	private Integer armorClass;
	private Integer initiative;
	private Integer speed;
	private Integer hitpointMaximum;
	private Integer currentHitPoints;

	private Integer temporaryHitPoints;

	private Integer hitDiceTotal;
	private String hitDiceType;
	private Integer deathSavesSuccesses;
	private Integer deathSavesFailures;

	@OneToMany
	private List<Weapon> attacks;
	@ElementCollection
	private List<String> equipment = new ArrayList<>();

	// 3/3 Col of character sheet
	@ElementCollection
	private List<String> personalityTraits = new ArrayList<>();
	@ElementCollection
	private List<String> ideals = new ArrayList<>();
	@ElementCollection
	private List<String> bonds = new ArrayList<>();
	@ElementCollection
	private List<String> flaws = new ArrayList<>();

	@ElementCollection
	private List<String> featuresAndTraits = new ArrayList<>();

	public Character() {

	}

	public Character(Integer characterId, String characterName, String className, int level, String background,
			String playerName, String race, Alignment alignment, int experiencePoints, Abilities abilities,
			Boolean inspiration, Integer proficiencyBonus, Skills skills, Integer passivePerception,
			List<String> languages, List<String> otherProficiences, Integer armorClass, Integer initiative,
			Integer speed, Integer hitpointMaximum, Integer currentHitPoints, Integer temporaryHitPoints,
			Integer hitDiceTotal, String hitDiceType, Integer deathSavesSuccesses, Integer deathSavesFailures,
			List<Weapon> attacks, List<String> equipment, List<String> personalityTraits, List<String> ideals,
			List<String> bonds, List<String> flaws, List<String> featuresAndTraits) {
		super();
		this.characterId = characterId;
		this.characterName = characterName;
		this.className = className;
		this.level = level;
		this.background = background;
		this.playerName = playerName;
		this.race = race;
		this.alignment = alignment;
		this.experiencePoints = experiencePoints;
		this.abilities = abilities;
		this.inspiration = inspiration;
		this.proficiencyBonus = proficiencyBonus;
		this.skills = skills;
		this.passivePerception = passivePerception;
		this.languages = languages;
		this.otherProficiences = otherProficiences;
		this.armorClass = armorClass;
		this.initiative = initiative;
		this.speed = speed;
		this.hitpointMaximum = hitpointMaximum;
		this.currentHitPoints = currentHitPoints;
		this.temporaryHitPoints = temporaryHitPoints;
		this.hitDiceTotal = hitDiceTotal;
		this.hitDiceType = hitDiceType;
		this.deathSavesSuccesses = deathSavesSuccesses;
		this.deathSavesFailures = deathSavesFailures;
		this.attacks = attacks;
		this.equipment = equipment;
		this.personalityTraits = personalityTraits;
		this.ideals = ideals;
		this.bonds = bonds;
		this.flaws = flaws;
		this.featuresAndTraits = featuresAndTraits;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Enumerated(EnumType.STRING)
	public Alignment getAlignment() {
		return alignment;
	}

	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}

	public int getExperiencePoints() {
		return experiencePoints;
	}

	public void setExperiencePoints(int experiencePoints) {
		this.experiencePoints = experiencePoints;
	}

	public Abilities getAbilities() {
		return abilities;
	}

	public void setAbilities(Abilities abilities) {
		this.abilities = abilities;
	}

	public Boolean getInspiration() {
		return inspiration;
	}

	public void setInspiration(Boolean inspiration) {
		this.inspiration = inspiration;
	}

	public Integer getProficiencyBonus() {
		return proficiencyBonus;
	}

	public void setProficiencyBonus(Integer proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	public Integer getPassivePerception() {
		return passivePerception;
	}

	public void setPassivePerception(Integer passivePerception) {
		this.passivePerception = passivePerception;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public List<String> getOtherProficiences() {
		return otherProficiences;
	}

	public void setOtherProficiences(List<String> otherProficiences) {
		this.otherProficiences = otherProficiences;
	}

	public Integer getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(Integer armorClass) {
		this.armorClass = armorClass;
	}

	public Integer getInitiative() {
		return initiative;
	}

	public void setInitiative(Integer initiative) {
		this.initiative = initiative;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getHitpointMaximum() {
		return hitpointMaximum;
	}

	public void setHitpointMaximum(Integer hitpointMaximum) {
		this.hitpointMaximum = hitpointMaximum;
	}

	public Integer getCurrentHitPoints() {
		return currentHitPoints;
	}

	public void setCurrentHitPoints(Integer currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

	public Integer getTemporaryHitPoints() {
		return temporaryHitPoints;
	}

	public void setTemporaryHitPoints(Integer temporaryHitPoints) {
		this.temporaryHitPoints = temporaryHitPoints;
	}

	public Integer getHitDiceTotal() {
		return hitDiceTotal;
	}

	public void setHitDiceTotal(Integer hitDiceTotal) {
		this.hitDiceTotal = hitDiceTotal;
	}

	public String getHitDiceType() {
		return hitDiceType;
	}

	public void setHitDiceType(String hitDiceType) {
		this.hitDiceType = hitDiceType;
	}

	public Integer getDeathSavesSuccesses() {
		return deathSavesSuccesses;
	}

	public void setDeathSavesSuccesses(Integer deathSavesSuccesses) {
		this.deathSavesSuccesses = deathSavesSuccesses;
	}

	public Integer getDeathSavesFailures() {
		return deathSavesFailures;
	}

	public void setDeathSavesFailures(Integer deathSavesFailures) {
		this.deathSavesFailures = deathSavesFailures;
	}

	public List<Weapon> getAttacks() {
		return attacks;
	}

	public void setAttacks(List<Weapon> attacks) {
		this.attacks = attacks;
	}

	public List<String> getEquipment() {
		return equipment;
	}

	public void setEquipment(List<String> equipment) {
		this.equipment = equipment;
	}

	public List<String> getPersonalityTraits() {
		return personalityTraits;
	}

	public void setPersonalityTraits(List<String> personalityTraits) {
		this.personalityTraits = personalityTraits;
	}

	public List<String> getIdeals() {
		return ideals;
	}

	public void setIdeals(List<String> ideals) {
		this.ideals = ideals;
	}

	public List<String> getBonds() {
		return bonds;
	}

	public void setBonds(List<String> bonds) {
		this.bonds = bonds;
	}

	public List<String> getFlaws() {
		return flaws;
	}

	public void setFlaws(List<String> flaws) {
		this.flaws = flaws;
	}

	public List<String> getFeaturesAndTraits() {
		return featuresAndTraits;
	}

	public void setFeaturesAndTraits(List<String> featuresAndTraits) {
		this.featuresAndTraits = featuresAndTraits;
	}

}
