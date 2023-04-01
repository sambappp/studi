package com.pokemo.studi.service.impl;

import com.pokemo.studi.pojo.Pokemon;
import com.pokemo.studi.repository.PokemonRepository;
import com.pokemo.studi.service.PokemonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PokemonServiceImpl implements PokemonService {
    //private static List<Pokemon> maListe = new ArrayList<>();
    private final PokemonRepository pokemonRepository;

    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> getAllPokemon(){
        return pokemonRepository.findAll();
    }
    @Override
    public List<Pokemon> getAllpokemon() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon getPokemonById(Long id) {
        Optional<Pokemon> pokemonOptional = pokemonRepository.findById(id);
        return pokemonOptional.orElse(null);
    }



    @Override
    public void updatePokemon(Long id, Pokemon pokemon) {
        this.deletePokemon(id);
        pokemonRepository.save(pokemon);
    }

    @Override
    public void createPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    @Override
    public void deletePokemon(Long id) {
        pokemonRepository.deleteById(id);
    }

}
