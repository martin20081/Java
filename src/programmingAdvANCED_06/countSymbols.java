package programmingAdvANCED_06;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countSymbols {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map<Character , Integer> symbols = new TreeMap<>();


        for (int position = 0; position < input.length(); position++) {

            char currentChar = input.charAt(position);

            if (!symbols.containsKey(currentChar)){
                symbols.put(currentChar , 1);
            }else {

                int currentCount = symbols.get(currentChar);
                currentCount++;
                symbols.put(currentChar , currentCount);
            }

        }

        for (Map.Entry<Character, Integer> Entry : symbols.entrySet()) {

            System.out.printf("%s: %s time/s%n",Entry.getKey() , Entry.getValue());
        }

    }
}
