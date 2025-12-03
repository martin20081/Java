package programmingAdvANCED_05;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class softuniParty {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();

        Set<String> vipReservation = new TreeSet<>();

        Set<String> regularReservation  = new TreeSet<>();

        while (!command.equals("PARTY")){

            char firstSymbol = command.charAt(0);

            if (Character.isDigit(firstSymbol)){
                vipReservation.add(command);

            }else {
                regularReservation.add(command);
            }
            command = scanner.nextLine();
        }

        String input = scanner.nextLine();


        while (!input.equals("END")){



         vipReservation.remove(input);
         regularReservation.remove(input);


            input = scanner.nextLine();
        }


        System.out.println(vipReservation.size()+regularReservation.size());

        vipReservation.forEach(System.out::println);
        regularReservation.forEach(System.out::println);



    }
}
