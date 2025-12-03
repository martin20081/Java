package programmingAdvANCED_06;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class fixEmails {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();

        String email = "";

        Map<String , String> collection = new LinkedHashMap<>();

        while (!command.equals("stop")){

            email = scanner.nextLine();

            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")){
                collection.put(command , email);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, String> stringStringEntry : collection.entrySet()) {
            System.out.printf("%s -> %s%n",stringStringEntry.getKey() , stringStringEntry.getValue());
        }
    }
}
