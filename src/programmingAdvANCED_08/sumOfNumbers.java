package programmingAdvANCED_08;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class sumOfNumbers {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        List<Integer>  numbers = Arrays
                .stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int countNumbers = numbers.size();


        Function<List<Integer> , Integer> sumOfElements = List ->{

            int sum = 0;
            for (Integer i : List) {
                sum+= i;
            }

            return sum;
        };

      int sum =   sumOfElements.apply(numbers);


        System.out.println("count = "+countNumbers);
        System.out.println("Sum = "+sum);






    }
}
