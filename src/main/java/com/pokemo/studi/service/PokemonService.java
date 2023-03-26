package com.pokemo.studi.service;

import com.pokemo.studi.api.PokemonWs;
import com.pokemo.studi.pojo.Pokemon;

import java.util.List;

public interface PokemonService {
    List<Pokemon> getAllpokemon();
    Pokemon getPokemonById(Long id);
    void updatePokemon(Long id, Pokemon pokemon);
    void createPokemon(Pokemon pokemon);
    void deletePokemon(Long id);

}
