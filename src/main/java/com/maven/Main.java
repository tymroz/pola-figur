package com.maven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz figure (kolo, kwadrat, prostokat): ");
        String figura = scanner.nextLine().toLowerCase();

        switch (figura) {
            case "kolo":
                Kolo kolo = new Kolo();
                System.out.print("Podaj promien kola: ");
                double promien = scanner.nextDouble();
                System.out.println("Pole " + figura + " wynosi: " + kolo.pole(promien));
                break;
            case "kwadrat":
                Kwadrat kwadrat = new Kwadrat();
                System.out.print("Podaj dlugosc boku kwadratu: ");
                double bok = scanner.nextDouble();
                System.out.println("Pole " + figura + " wynosi: " + kwadrat.pole(bok));
                break;
            case "prostokat":
                Prostokat prostokat = new Prostokat();
                System.out.print("Podaj dlugosc pierwszego boku prostokata: ");
                double bok1 = scanner.nextDouble();
                System.out.print("Podaj dlugosc drugiego boku prostokata: ");
                double bok2 = scanner.nextDouble();
                System.out.println("Pole " + figura + " wynosi: " + prostokat.pole(bok1, bok2));
                break;
            default:
                System.out.println("Nieprawidlowy wybor figury.");
                break;
        }
    }
}