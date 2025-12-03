package programmingAdvANCED_06;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class phoneBook {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        String command = scanner.nextLine();

        Map<String , String> map = new LinkedHashMap<>();


        while (!command.equals("search")){

            String[] commandParts = command.split("-");
            String commandName = commandParts[0];
            String commandPhoneNumber = commandParts[1];

            map.put(commandName , commandPhoneNumber);


            command  = scanner.nextLine();
        }

        String input = scanner.nextLine();


        while (!input.equals("stop")){

            if (map.containsKey(input)){

                for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
                    if (stringStringEntry.getKey().equals(input)){
                        System.out.printf("%s -> %s%n",stringStringEntry.getKey() , stringStringEntry.getValue());
                        break;
                    }
                }
            }else {
                System.out.printf("Contact %s does not exist.%n",input);
            }

            input = scanner.nextLine();
        }
    }
}
