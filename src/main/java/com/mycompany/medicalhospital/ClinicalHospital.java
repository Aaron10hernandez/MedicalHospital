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
       
        Scanner sc = new Scanner(System.in);
        
        Consulta c1 = new Consulta();
        Hospital h = new Hospital();
        
        System.out.println("=========");
        
        
        h.setConsultas(h.registrarConsulta());
        
        
        
        
        
        
    }
}
