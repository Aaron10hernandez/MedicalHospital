/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medicalhospital.models;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Hospital {
    
    Scanner sc = new Scanner(System.in);
    
    private String nombre;
    private String ciudad;
    private ArrayList<Consulta> consultas = new ArrayList();

    public Hospital() {
    }

    public Hospital(String nombre, String ciudad, ArrayList<Consulta> consultas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.consultas = consultas;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Consulta c) {
        this.consultas.add(c);
    }

    public Consulta registrarConsulta(){
        Consulta c = new Consulta();
        
        System.out.println("Fecha: "); String fecha= sc.nextLine();
        c.setFecha(fecha);
        
        System.out.println("Motivo: "); String escribir= sc.nextLine();
        c.setMotivo(escribir);
        
        System.out.println("Diagnostico: "); escribir= sc.nextLine();
        c.setDiagnostico(escribir);
       
        System.out.println("Duracion: "); int min= sc.nextInt();
        c.setDuracionMinutos(min);
        
        sc.nextLine();
        
       System.out.println("Consulta registrada.");
       
       return c;
    }
            
}
