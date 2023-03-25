package com.pokemo.studi.service.impl;

import com.pokemo.studi.pojo.Pokemon;
import com.pokemo.studi.service.PokemonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonServiceImpl implements PokemonService {
    private static List<Pokemon> maListe = new ArrayList<>();
    @Override
    public List<Pokemon> getAllpokemon() {
        return maListe;
    }

    @Override
    public List<Pokemon> getAllPokemonByName(String name) {
        return maListe.stream()
                .filter(pokemon -> pokemon.getSurname().equals(name))
                .collect(Collectors.toList());
    }



    @Override
    public void updatePokemon(String pokemonName, Pokemon pokemon) {

    }

    @Override
    public void createPokemon(Pokemon pokemon) {

    }

    @Override
    public void deletePokemon(String name) {

    }
}
