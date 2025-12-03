package programmingAdvANCED_01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class matchingBrackets {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        String expression = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int position = 0; position <=expression.length() -1 ; position++) {
            char currentSymbol = expression.charAt(position);


            if (currentSymbol == '('){

                stack.push(position);


            } else if (currentSymbol == ')') {

                int positionOpeningBracket = stack.pop();
                System.out.println(expression.substring(positionOpeningBracket , position + 1));
            }

        }
    }
}
