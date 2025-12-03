package programmingAdvANCED_05;

import java.io.DataOutput;
import java.io.StringReader;
import java.util.*;
import java.util.stream.Collectors;

public class largestThreeNumbers {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        int n = Integer.parseInt(scanner.nextLine());

        Map<String , Double> map = new LinkedHashMap<>();


        for (int position = 0; position < n; position++) {


            String command = scanner.nextLine();
            double grade  = Double.parseDouble(scanner.nextLine());

            if (!map.containsKey(command)){

                map.put(command , grade);
            }else {


            }




        }





    }
}
