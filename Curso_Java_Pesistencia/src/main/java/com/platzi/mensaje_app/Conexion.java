/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensaje_app;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author marko.bibiano.cortes
 */
public class Conexion {
    
    
    public Connection getConnection (){ 
        Connection connection = null;
        try {
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            if (connection != null){
                System.out.println("Se ha conectado a la base de datos");
            }
        } catch (Exception e) {
            System.err.println("Erro al conectar a la Base de datos: \n" + e);
        }
        return connection;
    }
}
