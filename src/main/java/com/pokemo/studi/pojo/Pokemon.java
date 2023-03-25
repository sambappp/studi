package com.pokemo.studi.pojo;

import java.util.List;

public class Pokemon {
    private Long id;
    private String surname;
    private List<Capacite> capacitesList;

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
}
