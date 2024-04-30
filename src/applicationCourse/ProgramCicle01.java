package applicationCourse;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCicle01 {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        double c = Circumference(radius);
        double v = Volume(radius);
        System.out.printf("Circumference: %.2f%n ", c);
        System.out.printf("Volume: %.2f%n ", v);
        System.out.printf("PI %.2f%n ",PI);

        sc.close();
    }
    public static double Circumference(double radius){
        return 2.0 * PI * radius;
    }
    public static double Volume(double radius){
        return (4.0 * PI * Math.pow(radius, 3)) /3 ;
    }
}
