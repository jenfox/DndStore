package com.revature.dnd.repositories.element;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.dnd.beans.element.Bond;

public interface BondRepo extends JpaRepository<Bond, Integer> {

}
