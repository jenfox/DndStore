package com.revature.dnd.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.revature.dnd.beans.Enums.ALIGNMENT;
import com.revature.dnd.beans.element.Feature;
import com.revature.dnd.beans.element.Flaw;
import com.revature.dnd.beans.element.Ideal;
import com.revature.dnd.beans.element.PersonalityTrait;
import com.revature.dnd.beans.element.Trait;

/**
 * DnD Character Bean
 */
@Entity
@Table(name = "CHARACTERS")
public class Character {

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
	private ALIGNMENT alignment;
	private int experiencePoints;

	// Col 1
	@Embedded
	private Abilities abilities;
	private Boolean inspiration;
	private Integer proficiencyBonus;
	@Embedded
	private Skills skills;
	private Integer passivePerception;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Language> languages;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "characterId")
	private SavingThrows SavingThrows;

	// Col 2
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

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "characterId")
	private List<Weapon> attacks;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "characterId")
	private List<Equipment> equipment;

	// Col 3
	@OneToMany(mappedBy = "characterId")
	private List<PersonalityTrait> personalityTraits;
	@OneToMany(mappedBy = "characterId")
	private List<Ideal> ideals;
	@OneToMany(mappedBy = "characterId")
	private List<PersonalityTrait> bonds;
	@OneToMany(mappedBy = "characterId")
	private List<Flaw> flaws;

	@OneToMany(mappedBy = "characterId")
	private List<Feature> features;
	@OneToMany(mappedBy = "characterId")
	private List<Trait> traits;

	public Character() {
	}

	public Character(Integer characterId, String characterName, String className, int level, String background,
			String playerName, String race, ALIGNMENT alignment, int experiencePoints, Abilities abilities,
			Boolean inspiration, Integer proficiencyBonus, Skills skills, Integer passivePerception,
			List<Language> languages, com.revature.dnd.beans.SavingThrows savingThrows, Integer armorClass,
			Integer initiative, Integer speed, Integer hitpointMaximum, Integer currentHitPoints,
			Integer temporaryHitPoints, Integer hitDiceTotal, String hitDiceType, Integer deathSavesSuccesses,
			Integer deathSavesFailures, List<Weapon> attacks, List<Equipment> equipment,
			List<PersonalityTrait> personalityTraits, List<Ideal> ideals, List<PersonalityTrait> bonds,
			List<Flaw> flaws, List<Feature> features, List<Trait> traits) {
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
		SavingThrows = savingThrows;
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
		this.features = features;
		this.traits = traits;
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

	public ALIGNMENT getAlignment() {
		return alignment;
	}

	public void setAlignment(ALIGNMENT alignment) {
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

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public SavingThrows getSavingThrows() {
		return SavingThrows;
	}

	public void setSavingThrows(SavingThrows savingThrows) {
		SavingThrows = savingThrows;
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

	public List<Equipment> getEquipment() {
		return equipment;
	}

	public void setEquipment(List<Equipment> equipment) {
		this.equipment = equipment;
	}

	public List<PersonalityTrait> getPersonalityTraits() {
		return personalityTraits;
	}

	public void setPersonalityTraits(List<PersonalityTrait> personalityTraits) {
		this.personalityTraits = personalityTraits;
	}

	public List<Ideal> getIdeals() {
		return ideals;
	}

	public void setIdeals(List<Ideal> ideals) {
		this.ideals = ideals;
	}

	public List<PersonalityTrait> getBonds() {
		return bonds;
	}

	public void setBonds(List<PersonalityTrait> bonds) {
		this.bonds = bonds;
	}

	public List<Flaw> getFlaws() {
		return flaws;
	}

	public void setFlaws(List<Flaw> flaws) {
		this.flaws = flaws;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public List<Trait> getTraits() {
		return traits;
	}

	public void setTraits(List<Trait> traits) {
		this.traits = traits;
	}

	@Override
	public String toString() {
		return "Character [characterId=" + characterId + ", characterName=" + characterName + ", className=" + className
				+ ", level=" + level + ", background=" + background + ", playerName=" + playerName + ", race=" + race
				+ ", alignment=" + alignment + ", experiencePoints=" + experiencePoints + ", abilities=" + abilities
				+ ", inspiration=" + inspiration + ", proficiencyBonus=" + proficiencyBonus + ", skills=" + skills
				+ ", passivePerception=" + passivePerception + ", languages=" + languages + ", SavingThrows="
				+ SavingThrows + ", armorClass=" + armorClass + ", initiative=" + initiative + ", speed=" + speed
				+ ", hitpointMaximum=" + hitpointMaximum + ", currentHitPoints=" + currentHitPoints
				+ ", temporaryHitPoints=" + temporaryHitPoints + ", hitDiceTotal=" + hitDiceTotal + ", hitDiceType="
				+ hitDiceType + ", deathSavesSuccesses=" + deathSavesSuccesses + ", deathSavesFailures="
				+ deathSavesFailures + ", attacks=" + attacks + ", equipment=" + equipment + ", personalityTraits="
				+ personalityTraits + ", ideals=" + ideals + ", bonds=" + bonds + ", flaws=" + flaws + ", features="
				+ features + ", traits=" + traits + "]";
	}

}
