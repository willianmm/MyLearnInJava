package applicationCourse;

import java.util.Scanner;

public class VetoresArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double[] vect = new double[a];
        for (int i = 0; i < a; i++) {
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;

        for (int i = 0; i < a; i++) {
            sum += vect[i];
        }
        double res = sum / a;
        System.out.println("height" + res);



        sc.close();


    }
}
