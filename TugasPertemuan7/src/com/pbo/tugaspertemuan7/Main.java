package com.pbo.tugaspertemuan7;

import com.pbo.tugaspertemuan7.LinearEquation;
import java.util.Scanner;

/**
 *
 * @author Jidan AInul Mutaqin
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai a, b, c, d, e, dan f untuk sistem persamaan linear:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("Solusi untuk persamaan linear adalah:");
            System.out.println("x = " + equation.getX());
            System.out.println("y = " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }

        scanner.close();
    }
}
