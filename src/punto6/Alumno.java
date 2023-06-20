/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;

/**
 *
 * @author Ignacio Gaynor
 */
public class Alumno {
    final double [] notas;
     String Nombre,Apellido;

    public Alumno(double[] notas, String Nombre, String Apellido) {
        this.notas =new double[notas.length];
        for(int i=0; i<notas.length;i++){
            this.notas[i]=notas[i];
        }
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

      public double Promedio(){
          if(notas.length==0){
              System.out.println("El alumno no tiene ninguna nota");
              return 0;
          }
          else{
              double suma=0;
              for(double nota : notas){
                  suma += nota;
          }
              return suma / notas.length;
      }

      }
}
