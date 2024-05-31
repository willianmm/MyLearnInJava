package SecondAba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Listed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Z = sc.next();


         List<String> list = new ArrayList<String>() ;
         list.add(Z);
         list.add("Bruno");
         list.add("Guilherme");
         list.add("Arthur");
         list.add("Arthur");
         list.add("Arthur");


         list.add(2, "Caio");


        System.out.println(list.size());

         for (String i : list){
             System.out.println(i);
         }
        System.out.println("---------------------");
         list.remove(2);
         list.remove("Bruno");

         list.removeIf(x -> x.charAt(0) == 'A');


         for (String j : list){
             System.out.println(j);
         }
         list.add("Willzar");
         list.add("Will");
        System.out.println(list.size());
        System.out.println("____________________________");
        System.out.println("Willian index " + list.indexOf("Willian"));
        System.out.println("____________________________");
        List<String> results = list.stream().filter(x -> x.charAt(0) == 'W').collect(Collectors.toList());
        for (String d : results) {
            System.out.println(d);
        }
        System.out.println("____________________________");
        String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(name);



    }
}
