package applicationCourse;

import java.util.Scanner;

public class MediaAritimetic {
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
            sum += vector[i];
        }
        double media = sum / num;
        System.out.println("The media is "+ media);
        for (int i = 0; i < num; i++) {
            if (vector[i] < media){
                System.out.println("Values Down media " + vector[i]);
            }

        }

    }
}
