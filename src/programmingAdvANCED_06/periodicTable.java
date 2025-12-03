package programmingAdvANCED_06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class periodicTable {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        int count = Integer.parseInt(scanner.nextLine());


        Set<String> elements = new TreeSet<>();


        for (int position = 0 ; position < count; position++) {


            Arrays.stream(scanner.nextLine().split("\\s+")).forEach(element -> elements.add(element));
        }

        elements.forEach(e -> System.out.printf("%s " , e));
    }
}
