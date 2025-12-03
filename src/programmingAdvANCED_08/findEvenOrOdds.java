package programmingAdvANCED_08;

import java.util.Scanner;

public class findEvenOrOdds {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split("\\s+");

        int firstNumber = Integer.parseInt(command[0]);
        int secondNumber = Integer.parseInt(command[1]);


        String input = scanner.nextLine();



        if(input.equals("odd")){

            for (int i = firstNumber; i <=secondNumber ; i++) {

                if (i % 2 != 0) {
                    System.out.print(i+" ");
                }

            }
        }else {
            for (int i = firstNumber; i <=secondNumber ; i++) {

                if (i % 2 == 0) {
                    System.out.print(i+" ");
                }

            }
        }


    }
}
