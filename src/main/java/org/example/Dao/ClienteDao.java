package org.example.Dao;

import org.example.Modelos.Cliente;


import java.util.List;

public interface ClienteDao {

    void insertarCliente(Cliente cliente);
    void borrarCliente(String dni);
    void actualizarClienteTelefono(Cliente cliente);
    List<Cliente> obtenerTodosClientes();
}
