package com.generation.blogpessoal.repository;

import com.generation.blogpessoal.model.Tema;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema,Long> {


    public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
    // SELECT * FROM tb_temass WHERE descricao LIKE "%descricao%";

}