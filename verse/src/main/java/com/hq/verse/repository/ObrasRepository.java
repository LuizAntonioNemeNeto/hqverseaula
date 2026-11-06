package com.hq.verse.repository;

import com.hq.verse.model.Categoria;
import com.hq.verse.model.Obras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObrasRepository extends JpaRepository<Obras, Integer> {

}
