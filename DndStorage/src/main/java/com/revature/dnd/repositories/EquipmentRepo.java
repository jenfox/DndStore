package com.revature.dnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.dnd.beans.Equipment;

public interface EquipmentRepo extends JpaRepository<Equipment, Integer> {

}
