package SecondAba;

import entities.Employee;
import entitiesII.FuncList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListedXL {
    public static void main(String[] args) {

        List<FuncList> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees you contract");
        int employs = sc.nextInt();
        for (int i = 0;i < employs;i++){
            System.out.println("Enter id employ ");
            Integer id = sc.nextInt();
            System.out.println("Enter name employ ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter wage");
            Double wage = sc.nextDouble();
            FuncList emp = new FuncList(id, name, wage);
            list.add(emp);
            //or list.add (FuncList = new FuncList(id, name, wage));

        }
        System.out.println("enter id employee");
        int id = sc.nextInt();
       FuncList compare = list.stream().filter(x -> x.getId() == id ).findFirst().orElse(null);
        if (compare == null){
            System.out.println("not exist");
        }
        else {
            System.out.println("Enter value increased");
            double value = sc.nextDouble();
            compare.Increase(value);
        }
        for (FuncList obj: list){
            System.out.println(obj);
        }
        sc.close();









    }
}
