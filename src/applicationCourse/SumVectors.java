package applicationCourse;

import java.util.Scanner;
import java.util.Vector;

public class SumVectors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many values you want in every vector: ");
        int num = sc.nextInt();

        double[] vectorA = new double[num];
        for (int i = 0; i < num; i++){
            System.out.println("enter a number that vector A");
            vectorA[i] = sc.nextDouble();
        }
        double[] vectorB = new double[num];
        for (int i = 0; i < num; i++){
            System.out.println("Enter value that vector B");
            vectorB[i] = sc.nextDouble();
        }
        for (int i = 0; i < num; i++) {
            System.out.println("This values in vector A are: ");
            System.out.println(vectorA[i]);
        }
        for (int i = 0; i < num; i++) {
            System.out.println("This values in vector B are: ");
            System.out.println(vectorB[i]);
        }
        double[] vectorC = new double[num];
        for (int i = 0; i < num; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        System.out.println("The sum between vectors is: ");
        for (int i = 0; i < num; i++) {
            System.out.println(vectorC[i]);

        }
        sc.close();

    }
}
