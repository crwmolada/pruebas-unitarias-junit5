package com.example.ejemplos.services;

import java.util.Optional;

import com.example.ejemplos.models.Examen;
import com.example.ejemplos.respositories.ExamenRepositry;

public class ExamenServiceIMPL implements ExamenService {

    private ExamenRepositry examenRepositry;

    public ExamenServiceIMPL(ExamenRepositry examenRepositry) {
        this.examenRepositry = examenRepositry;
    }

    @Override
    public Examen findExamenPerName(String name) {
        Optional<Examen> exameOptional = examenRepositry.findAll().stream().filter(e -> e.getName().contains(name))
                .findFirst();
        Examen examen = null;
        if (exameOptional.isPresent()) {
            examen = exameOptional.orElseThrow(null);
        }

        return examen;
    }

    @Override
    public void saveExamen(Examen examen) {
        examenRepositry.save(examen);
    }

}
