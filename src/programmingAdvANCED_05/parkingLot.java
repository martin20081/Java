package programmingAdvANCED_05;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class parkingLot {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);




        String command = scanner.nextLine();

        Set<String> parking = new LinkedHashSet<>();

        while (!command.equals("END")){

            String[] commandParts = command.split(", ");
            String direction = commandParts[0];
            String plateName = commandParts[1];

            if (direction.equals("IN")){
                parking.add(plateName);
            }else {

                parking.remove(plateName);

            }

            command = scanner.nextLine();
        }


        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }else {

            for (String car : parking) {
                System.out.println(car);
            }
        }

    }
}
