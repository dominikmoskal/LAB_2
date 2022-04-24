package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        kwadratowe(0, -3, 8);
        System.out.println();
        kwadratowe(3, 2, 1);
        System.out.println();
        System.out.println();
        kwadratowe(0, 2, 1);
        // zadanie3(1,4,21);
        zadanie4();

    }

    public static void kwadratowe(double a, double b, double c) {
        if (a != 0) {
            double delta = (b * b) - (4 * a * c);
            if (delta == 0) {
                double x1 = (-b) / (2 * a);
                System.out.println("Rozwiązanie to x1 = " + x1);
            } else if (delta > 0) {
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                double x3 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Rozwiązania to: " + x2 + ", " + x3);
            } else System.out.println("Brak rozwiązania");

        } else {
            System.out.println("To nie jest równanie kwadratowe, a liniowe");
        }

        public static double zadanie2b ( double x){
            if (x >= 1) return (x * x);
            if (x < 1) return x;
            return x;
        }

        public static double zadanie2c ( double x){
            if (x > 2) return 2 + x;
            else if (x == 2) return 8;
            else if (x < 2) return x - 4;
            return x;
        }
        public static void zadanie3 ( double a, double b, double c){
            if (a > b && a > c && b > c) System.out.println("Wynik= " + c + " " + b + " " + a);
            else if (b > a && b > c && a > c) System.out.println("Wynik= " + c + " " + a + " " + b);
            else if (c > b && c > a && b > a) System.out.println("Wynik= " + a + " " + b + " " + c);
            else if (c > b && c > a && a > b) System.out.println("Wynik= " + b + " " + a + " " + c);
        }
        public static void zadanie4 () {
            boolean deszcz;
            boolean autobus;
            Scanner info = new Scanner(System.in);
            deszcz = info.nextBoolean();
            autobus = info.nextBoolean();
            if (deszcz && autobus)
                System.out.println("„Weź parasol, „Dostaniesz się na uczelnie");
            if (deszcz && !autobus)
                System.out.println("Nie dostaniesz się na uczelnię");
            if (!deszcz && autobus)
                System.out.println("Dostaniesz się na uczelnie, „Miłego dnia i pięknej pogody");

        }

    }