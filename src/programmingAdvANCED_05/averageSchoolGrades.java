package programmingAdvANCED_05;

import java.util.*;

public class averageSchoolGrades {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        Map<String , List<Double>> map = new TreeMap<>();


        for (int position = 0; position < n; position++) {

            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            Double grade = Double.parseDouble(commandParts[1]);


            map.putIfAbsent(commandName , new ArrayList<>());

            map.get(commandName).add(grade);

        }


        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double average = getAvearge(grades);
            System.out.print(studentName+" -> ");
            grades.forEach(grade -> System.out.printf("%.2f" , grade));
            System.out.printf("(avg : %.2f)" , average);

        }
    }

    private static double getAvearge(List<Double> grades ) {

        double sum = 0;

        for (Double grade : grades) {
            sum+=grade;
        }

        return sum / grades.size();
    }
}
