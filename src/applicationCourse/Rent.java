package applicationCourse;

import entities.RentRooms;

import java.util.Scanner;

public class Rent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentRooms[] rent = new RentRooms[10];
        System.out.println("How many students");
        int numStudy = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numStudy; i++) {
            System.out.println("enter name");
            String name = sc.nextLine();
            System.out.println("Enter email");
            String email = sc.nextLine();
            System.out.println("Enter room");
            int room = sc.nextInt();
            rent[room] = new RentRooms(name, email);
        }
        for (int i = 0; i < rent.length; i++) {
            if (rent[i] != null) {
                System.out.println("Room " + i + " equal " + rent[i]);
            }
        }





    }
}
