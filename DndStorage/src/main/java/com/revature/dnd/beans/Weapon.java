package com.revature.dnd.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WEAPONS")
public class Weapon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer characterId;

	public static enum DamageType {
		Acid, Bludgeoning, Cold, Fire, Force, Lightning, Necrotic, Piercing, Poison, Psychic, Radiant, Slashing, Thunder
	}

	private String name;
	private Integer attackBonus;
	private DamageType damageType;
	private String damage;

	public Weapon() {
	}

	public Weapon(Integer id, Integer characterId, String name, Integer attackBonus, DamageType damageType,
			String damage) {
		super();
		this.id = id;
		this.characterId = characterId;
		this.name = name;
		this.attackBonus = attackBonus;
		this.damageType = damageType;
		this.damage = damage;
	}

	public Integer getId() {
		return characterId;
	}

	public void setId(Integer id) {
		this.characterId = id;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(Integer attackBonus) {
		this.attackBonus = attackBonus;
	}

	public DamageType getDamageType() {
		return damageType;
	}

	public void setDamageType(DamageType damageType) {
		this.damageType = damageType;
	}

	public String getDamage() {
		return damage;
	}

	public void setDamage(String damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Weapon [id=" + id + ", characterId=" + characterId + ", name=" + name + ", attackBonus=" + attackBonus
				+ ", damageType=" + damageType + ", damage=" + damage + "]";
	}

}
