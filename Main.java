package com.internshala.javaapp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//implicit conversion

//        int radi = 300;
//        long newradi = radi;
//        System.out.println(newradi);
//        //explicit conversion
//        double diameter = 3.40d;
//        int newdiameter = (int) diameter;
//        System.out.println(newdiameter);

        String name ;
        int population ;
        float popdensity;
        double GDP;
        char currency;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        name = scanner.nextLine(); //nextLine to print the complete line or in next it only shows the first word

        System.out.println("enter population");
        population = scanner.nextInt();

        scanner.close(); //for no memmory loss

        currency = scanner.next().charAt(0);  //h
        System.out.println("enter currency");


        System.out.println("your population is "+population);
        System.out.println("your name is "+name);
        System.out.println("your currency is "+currency);


//        int result = 8 % 2;
//        System.out.println(result);

   }
}