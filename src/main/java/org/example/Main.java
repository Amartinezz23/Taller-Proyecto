package org.example;

import org.example.Dao.PersonaDao;
import org.example.Implementacion.PersonaImple;
import org.example.Modelos.Persona;

public class Main {
    public static void main(String[] args) {
        PersonaDao dao = new PersonaImple();
        Persona persona3 = new Persona("09787622B", "Paco", "Martin");
        System.out.println(dao.insertarPersona(persona3));
        System.out.println(dao.borrarPersona(persona3.getDNI()));
        dao.obtenerTodosPersonas().forEach(System.out::println);

    }
}
