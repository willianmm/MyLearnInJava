package applicationCourse;

import entities.Triangle;
import java.util.Scanner;

public class ProgramTriangleOOP2 {
    public static void main(String[] args) {

        Triangle triangleArea1, triangleArea2;
        double perimetroY, perimetroX;

        triangleArea1 = new Triangle();
        triangleArea2 = new Triangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures triangle 1");
        triangleArea1.sideA = sc.nextDouble();
        triangleArea1.sideA = sc.nextDouble();
        triangleArea1.sideA = sc.nextDouble();

        System.out.println("Enter the measures triangle 2");
        triangleArea2.sideA = sc.nextDouble();
        triangleArea2.sideA = sc.nextDouble();
        triangleArea2.sideA = sc.nextDouble();



        perimetroY = triangleArea1.area();
        System.out.println("A area do primeiro triangulo: " + perimetroY);


        perimetroX = triangleArea2.area();
        System.out.println("A area do segundo triangulo : " + perimetroX);

        if(perimetroY > perimetroX){
            System.out.println("Triangle 1 is Bigger");
        } else {
            System.out.println("Triangle 2 is Bigger");
        }

            sc.close();


    }
}
