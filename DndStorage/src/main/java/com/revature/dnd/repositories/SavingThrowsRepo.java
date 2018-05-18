package com.revature.dnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.dnd.beans.SavingThrows;

public interface SavingThrowsRepo extends JpaRepository<SavingThrows, Integer> {

}
