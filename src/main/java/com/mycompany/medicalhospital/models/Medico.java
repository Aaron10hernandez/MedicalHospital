/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medicalhospital.models;

/**
 *
 * @author ESTUDIANTE
 */
public class Medico extends Persona{
    private String especialidad;
    private String tarjetaProfesional;
    private int consultorio;

    public Medico() {
    }

    public Medico(String especialidad, String tarjetaProfesional, int consultorio, String nombre, int edad, int cedula, String telefono) {
        super(nombre, edad, cedula, telefono);
        this.especialidad = especialidad;
        this.tarjetaProfesional = tarjetaProfesional;
        this.consultorio = consultorio;
    }

    public Medico(String especialidad, String tarjetaProfesional, int consultorio) {
        this.especialidad = especialidad;
        this.tarjetaProfesional = tarjetaProfesional;
        this.consultorio = consultorio;
    }

    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }
    
    public void atender(Consulta c, Medico m){
        
        System.out.println(m.getNombre() + " esta atendiendo la consulta con fecha: "+c.getFecha());
    }
    
    public void presentarse(Medico m){
        System.out.println("Hola, mi nombre es: "+m.getNombre());
    }

    @Override
    public String toString() {
        return "Medico{" + "especialidad=" + especialidad + ", tarjetaProfesional=" + tarjetaProfesional + ", consultorio=" + consultorio + '}';
    }
    
    

    
    
    
}
