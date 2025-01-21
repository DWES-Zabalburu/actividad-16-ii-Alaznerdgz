/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad_16_ii.persona;

import java.util.GregorianCalendar;
import java.util.List;
import org.zabalburu.daw1.actividad_16_ii.evento.Evento;

/**
 *
 * @author Alazne
 */
public class Persona {
    private int sumarId;
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private String usuario;
    private String contrasena;
    private GregorianCalendar fechaNacimiento;
    private List<Evento> listaEventos;

    public Persona(int id, String nombre, String apellido, String dni, String usuario, String contrasena, List<Evento> listaEventos) {
        this.id += sumarId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.listaEventos = listaEventos;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getSumarId() {
        return sumarId;
    }

    public void setSumarId(int sumarId) {
        this.sumarId = sumarId;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }
}
