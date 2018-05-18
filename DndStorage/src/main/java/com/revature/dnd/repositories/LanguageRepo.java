package com.revature.dnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.dnd.beans.Language;

public interface LanguageRepo extends JpaRepository<Language, Integer> {

}
