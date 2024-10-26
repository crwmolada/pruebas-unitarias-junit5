package com.example.ejemplos.respositories;

import java.util.List;

import com.example.ejemplos.models.Examen;

public interface ExamenRepositry {
    List<Examen> findAll();

    Examen findById(Long id); //ID necesary to save
    void save(Examen examen);
}
