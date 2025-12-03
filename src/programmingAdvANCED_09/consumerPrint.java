package programmingAdvANCED_09;

import java.util.Scanner;
import java.util.function.Consumer;

public class consumerPrint {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String [] command = scanner.nextLine().split(" ");

        Consumer<String> printName = System.out::println;

        for (String name : command){
            printName.accept(name);
        }
    }
}
