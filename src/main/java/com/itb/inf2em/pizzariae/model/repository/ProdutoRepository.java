package com.itb.inf2em.pizzariae.model.repository;

import com.itb.inf2em.pizzariae.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
