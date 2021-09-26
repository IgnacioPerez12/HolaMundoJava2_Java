/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundojava2;

import java.util.Scanner;

/**
 *
 * @author Alumno mañana
 */
public class Clase_Escaner {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el nombre de tu perro:");
        String name = sc.nextLine();
        
        System.out.println("\n" + "Tu perro se llama : " + name);
        
    }
}
