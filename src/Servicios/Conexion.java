/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 57310
 */
public class Conexion {

    private static Connection cn;

    public static Connection obtener() throws ClassNotFoundException, SQLException {
        if (cn == null) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost/agenda_tareas", "root", "");
                System.out.println(" ------->CONECTO  ****************");
            } catch (ClassNotFoundException e) {
                throw new ClassNotFoundException();
            } catch (SQLException ex) {
                throw new SQLException(ex);
            }
        }
        return cn;
    }
}
