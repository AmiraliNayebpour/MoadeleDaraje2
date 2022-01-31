package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mohasebeh moadelat daraje 2 !!");
        System.out.println("===============================");
        System.out.println("a Ro wared konid : ");
        int a = scanner.nextInt();
        System.out.println("b Ro wared konid : ");
        int b = scanner.nextInt();
        System.out.println("c Ro wared konid : ");
        int c = scanner.nextInt();


        double Delta = (b*b) - (4*a*c);
        double deltaRadical = Math.sqrt(Delta);
        double x1 = (-b + deltaRadical) / (2*a);
        double x2 = (-b - deltaRadical) / (2*a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
