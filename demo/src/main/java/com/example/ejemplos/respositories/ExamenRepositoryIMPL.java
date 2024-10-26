package com.example.ejemplos.respositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.ejemplos.models.Examen;

public class ExamenRepositoryIMPL implements ExamenRepositry {


    private List<Examen> examenes = new ArrayList<>();

    /*@Override
    public List<Examen> findAll(){
        return examenes;
    }*/

    @Override
    public List<Examen> findAll() {
        return Arrays.asList(new Examen(1L, "Math"), new Examen(2L, "History"), new Examen(3L, "Lenguage"));
    }

    @Override
    public Examen findById(Long id) {
        return examenes.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void save(Examen examen) {
        examenes.add(examen);
    }

}
