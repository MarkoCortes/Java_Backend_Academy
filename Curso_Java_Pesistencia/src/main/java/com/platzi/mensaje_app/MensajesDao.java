/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensaje_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author marko.bibiano.cortes
 */
public class MensajesDao {
    public static void crearMensaje(Mensajes mensaje){
        Conexion db_Connect = new Conexion();
        try (Connection conexion = db_Connect.getConnection() ){
            PreparedStatement ps  = null;
            try {
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());

                ps.executeUpdate();
                System.out.println("Mensaje creado");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
    }
    public static  ArrayList <String[]> leerMensaje(){
        Conexion db_Connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList <String[]> arrayRes = new ArrayList();
        
        try(Connection conexion = db_Connect.getConnection()) {
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();      
            while (rs.next()){
                arrayRes.add(new String[]{ 
                                            String.valueOf(rs.getInt("id_mensaje")),  
                                            rs.getString("mensaje"),
                                            rs.getString("autor_mensaje"),
                                            rs.getString("fecha_mensaje")
                                        }
                );
            }
            
        } catch (SQLException e) {
            System.out.println("No se puedo hacer la consulta a mensajes: "+ e);
        }
        
        return arrayRes;
    }
    
    public static void borrarMensaje(int id_mensaje){
        Conexion db_conexion = new Conexion();
        
        try (Connection conexion = db_conexion.getConnection()){
            PreparedStatement ps = null;
            String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
            ps = conexion.prepareStatement(query);
            ps.setInt(1, id_mensaje);   
            ps.executeUpdate();
            System.out.println("El mensaje ha sido elimainado");
        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar:  " + ex);
        }
        
    }
    public static void actualizarMensaje(Mensajes mensaje){
        Conexion db_conexion = new Conexion();
        
        try (Connection conexion = db_conexion.getConnection()){
            PreparedStatement ps = null;
            String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?;";
            ps = conexion.prepareStatement(query);
            ps.setString(1,mensaje.getMensaje());
            ps.setInt(2,mensaje.getIdMensaje());   
            ps.executeUpdate();
            System.out.println("El mensaje ha sido Actualizado");
        } catch (SQLException ex) {
            System.out.println("No se pudo actualizar:  " + ex);
        }
        
    }
    
}
