package com.nolepiero;

import java.util.Scanner;

public class Ejercicios {
    static Scanner c=new Scanner(System.in);
    static void Ejercicio1(){
        System.out.println("Hola, Por favor Ingrese su nombre");
        String nombre=c.nextLine();
        System.out.println("Ingrese su habilidad");
        String habilidad=c.nextLine();
        System.out.println(nombre + " es "+habilidad);
    }
    static void Ejercicio2(){
        System.out.println("Ingrese un numero");
        int n1=c.nextInt();
        System.out.println("El numero al cuadrado es : "+(n1*n1));;
    }
    static void Ejercicio3(){
        System.out.println("Ingrese el radio del circulo");
        double r= c.nextDouble();
        double c=Math.round((2*(Math.PI*r))*100.0)/100.0;
        double a=Math.round((Math.PI*(r*r))*100.0)/100.0;
        System.out.println("El area del circulo es : "+a);
        System.out.println("La circunferencia del circulo es : "+c);
    }
}
