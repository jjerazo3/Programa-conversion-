/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaconversion;

import java.util.Scanner;

/**
 *
 * @author USUARIO 2020
 */
public class ProgramaConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declaracion e inicializacion de variables
        
        double m, cm, km, ft, ic;
        m = 0; cm = 0; km = 0; ft = 0; ic = 0;
        
        System.out.println("Programa que permite convertir una cantidad en metros, a centimetros kilometros, pies y pulgadas");
        
        // Lectrua de datos
        System.out.println("Ingrese la cantidad de metros: ");
        m = leer.nextDouble();
        
        // Proceso
        
        cm = m * 100;
        km = m / 1000;
        ft = m * 3.28;
        ic = m * 39.37;
        
        // Salida de datos
        
        System.out.println("kilometros:" +km+ " centimetros:" +cm+ " pies:" +ft+ " pulgadas:" +ic);
        
    }
   
    }
    
