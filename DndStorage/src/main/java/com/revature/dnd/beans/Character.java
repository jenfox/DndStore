package com.revature.dnd.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * DnD Character Bean
 */
@Entity
public class Character {

	public static enum Alignment {
		LawfulGood, LawfulNeutral, LawfulEvil, NeutralGood, TrueNeutral, NeutralEvil, ChaoticGood, ChaoticNeutral, ChaoticEvil
	}

	public static enum Attribute {
		Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma
	}

	public static enum Skill {
		Acrobatics, AnimalHandling, Arcana, Athletics, Deception, History, Insight, Intimidation, Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, SlightOfHand, Stealth, Survival
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;
	private String className;
	private int level;
	private String background;
	private String playerName;
	private String race;

	private Alignment alignment;
	private int experiencePoints;

	// private List<Attribute> attributes;
	// private List<Skill> skills;
	// private List<String> languages;

	private int armorClass;
	private int initiative;

	public Character() {

	}

	public Character(Integer id, String name, String className, int level, String background, String playerName,
			String race, Alignment alignment, int experiencePoints, List<Attribute> attributes, List<Skill> skills,
			List<String> languages, int armorClass, int initiative) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
		this.level = level;
		this.background = background;
		this.playerName = playerName;
		this.race = race;
		this.alignment = alignment;
		this.experiencePoints = experiencePoints;
		// this.attributes = attributes;
		// this.skills = skills;
		// this.languages = languages;
		this.armorClass = armorClass;
		this.initiative = initiative;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
