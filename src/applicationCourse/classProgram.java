package applicationCourse;

import entities.Class;

import java.util.Scanner;

public class classProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Class student = new Class();
        System.out.println("Student name");
        student.nameStudent = sc.next();
        System.out.println("first quarter note ");
        student.firstQuarter = sc.nextDouble();
        System.out.println("second quarter note");
        student.secondQuarter = sc.nextDouble();
        System.out.println("Three quarter note");
        student.threeQuarter = sc.nextDouble();

        System.out.println(student.Note());


        if (student.Note() < 60){
            System.out.println("Student reproved");
            System.out.println("Is necessary:" + student.FinalNote() + " POINTS");
        } else {
            System.out.println("PASS");
        }
        sc.close();

    }
}
