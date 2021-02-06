package org.backendComponents.StayAwhileAndListen.repository;

import org.backendComponents.StayAwhileAndListen.model.Diablo2Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Diablo2CharacterRepository extends JpaRepository<Diablo2Character, Long>, CrudRepository<Diablo2Character, Long> {
}
