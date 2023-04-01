package com.pokemo.studi.api;

import com.pokemo.studi.pojo.Pokemon;

import com.pokemo.studi.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller //permet de dire a spring que tout le monde peut avoir accés
// url d'accès à mon site
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_POKEMON)
public class PokemonWs {
    @Autowired
    private PokemonService service;
    @GetMapping
    public ModelAndView getAllPokemon(){
        ModelAndView modelAndView = new ModelAndView();
        //TODO
        modelAndView.setViewName("index.html");
        modelAndView.addObject("test","success");

        return modelAndView;
        //return service.getAllpokemon();
    }

    @GetMapping("{id}")
    public Pokemon getAllPokemonbyId(@PathVariable(name = "id")Long id){
        return service.getPokemonById(id);
    }



    @PostMapping
    public void createPokemon(@RequestBody Pokemon pokemon){
        service.createPokemon(pokemon);
    }

    @PutMapping("{id}")
    public void updatePokemon(@PathVariable(name = "id")Long id,
                              @RequestBody Pokemon pokemon){
        service.updatePokemon(id,pokemon);
    }

    @DeleteMapping("{name}")
    public void deletePokemon(@PathVariable(name = "name")long id){
        service.deletePokemon(id);
    }

}


