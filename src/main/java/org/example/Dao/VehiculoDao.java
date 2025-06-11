package org.example.Dao;

import org.example.Modelos.Vehiculo;

import java.util.List;

public interface VehiculoDao {

    Vehiculo insertarVehiculo(Vehiculo vehiculo);
    List<Vehiculo> obtenerTodosVehiculos();

}
