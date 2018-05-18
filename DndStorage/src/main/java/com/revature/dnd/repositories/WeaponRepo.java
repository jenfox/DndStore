package com.revature.dnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.dnd.beans.Weapon;

public interface WeaponRepo extends JpaRepository<Weapon, Integer> {

}
