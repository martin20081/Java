package programmingAdvANCED_09;

import java.util.Arrays;
import java.util.Scanner;

public class customMinFunction {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String command = scanner.next();

        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int maxNumber = Integer.MAX_VALUE;


        for (int number : numbers) {

            if (number < maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println(maxNumber);
    }
}
