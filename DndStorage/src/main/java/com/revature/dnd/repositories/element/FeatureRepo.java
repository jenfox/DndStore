package com.revature.dnd.repositories.element;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.dnd.beans.element.Feature;

public interface FeatureRepo extends JpaRepository<Feature, Integer> {

}
