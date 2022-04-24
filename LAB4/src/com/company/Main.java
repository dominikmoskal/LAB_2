package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void zadanie1(){
        double N;
        int a;
        int b;
        int ileN = 0;
        int ileAB = 0;
        int ileAN = 0;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        a = scan.nextInt();
        b = scan.nextInt();
        for (int i = 0; i < N; i++) {
            if(i%3==0) ileN++;
        }
        for (int i = a; i <=b ; i++) {
            if(i%3==0) ileAB++;
        }
        if(a<N && b>N) {
            for (int i = a; i <= N; i++)
                if (i % 3 == 0) ileAN++;
            System.out.println("Liczba podizelnych przez 3 w przedziale od "+a+" do "+N+" wynosi "ileAN);
        }
        if(a<N && b<N)
            System.out.println("Liczb podzielnych przez 3 z przedzialu od "+a+" do "+b+"jest "+ileAB);
        if(a>N)
            System.out.println("Brak liczb podzielnych przez 3 zawierających w przedziale");

        System.out.println("Liczba podizelnych przez 3 w przedziale N: "+ileN);
        System.out.println("Liczba podizelnych przez 3 w przedziale ab: "+ileAB);
    }



    public static void main(String[] args) {


    }
}