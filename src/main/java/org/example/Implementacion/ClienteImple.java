package org.example.Implementacion;

import org.example.Dao.ClienteDao;
import org.example.Modelos.Cliente;

import java.util.List;

public class ClienteImple implements ClienteDao {
    @Override
    public void insertarCliente(Cliente cliente) {
        String sql = "";
    }

    @Override
    public void borrarCliente(String dni) {

    }

    @Override
    public void actualizarClienteTelefono(Cliente cliente) {

    }

    @Override
    public List<Cliente> obtenerTodosClientes() {
        return List.of();
    }
}
