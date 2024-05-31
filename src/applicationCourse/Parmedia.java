package applicationCourse;

import java.util.Scanner;

public class Parmedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values in vector?");
        int num = sc.nextInt();
        double[] vector = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.println("enter values");
            vector[i] = sc.nextInt();
        }
        double sum = 0.0;

        for (int i = 0; i < num; i++) {
            if (vector[i] % 2 == 0) {
                sum += vector[i];
            }
        }
        double media = sum / num;
        if (media == 0) {
            System.out.println("No values pair ");
        }else {
            System.out.println("The media this pair is " + media);
        }
        sc.close();


    }
}
