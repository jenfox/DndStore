package com.revature.dnd.beans.element;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IDEALS")
public class Ideal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer characterId;

	private String description;

	public Ideal() {
	}

	public Ideal(Integer id, Integer characterId, String description) {
		super();
		this.id = id;
		this.characterId = characterId;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Ideal [id=" + id + ", characterId=" + characterId + ", description=" + description + "]";
	}

}
