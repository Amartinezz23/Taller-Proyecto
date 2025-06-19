package org.example.Implementacion;

import org.example.Conexion.ConnectionDB;
import org.example.Dao.PersonaDao;
import org.example.Modelos.Cliente;
import org.example.Modelos.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaImple implements PersonaDao {
    public static final String SQL = "SELECT * FROM Persona;";
    public static final String SQL1 = "INSERT INTO Persona (dni, nombre, pape) VALUES (?, ?, ?);";
    public static final String SQL2 = "DELETE FROM Persona WHERE dni = ?;";
    private Connection connection = ConnectionDB.getInstance().getConnection();


    @Override
    public Persona insertarPersona(Persona persona) {
        int rows = 0;
        try (PreparedStatement statement = connection.prepareStatement(SQL1)) {
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
        int rows = 0;
        try (PreparedStatement statement = connection.prepareStatement(SQL2)) {
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
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SQL);
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
