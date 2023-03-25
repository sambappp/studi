package com.pokemo.studi.api;

import com.pokemo.studi.pojo.Pokemon;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //permet de dire a spring que tout le monde peut avoir accés
// url d'accès à mon site
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_POKEMON)
public class PokemonWs {
    @GetMapping
    public List<Pokemon> getAllPokemon(){
        return null;
    }

    @PostMapping
    public void createpokemon(@RequestBody Pokemon Pokemon){

    }

    @PutMapping("{name}")
    public void updatePokemon(@PathVariable(name = "name")String nom){

    }

    @DeleteMapping("{name}")
    public void deletePokemon(@PathVariable(name = "name")String nom){

    }

}


