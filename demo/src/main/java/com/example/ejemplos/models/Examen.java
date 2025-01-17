package com.example.ejemplos.models;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    private Long id;
    private String name;
    private List<String> questions;

    //GETTER ANS SETTER
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }


    //COSNTRUCTOR
    public Examen(Long id, String name) {
        this.id = id;
        this.name = name;
        this.questions = new ArrayList<>();  //does not go as a parameter b is madantory

    }
    

    
}
