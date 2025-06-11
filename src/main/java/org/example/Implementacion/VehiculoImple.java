package org.example.Implementacion;

import org.example.Conexion.ConnectionDB;
import org.example.Dao.VehiculoDao;
import org.example.Modelos.Vehiculo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehiculoImple implements VehiculoDao {
    private Connection connection = ConnectionDB.getInstance().getConnection();

    @Override
    public Vehiculo insertarVehiculo(Vehiculo vehiculo) {
        String sql = " INSERT INTO Vehiculo (matricula, marca, modelo) VALUES (?,?,?);";
        int rows = 0;
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, vehiculo.getMatricula());
            statement.setString(2, vehiculo.getMarca());
            statement.setString(3, vehiculo.getModelo());
            rows = statement.executeUpdate();
            if (rows==1)
                return vehiculo;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }



    @Override
    public List<Vehiculo> obtenerTodosVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        String sql = "SELECT * FROM Vehiculo";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                String matricula = resultSet.getString(1);
                String marca = resultSet.getString(2);
                String modelo = resultSet.getString(3);
                Vehiculo vehiculo = new Vehiculo(matricula,marca,modelo);
                vehiculos.add(vehiculo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vehiculos;
    }
}
