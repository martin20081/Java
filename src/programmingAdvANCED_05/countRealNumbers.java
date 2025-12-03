package programmingAdvANCED_05;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countRealNumbers {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        double[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();


        Map<Double , Integer> map = new LinkedHashMap<>();




        for (double array : arr) {

            if (!map.containsKey(array)){

                map.put(array , 1);
            }else {

                int currentNumber = map.get(array);
                map.put(array  , currentNumber + 1);
            }

        }


        for (Map.Entry<Double, Integer> Entry : map.entrySet()) {
            System.out.printf("%s -> %s%n",Entry.getKey() , Entry.getValue());
        }

    }
}
