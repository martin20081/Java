package programmingAdvANCED_01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class simpleCalculator_02 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> expression = Arrays.stream(scanner.nextLine().split("//s+"))
                .collect(Collectors.toCollection(ArrayDeque::new));


        while (expression.size() > 1) {

            int firstNumber = Integer.parseInt(expression.pop());
            String operation = expression.pop();
            int secondNumber = Integer.parseInt(expression.pop());

            int result = 0;

            if (operation.equals("+")) {

                result = firstNumber + secondNumber;

            } else if (operation.equals("-")) {

                result = firstNumber - secondNumber;

            }

            expression.push("" + result);

        }


        System.out.println(expression.peek());

    }
}