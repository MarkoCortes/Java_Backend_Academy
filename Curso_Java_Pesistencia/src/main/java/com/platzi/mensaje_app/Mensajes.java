/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensaje_app;

/**
 *
 * @author marko.bibiano.cortes
 */
public class Mensajes {
    private int idMensaje;
    private String mensaje;
    private String autorMensaje;
    private String fechaMensaje;

    /**
     * Un constructor vacio
     */
    
    public Mensajes(){}
    
    public Mensajes(String mensaje, String autorMensaje, String fechaMensaje){
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fechaMensaje = fechaMensaje;
    }
    
    public int getIdMensaje(){
        return this.idMensaje;
    }
 
    public void setIdMensaje(int idMensaje){
        this.idMensaje = idMensaje;
        
    }
 
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }
    
    
    
    
}
