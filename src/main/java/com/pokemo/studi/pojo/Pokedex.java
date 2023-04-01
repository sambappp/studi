package com.pokemo.studi.pojo;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Pokedex")
public class Pokedex {
    @Id
    @SequenceGenerator(name="pokedex_seq", sequenceName="pokedex_seq",
    allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
    generator = "pokedex_seq")
    @Column(name="pokedex_id",updatable = false)
    private Long id;
    @Column(name="region")
    private String region;
    //@OneToMany(mappedBy = "pokedex")
    //private List<Pokemon> pokemonList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pokemon_id")
    private Set<Pokemon> pokemonList = new LinkedHashSet<>();

    public Pokedex(String region, Set<Pokemon> pokemonList) {
        this.region = region;
        this.pokemonList = pokemonList;
    }

    public Pokedex(Long id, String region, Set<Pokemon> pokemonList) {
        this.id = id;
        this.region = region;
        this.pokemonList = pokemonList;
    }
    public Pokedex(){

    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Set<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(Set<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
