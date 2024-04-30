package applicationCourse;

import entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCicle02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);
            System.out.println("Enter radius");
            double radius = sc.nextDouble();
            double c = Calculator.Circumference(radius);
            double v = Calculator.Volume(radius);
            System.out.printf("Circumference: %.2f%n ", c);
            System.out.printf("Volume: %.2f%n ", v);
            System.out.printf("PI %.2f%n ",Calculator.PI);

            sc.close();
        }

    }

