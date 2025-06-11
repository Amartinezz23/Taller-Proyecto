package org.example;

import org.example.Dao.PersonaDao;
import org.example.Dao.VehiculoDao;
import org.example.Implementacion.PersonaImple;
import org.example.Implementacion.VehiculoImple;
import org.example.Modelos.Persona;
import org.example.Modelos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        PersonaDao dao = new PersonaImple();
        Persona persona3 = new Persona("09787622B", "Paco", "Martin");
        System.out.println(dao.insertarPersona(persona3));
        System.out.println(dao.borrarPersona(persona3.getDNI()));
        dao.obtenerTodosPersonas().forEach(System.out::println);
        System.out.println("===================");
        VehiculoDao vehiculoDao = new VehiculoImple();
        Vehiculo vehiculo = new Vehiculo("3948D", "toyota", "C4");
        System.out.println(vehiculoDao.insertarVehiculo(vehiculo));
        System.out.println("================================");
        vehiculoDao.obtenerTodosVehiculos().forEach(System.out::println);

    }
}
