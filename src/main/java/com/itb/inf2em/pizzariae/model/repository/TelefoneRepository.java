package com.itb.inf2em.pizzariae.model.repository;

import com.itb.inf2em.pizzariae.model.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
