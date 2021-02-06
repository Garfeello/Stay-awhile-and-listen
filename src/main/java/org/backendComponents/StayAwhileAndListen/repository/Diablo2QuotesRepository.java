package org.backendComponents.StayAwhileAndListen.repository;

import org.backendComponents.StayAwhileAndListen.model.Diablo2Quotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Diablo2QuotesRepository extends JpaRepository<Diablo2Quotes, Long>, CrudRepository<Diablo2Quotes, Long> {
}
