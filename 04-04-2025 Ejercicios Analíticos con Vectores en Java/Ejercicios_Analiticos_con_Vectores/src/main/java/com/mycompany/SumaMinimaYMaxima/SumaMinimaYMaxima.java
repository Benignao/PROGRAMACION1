/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios_analiticos_con_vectores;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;


/**
 *
 * @author brsan
 */
public class Ejercicios_Analiticos_con_Vectores {

    public static void main(String[] args)     {
//declaracion
int vector [] = new int [5];

//Asignacion por teclado
Scanner teclado = new Scanner (System.in);
for (int i=0; i<vector.length; i++){
    System.out.println("ingrese el valor para el indice " + i);
    vector [i]=teclado.nextInt();
    System.out.println("\n");
}

//recorrido
for (int i=0; i<vector.length; i++){
    System.out.println("estoy en el indice: "+i);
        System.out.println("Tengo guardado un:  "+vector[i]);
        System.out.println("------------------------------- \n");
}

}}
