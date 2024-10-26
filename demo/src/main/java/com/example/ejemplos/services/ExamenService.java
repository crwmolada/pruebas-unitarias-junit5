package com.example.ejemplos.services;

import com.example.ejemplos.models.Examen;

public interface ExamenService {
    Examen findExamenPerName(String name);

    void saveExamen(Examen examen);
}
