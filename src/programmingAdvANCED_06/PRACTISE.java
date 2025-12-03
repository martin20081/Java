package programmingAdvANCED_06;

import javax.net.ssl.SSLContext;
import javax.swing.text.MaskFormatter;
import java.util.*;

public class PRACTISE {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String email = "";

        Map<String , String> map = new LinkedHashMap<>();

        while (!command.equals("stop")){

            email = scanner.nextLine();

            if (!email.endsWith("us") && !email.endsWith("us") && !email.endsWith("com")){

                map.put(command , email);
            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.printf("%s -> %s%n",stringStringEntry.getKey() , stringStringEntry.getValue());
        }
    }
}
