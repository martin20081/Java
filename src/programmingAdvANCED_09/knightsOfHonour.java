package programmingAdvANCED_09;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class knightsOfHonour {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String[] names = scanner.nextLine().split("\\s+");


        Consumer<String> printName = name -> System.out.println("Sir"+" "+name);

        for (String name : names) {
            printName.accept(name);
        }
    }
}
