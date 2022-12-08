/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_vectores;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_1 {
    public static void main(String[] args){
           
//1.Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100. Realizar un programa que permita la carga por teclado de los 10 números solicitados.

int vector[] = new int[9];

Scanner teclado = new Scanner (System.in);

for (int i=0; i< vector.length; i++){ 
    System.out.println("Ingrese 10 números entre el 1 y el 100: " + i);
    int tecla = teclado.nextInt();
    while (tecla > 100){
    System.out.println("Número NO permitido");
    tecla = teclado.nextInt();}
    vector[i]= tecla;
}

for ( int x : vector)
{
    System.out.println("El numero es: " + x);
}
    
}
}


   