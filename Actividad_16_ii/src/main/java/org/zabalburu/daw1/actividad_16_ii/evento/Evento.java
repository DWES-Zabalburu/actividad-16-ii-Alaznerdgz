/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad_16_ii.evento;

import java.util.List;
import org.zabalburu.daw1.actividad_16_ii.persona.Persona;

/**
 *
 * @author Alazne
 */
public class Evento {
    private int sumarId;
    private int id;
    private String descripcion;
    private String fecha;
    private String lugar;
    private double costo;
    private boolean mayorEdad;
    private List<Persona> personas;

    public Evento(int id, String descripcion, String fecha, String lugar, double costo, boolean mayorEdad, List<Persona> personas) {
        this.id += this.sumarId;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
        this.costo = costo;
        this.mayorEdad = mayorEdad;
        this.personas = personas;
    }

    public int getSumarId() {
        return sumarId;
    }

    public void setSumarId(int sumarId) {
        this.sumarId = sumarId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    
}

