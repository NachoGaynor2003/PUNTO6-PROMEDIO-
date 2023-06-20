/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;

import java.util.Scanner;

/**
 *
 * @author Ignacio Gaynor
 */
public class Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       int i;
        System.out.println("Ingrese el nombre del alumno");
        String Nombre = leer.nextLine();
       
        System.out.println("Ingrese el apellido del alumno");
        String Apellido = leer.nextLine();
        System.out.println("Por favor, indique la cantidad de notas que tendra el alumno");
        int cantidadDeNotas = leer.nextInt();
        leer.nextLine();
        double[] notas = new double[cantidadDeNotas];
        
        for(i=0;i<cantidadDeNotas;i++){
            System.out.printf("Porfavor ingrese la nota numero %d: ", i+1);
            notas[i] = leer.nextDouble();
            leer.nextLine();
        }
        
        Alumno alumno = new Alumno(notas,Nombre,Apellido);
        System.out.printf("EL PROMEDIO DEL ALUMNO %s %s, es de: %.2f ", alumno.getNombre(), alumno.getApellido(), alumno.Promedio() );
        
                
        
       
    
}
}