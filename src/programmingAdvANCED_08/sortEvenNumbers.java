package programmingAdvANCED_08;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sortEvenNumbers {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());



        System.out.print(numbers.toString().replace("[" , "").replace("]" , ""));
        System.out.println();
        System.out.print(numbers.toString().replace("[" , "").replace("]" , ""));





    }
}
