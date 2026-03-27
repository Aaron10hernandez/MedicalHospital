/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medicalhospital;

import com.mycompany.medicalhospital.models.Consulta;
import com.mycompany.medicalhospital.models.Hospital;
import com.mycompany.medicalhospital.models.Medico;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class ClinicalHospital {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Consulta c1 = new Consulta();
        Hospital h1 = new Hospital();
        Medico m1 = new Medico();
        
        
        //CONSULTAS Y HOSPITAL
        
        //CONSULTAS
       //Aqui se registra una consulta y se guarda en el arrayList "consultas"
       //que está como atributo en la clase Hospital
        h1.setConsultas(h1.registrarConsulta());
        
        h1.getConsultas(); //Retorna las consultas guardadas en el arrayList
                
        //HOSPITAL
        h1.setNombre("Salud Total");
        h1.setCiudad("Dubai");
        
        
        
        
        //MEDICO
        m1.setNombre("Aaron");
        m1.setCedula(007);
        m1.setEdad(19);
        m1.setTelefono("+57 123");
        m1.setTarjetaProfesional("No se que poner");
        m1.setConsultorio(10);
        m1.setEspecialidad("Neuro Cirujano");
        
        m1.atender(c1);
        
        System.out.println("El medico");
        
        
        
        
        
       
        
        
        
        
    }
}
