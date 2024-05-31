package applicationCourse;
import entities.AccontBank;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        double initValue = 0;
        Random random = new Random();
        int min = 1000;
        int max = 9999;
        int numberBank = random.nextInt((max-min)+min);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Want realize one deposit?");
        System.out.println("enter 1 for realize first deposit or 2 for crate account without deposit: ");
        int choice = sc.nextInt();
        if (choice == 2){
            System.out.println("Your account was opened without money");
        } else {
            System.out.println("Enter initial value: ");
            initValue = sc.nextDouble();
        }
        AccontBank accontBank = new AccontBank(name, numberBank, initValue);
        System.out.println(accontBank);


        System.out.println("Wants you deposit?: ");
        double deposit = sc.nextDouble();
        accontBank.AddValue(deposit);
        System.out.println(accontBank);

        System.out.println("Wants you Withdraw?: ");
        double withdraw = sc.nextDouble();
        accontBank.RemoveValue(withdraw);
        System.out.println(accontBank);

        sc.close();
    }
}
