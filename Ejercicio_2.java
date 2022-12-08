/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_vectores;

/**
 *
 * @author agust
 */
public class Ejercicio_2 {
  public static void main(String[] args){
  
  //2.En un vector de 15 posiciones se almacenan las edades de 15 alumnos. Se desea un programa que sea capaz de determinar cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes.

    int[] edadAlumnos={16,15,14,18,17,19,22,20,24,23,17,25,30,32,28};
    int maxNum = edadAlumnos[0];
    int minNum = edadAlumnos[0];
    
        for (int x : edadAlumnos) {
            if (x > maxNum)
                maxNum = x;
        }

        System.out.println("La mayor edad entre los estudiantes es = " + maxNum);

        for (int x : edadAlumnos) {
            if (x < minNum)
                minNum = x;
        }
        System.out.println("La menor edad entre los estudiantes es = " + minNum);
 }    
    
  
  }
    
