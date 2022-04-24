package com.company;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void Zadanie_1(){
        int n = 0;
        System.out.println("Wprowadz liczbe studentow: ");
        Scanner liczba= new Scanner(System.in);
        n = liczba.nextInt();
        int stud = n;
        double punkty = 0;
        double suma = 0;
        Scanner pkt = new Scanner(System.in);
        System.out.println("Wprowadz punkty studentow: ");
        while (n>0)
        {
            punkty = pkt.nextDouble();
            n--;
            suma+=punkty;
        }
        double srednia = 0;
        srednia= suma/stud;
        System.out.println("Srednia wynosi: "+srednia);
    }

    public static void Zadanie_2() {
        int dodatnie = 0, ujemne = 0, ileu = 0, iled = 0;
        Scanner liczba = new Scanner(System.in);
        System.out.print("Wprowadz wielkosc tablicy = ");
        double[] tab = new double[liczba.nextInt()];
        for (int i = 0; i < tab.length; i++)
        {
            System.out.print("Wprowadz liczbe tab[" + i + "] = ");
            tab[i] = liczba.nextDouble();
            if (tab[i] >= 0)
            {
                dodatnie += tab[i];
                iled++;
            }
            else
            {
                ujemne += tab[i];
                ileu++;
            }
        }
        System.out.println("Suma liczb dodatnich = " + dodatnie + " natomiast ujemnych = " + ujemne);
        System.out.println("Ilosc liczb dodatnich = " + iled + " natomiast ujemnych = " + ileu);
    }


    public static void main(String[] args)
    {
        Zadanie_1();
        Zadanie_2();
        Scanner bok = new Scanner(System.in);
        System.out.print("Dlugosc kwadratu = ");
        double dlugosc = bok.nextDouble();
        System.out.print("Szerokosc kwadratu = ");
        double szerokosc = bok.nextDouble();
        Prostokat p1 = new Prostokat(dlugosc,szerokosc);
        System.out.print("Pole kwadratu = ");
        p1.pole();
        System.out.print("Obwod kwadratu = ");
        p1.obwod();
        System.out.print("Przekatna kwadratu = ");
        p1.przekatna();
        Budynek B1 = new Budynek("Szpital",2012,5);
        Budynek B2 = new Budynek("Szkola",2021,1);

        B1.info();
        if(B1.wiek(LocalDate.now().getYear())!=1)
            System.out.print(B1.wiek(LocalDate.now().getYear())+" lat");
        else
            System.out.print(B1.wiek(LocalDate.now().getYear())+" rok");
        System.out.println();

        B2.info();
        if(B2.wiek(LocalDate.now().getYear())!=1)
            System.out.print(B2.wiek(LocalDate.now().getYear())+" lat");
        else
            System.out.print(B2.wiek(LocalDate.now().getYear())+" rok");
    }

}


