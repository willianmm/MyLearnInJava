package SecondAba;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Mariz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int value = sc.nextInt();
        int[][] multi = new int[value][value];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                multi[i][j] = sc.nextInt();
            }
        }
        System.out.println("main diagonal");
        for (int i = 0; i < multi.length; i++) {
                    System.out.println(multi[i][i]);

        }

        int numNegative = 0;
        System.out.println("negatives numbers ");
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                if (multi[i][j] < 0) {
                    System.out.println(multi[i][j]);
                    numNegative += 1;
                }

            }

        }
        System.out.println();
        System.out.println("Total negatives is:" + numNegative);

        sc.close();

    }
}
