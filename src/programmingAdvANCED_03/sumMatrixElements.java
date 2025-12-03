package programmingAdvANCED_03;

import java.util.Arrays;
import java.util.Scanner;

public class sumMatrixElements {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        String[] command = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(command[0]);
        int col = Integer.parseInt(command[1]);

        int[][] matrix = new int[rows][col];

        fillMatrix(matrix , scanner);

        int sum = 0;


        for (int row = 0; row <=matrix.length -1 ; row++) {

            for (int column = 0; column <=matrix[0].length -1; column++) {

                sum+=matrix[row][column];
            }
        }

        System.out.println(rows);
        System.out.println(col);
        System.out.println(sum);

    }

    private static void fillMatrix(int[][] matrix , Scanner scanner){

        for (int row = 0; row <=matrix.length - 1 ; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();

        }
    }
}
