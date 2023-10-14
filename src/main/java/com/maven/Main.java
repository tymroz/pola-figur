package com.maven;
import java.util.Scanner;

import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.println("Wybierz figurę (kolo, kwadrat, prostokat): ");
        String figura = scanner.nextLine().toLowerCase();

        switch (figura) {
            case "kolo": {
                Kolo kolo = new Kolo();
                out.print("Podaj promien kola: ");
                kolo.promien = scanner.nextDouble();
                out.println("Pole " + figura + " wynosi: " + kolo.pole());
            };
            break;
            case "kwadrat": {
                Kwadrat kwadrat = new Kwadrat();
                out.print("Podaj dlugosc boku kwadratu: ");
                kwadrat.bok = scanner.nextDouble();
                out.println("Pole " + figura + " wynosi: " + kwadrat.pole());
            };
            break;
            case "prostokat": {
                Prostokat prostokat = new Prostokat();
                out.print("Podaj dlugosc pierwszego boku prostokata: ");
                prostokat.bokA = scanner.nextDouble();
                out.print("Podaj dlugosc drugiego boku prostokata: ");
                prostokat.bokB = scanner.nextDouble();
                out.println("Pole " + figura + " wynosi: " + prostokat.pole());
            };
            break;
            default:
                out.println("Nieprawidlowy wybor figury.");
                break;
        }
    }
}