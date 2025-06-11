package org.example.Dao;

import org.example.Modelos.Vehiculo;

import java.util.List;

public interface VehiculoDao {

    void insertarVehiculo(Vehiculo vehiculo);
    void borrarVehiculo(String matricula);
    List<Vehiculo> obtenerTodosVehiculos();

}
