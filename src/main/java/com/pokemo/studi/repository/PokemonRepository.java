package com.pokemo.studi.repository;

import com.pokemo.studi.pojo.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon,Long> {

}
