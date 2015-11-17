package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;

    public static void main(String[] args) {
        Scanner wej = new Scanner(System.in);
        double x1, x2, x0;
        System.out.println("Program rozwiazujacy rownania kwadratowe!");
        System.out.println("Podaj x^2.");
        double a = wej.nextInt();
        System.out.println("Podaj podaj x.");
        double b = wej.nextInt();
        System.out.println("Podaj ostatnia liczbe.");
        double c = wej.nextInt();
        double d = b * b + 4 * a * c;
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (d < 0) {
            System.out.println("x nie istnieje");
        }
            else if (d == 0) {
                x0 = -b / 2 * a;
                System.out.println("x0 = " + x0);
            }
        }
    }
