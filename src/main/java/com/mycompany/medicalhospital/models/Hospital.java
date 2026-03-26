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
    private ArrayList<Consulta> consultas;

    public Hospital() {
    }

    public Hospital(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
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

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    public void registrarConsulta(){
        Consulta c = new Consulta();
        
        System.out.println("Fecha: "); String escribir= sc.nextLine();
        c.setFecha(escribir);
        
        System.out.println("Motivo: "); escribir= sc.nextLine();
        c.setMotivo(escribir);
        
        System.out.println("Diagnostico: "); escribir= sc.nextLine();
        c.setDiagnostico(escribir);
       
        System.out.println("Duracion: "); int min= sc.nextInt();
        c.setDuracionMinutos(min);
        
        System.out.println("========================");
       System.out.println("Consulta registrada.");
    }
            
}
