package programmingAdvANCED_02;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class reverseNumberWithStack {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        String [] command  = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();


        for (String number : command) {
            stack.push(number);
        }


        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");

        }



    }
}
