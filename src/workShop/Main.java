package workShop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        SmartArray arrayList = new SmartArray();


        int n = Integer.parseInt(scanner.nextLine());

        for (int position = 0; position < n ; position++) {

            int currentElement = Integer.parseInt(scanner.nextLine());
            arrayList.add(currentElement);

        }

        arrayList.forEach(System.out::println);
    }
}
