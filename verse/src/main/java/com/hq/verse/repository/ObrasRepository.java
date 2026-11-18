package com.hq.verse.repository;

import com.hq.verse.model.Categoria;
import com.hq.verse.model.Obras;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ObrasRepository extends JpaRepository<Obras, Integer> {
    List<Obras> findByCategoria_Id(Integer categoriaId);
//    "select * from obras inner join categorias where" +
//            "obras.categorai_id = categorias.id "
}
