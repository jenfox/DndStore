package com.revature.dnd.beans;

public class Weapon {

	public static enum DamageType {
		Acid, Bludgeoning, Cold, Fire, Force, Lightning, Necrotic, Piercing, Poison, Psychic, Radiant, Slashing, Thunder
	}

	private String name;
	private Integer attackBonus;
	private DamageType damageType;
	private String damage;

	public Weapon() {
	}

	public Weapon(String name, Integer attackBonus, DamageType damageType, String damage) {
		super();
		this.name = name;
		this.attackBonus = attackBonus;
		this.damageType = damageType;
		this.damage = damage;
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

}
