/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medicalhospital.models;

/**
 *
 * @author ESTUDIANTE
 */
public class Persona {
    private String nombre;
    private int edad;
    private int cedula;
    private String telefono;

    public Persona(String nombre, int edad, int cedula, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }
    
    

    
    
    
}
