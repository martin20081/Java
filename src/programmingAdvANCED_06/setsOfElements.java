package programmingAdvANCED_06;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class setsOfElements {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        String[] command = scanner.nextLine().split(" ");

        int firstSet = Integer.parseInt(command[0]);
        int secondSet = Integer.parseInt(command[1]);


        Set<Integer> firstS = new LinkedHashSet<>();
        Set<Integer> secondS = new LinkedHashSet<>();


        for (int i = 0; i < firstSet ; i++) {

            int numbers = Integer.parseInt(scanner.nextLine());

            firstS.add(numbers);

        }

        for (int i = 0; i < secondSet ; i++) {

            int numbers = Integer.parseInt(scanner.nextLine());

            secondS.add(numbers);

        }


        for (Integer first : firstS) {

            for (Integer second : secondS) {

                if (first.equals(second)){

                    System.out.print(first+" ");

                }
            }
        }
    }
}
