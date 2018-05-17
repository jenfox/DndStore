package com.revature.dnd.beans.element;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FEATURES")
public class Feature {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer characterId;

	private String description;

	public Feature() {
	}

	public Feature(Integer id, Integer characterId, String description) {
		super();
		this.id = id;
		this.characterId = characterId;
		this.description = description;
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
		return "Feature [id=" + id + ", characterId=" + characterId + ", description=" + description + "]";
	}

}