package applicationCourse;

import entities.Employee;

import java.util.Scanner;

public class EmployeeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employe = new Employee();
        System.out.println("What's the employ name: ");
        employe.name = sc.next();
        System.out.println("What Gross salary at employe: ");
        employe.grossSalary = sc.nextDouble();
        System.out.println("What the tax above salary? ");


        employe.tax = sc.nextDouble();
        employe.Discout();
        System.out.println(employe.toString());
        System.out.println("what porcent incresed in salary? ");
        employe.Percent(sc.nextDouble());
        System.out.println(employe.toString());

    }
}
