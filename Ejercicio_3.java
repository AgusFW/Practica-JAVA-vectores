/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_vectores;

/**
 *
 * @author agust
 */
public class Ejercicio_3 {
    
    public static void main(String[] args){
    /*3.Se tienen tres vectores. En el primero de ellos se guarda un número de dni, en el segundo un nombre 
    y en el tercero un apellido. Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO 
    TIEMPO y mostrar cada uno de estos datos por pantalla. Pista: tener en cuenta que el índice de cada 
    vector es correspondiente al índice de los demás, es decir, los datos contenidos en el índice cero del 
    vector de dni, se corresponde con el índice cero del vector de nombres y el de apellidos.*/
     
    
    //public static void imprimirDni(){
        
        String nombre [] = {"Martina", "Juan", "Gonzalo", "Soledad", "Tomás"};
        String apellido [] = {"Gomez", "Lopez", "Martinez", "Villegas", "Castillo"};
        int dni[] = {38890887, 40123678, 41234578, 37654213, 32456765};
        
         
        for (int x = 0; x< dni.length ; x++){
        
            System.out.println("DNI: " + dni[x] + " Nombre: " + nombre[x] + " Apellido: " + apellido[x]);
        }

    }

    
}
