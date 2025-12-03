package programmingAdvANCED_07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class practise {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        String command = scanner.nextLine();

        while (!command.equals("report")){
            String[] commandParts  = command.split("\\|");
            String city = commandParts[0];
            String country = commandParts[1];
            String population = commandParts[2];


            System.out.printf("%s (total population: %s)%n",country , population);
            System.out.printf("=>%s: %s%n",city , population);

            command = scanner.nextLine();
        }
    }
}
