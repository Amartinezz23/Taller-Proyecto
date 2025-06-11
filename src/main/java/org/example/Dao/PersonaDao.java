package org.example.Dao;

import org.example.Modelos.Cliente;
import org.example.Modelos.Persona;


import java.util.List;

public interface PersonaDao {

    Persona insertarPersona(Persona persona);
    boolean borrarPersona(String dni);
    List<Persona> obtenerTodosPersonas();
}
