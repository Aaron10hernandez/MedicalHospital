/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medicalhospital;

import com.mycompany.medicalhospital.models.Consulta;
import com.mycompany.medicalhospital.models.Medico;

/**
 *
 * @author ESTUDIANTE
 */
public class ClinicalHospital {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       
        
        Medico medico = new Medico();
        Consulta c = new Consulta();
        
        medico.atender(c);
    }
}
