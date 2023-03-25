package com.pokemo.studi.service;

import com.pokemo.studi.api.PokemonWs;
import com.pokemo.studi.pojo.Pokemon;

import java.util.List;

public interface PokemonService {
    List<Pokemon> getAllpokemon();
    List<Pokemon> getAllPokemonByName(String name);
    void updatePokemon(String pokemonName, Pokemon pokemon);
    void createPokemon(Pokemon pokemon);
    void deletePokemon(String name);

}
