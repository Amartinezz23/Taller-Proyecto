package org.example.Implementacion;

import org.example.Conexion.ConnectionDB;
import org.example.Dao.PersonaDao;
import org.example.Modelos.Cliente;
import org.example.Modelos.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaImple implements PersonaDao {
    private Connection connection = ConnectionDB.getInstance().getConnection();


    @Override
    public Persona insertarPersona(Persona persona) {
        String sql = "INSERT INTO Persona (dni, nombre, pape) VALUES (?, ?, ?);";
        int rows = 0;
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, persona.getDNI());
            statement.setString(2, persona.getNombre());
            statement.setString(3, persona.getPape());
            rows = statement.executeUpdate();
            if (rows==1){
                return persona;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public boolean borrarPersona(String dni) {
        String sql = "DELETE FROM Persona WHERE dni = ?;";
        int rows = 0;
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, dni);
            rows = statement.executeUpdate();
            if (rows==1)
                return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public List<Persona> obtenerTodosPersonas() {
        List<Persona> personas = new ArrayList<>();
        String sql = "SELECT * FROM Persona;";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                String dni = resultSet.getString(1);
                String nom = resultSet.getString(2);
                String ape = resultSet.getString(3);
                Persona persona = new Persona(dni,nom,ape);
                personas.add(persona);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return personas;
    }
}
