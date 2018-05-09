package com.revature.dnd.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
	private Integer id;

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
	@OneToOne
	private Abilities abilities;
	private Boolean inspiration;
	private Integer proficiencyBonus;
	@OneToOne
	private Skills skills;
	private Integer passivePerception;
	private List<String> languages;
	private List<String> otherProficiences;

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

	private List<Weapon> attacks;
	private List<String> equipment;

	// 3/3 COl
	private List<String> personalityTraits;
	private List<String> ideals;
	private List<String> bonds;
	private List<String> flaws;

	private List<String> featuresAndTraits;

	// Spell List

	public Character() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return characterName;
	}

	public void setName(String name) {
		this.characterName = name;
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

	// public List<Attribute> getAttributes() {
	// return attributes;
	// }
	//
	// public void setAttributes(List<Attribute> attributes) {
	// this.attributes = attributes;
	// }
	//
	// @Enumerated(EnumType.ORDINAL)
	// public List<Skill> getSkills() {
	// return skills;
	// }
	//
	// public void setSkills(List<Skill> skills) {
	// this.skills = skills;
	// }
	//
	// public List<String> getLanguages() {
	// return languages;
	// }
	//
	// public void setLanguages(List<String> languages) {
	// this.languages = languages;
	// }

	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	public int getInitiative() {
		return initiative;
	}

	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

}
