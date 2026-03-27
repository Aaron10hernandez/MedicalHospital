/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medicalhospital;

import com.mycompany.medicalhospital.models.Consulta;
import com.mycompany.medicalhospital.models.Hospital;
import com.mycompany.medicalhospital.models.Medico;


/**
 *
 * @author ESTUDIANTE
 */
public class ClinicalHospital {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Hospital h1 = new Hospital();
        Medico m1 = new Medico();
        
        //HOSPITAL
        h1.setNombre("Salud Total");
        h1.setCiudad("Dubai");
        h1.getNombre();
        h1.getCiudad();
    
        //MEDICO
        m1.setNombre("Aaron");
        m1.setCedula(007);
        m1.setEdad(19);
        m1.setTelefono("+57 123");
        m1.setTarjetaProfesional("No se que poner");
        m1.setConsultorio(10);
        m1.setEspecialidad("Neuro Cirujano");
        
        Medico m2 = new Medico("Medico general", "BBC Y MSN", 20, "Florentino", 50, 16171822, "+01 23456");
        
        Consulta c1= new Consulta("27/03/2026", "Dolor de cabeza", "Migrana", 10);
        Consulta c2= new Consulta("10/01/2026", "Dolor de corazon", "Falta de besos", 15);
        Consulta c3= new Consulta("21/11/2026", "vista borrosa", "miopia", 20);
        
        Hospital h2 = new Hospital();
        h2.setNombre("Clinica Santa Maria");
        h2.setCiudad("Miami");
        h2.setConsultas(c1);
        h2.setConsultas(c2);
        h2.setConsultas(c3);
        
        m1.atender(c1, m1);
        m2.atender(c2, m2);
        
        h2.listarConsultas(h2.getConsultas());
        
        System.out.println("=============================");
        
        m1.presentarse(m1);
        m2.presentarse(m2);
        
        
        
        
        
        
        
        
        
       
        
        
        
        
    }
}
