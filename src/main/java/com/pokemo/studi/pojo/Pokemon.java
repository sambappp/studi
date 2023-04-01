package com.pokemo.studi.pojo;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Pokemon")
public class Pokemon {
    @Id
    @SequenceGenerator(name="pokemon_seq", sequenceName="pokemon_seq",
            allocationSize = 1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE,
            generator = "pokemon_seq")
    @Column(name="pokemon_id",updatable = false)
    private Long id;
    private String surname;
    //@ManyToOne
    //@JoinColumn(name="pokedex_id", nullable = false)
    //private Pokedex pokedex;
    //@OneToMany(mappedBy = "pokemon")
    //private List<Capacite> capacitesList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pokemon_id")
    private Set<Capacite> capacites = new LinkedHashSet<>();

    public Set<Capacite> getCapacites() {
        return capacites;
    }

    public void setCapacites(Set<Capacite> capacites) {
        this.capacites = capacites;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Pokemon(){

    }

    public Pokemon(Long id, String surname, List<Capacite> capacitesList) {
        this.id = id;
        this.surname = surname;

    }

    public Pokemon(String surname, List<Capacite> capacitesList) {
        this.surname = surname;

    }
}
