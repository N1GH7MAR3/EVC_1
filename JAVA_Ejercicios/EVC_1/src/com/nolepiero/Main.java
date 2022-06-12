package com.nolepiero;

import java.util.Scanner;


public class Main {
        static Scanner c=new Scanner(System.in);
        public static void main(String[] args) {
//Ejercicios 1-2-3
            //Ejercicios.Ejercicio1();
            //Ejercicios.Ejercicio2();
            //Ejercicios.Ejercicio3();

//Ejercicio 04
            //Automovil carro1=new Automovil("tesla","2022","Model 3","649Lt","576","4");
            //System.out.println(carro1.toString());

//Ejercicio 05
            //System.out.println("Ingrese un numero");
            //int n=c.nextInt();
            //String r=ParoImpar(n);
            //System.out.println(r);

//Ejercicio 06
            //System.out.println("Ingrese el primer numero");
            //double n1=c.nextDouble();
            //System.out.println("Ingrese el segundo numero");
            //double n2=c.nextDouble();
            //String r=Double.toString(MultiDeci(n1,n2));
            //System.out.println(r);

        }
        static String ParoImpar(int n){
            int n1=n%2;
            String r="";
            if(n1==0){
                r="El numero es par";
            }else{
                r="El numero es impar";
            }
            return r;
        }
        static double MultiDeci(double n1,double n2){
            double r=n1*n2;
            return r;
        }
}