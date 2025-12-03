package programmingAdvANCED_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistory_01 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        String currentUrl = "";

        String command = scanner.nextLine();

        while (!command.equals("Home")){

            if (command.equals("back")){

                if (browserHistory.size() <= 1) {
                    System.out.println("no previous URLs");
                }else {

                    browserHistory.pop();
                    System.out.println(browserHistory.peek());
                }

            }else {
                currentUrl = command;
                System.out.println(currentUrl);


                browserHistory.push(currentUrl);
            }
            command = scanner.nextLine();
        }


    }
}
