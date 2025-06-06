package org.example.Dao;

import org.example.Modelos.Taller;

import java.util.List;

public interface TallerDao {

    void insertarTaller(Taller taller);
    void borrarTaller(String nombre);
    void actualizarTallerNombre(Taller taller);
    List<Taller> obtenerTodos();

}
