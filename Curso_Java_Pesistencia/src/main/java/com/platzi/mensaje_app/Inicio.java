/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensaje_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author marko.bibiano.cortes
 */
public class Inicio {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do{
            
            System.out.println("");
            System.out.println("***********************************");
            System.out.println("**    Aplicacion de mensajes:    **");
            System.out.println("** 1. Crear   mensaje            **");
            System.out.println("** 2. Listar  mensaje            **");
            System.out.println("** 3. Editar  mensaje            **");
            System.out.println("** 4. Elimnar mensaje            **");
            System.out.println("** 5. SALIR                      **");
            System.out.println("***********************************");
            System.out.println("Ingrese opcion: ");
            try {
                opc = sc.nextInt();
                
            } catch (Exception e) {
                //opc = 0;
                System.err.println("Dato ingresado no valido");
                
            }
            switch(opc){
                case 1:
                    ServicioMensajes.crearMensaje();
                    break;
                case 2 :
                    ServicioMensajes.listarMensaje();
                    break;
                case 3: 
                    ServicioMensajes.editarMensaje();
                    break;
                case 4:
                    ServicioMensajes.borrarMensaje();
                    break;
                default:
                        break;
                   
            }
            
        }while(opc != 5 );
        
        
        Conexion conexion = new Conexion();
        try (Connection cnx = conexion.getConnection()){
             
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
