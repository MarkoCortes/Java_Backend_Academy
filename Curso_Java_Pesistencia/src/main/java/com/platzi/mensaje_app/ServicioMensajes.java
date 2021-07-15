/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensaje_app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marko.bibiano.cortes
 */
public class ServicioMensajes {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
        System.out.println("*************************");
        System.out.println("Escribe tu mensaje:  ");
        String mensaje = sc.nextLine();
        System.out.println("\n*************************");
        System.out.println("Escribe el Autor:    ");
        String autor = sc.nextLine();
        System.out.println("\n*************************");
        
        Mensajes objMsn = new Mensajes();
        objMsn.setMensaje(mensaje);
        objMsn.setAutorMensaje(autor);
        
        MensajesDao.crearMensaje(objMsn);
        
    }
    public static void listarMensaje(){
        
        ArrayList <String[]>  rs = MensajesDao.leerMensaje();
        String[] col = {"ID","Mensaje","Autor","Fecha"};
        
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
        
        for (String[] r : rs) {
            System.out.println("\n*************************");
        
            for (int i = 0; i < r.length; i++) {
                //String string = r[i];
                System.out.println( col[i]+": " + r[i]);
            }
            
        }
        
    
    }
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n*************************");
        System.out.println("Ingrese la ID del mensaje a Borrar: ");
        int id_mensaje = sc.nextInt();
        MensajesDao.borrarMensaje(id_mensaje);
        System.out.println("\n*************************");
    }
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n*************************");
        
        System.out.println("Ingrese el nuevo mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Ingrese la ID del mensaje a Editar: ");
        int id_mensaje = sc.nextInt();
        
        Mensajes objMsj = new Mensajes();
        objMsj.setIdMensaje(id_mensaje);
        objMsj.setMensaje(mensaje);
        MensajesDao.actualizarMensaje(objMsj);
        System.out.println("\n*************************");
    
    }
    
    
    
    
}
