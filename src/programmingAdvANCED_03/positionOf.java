package programmingAdvANCED_03;

import java.util.Arrays;
import java.util.Scanner;

public class positionOf {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        String matrixDimensions = scanner.nextLine();

        int rows = Integer.parseInt( matrixDimensions.split(" ")[0]);
        int col = Integer.parseInt(matrixDimensions.split(" ")[1]);


        int [][] matrix = new int[rows][col];

        fillMatrix(matrix , scanner);

        int number = Integer.parseInt(scanner.nextLine());


        boolean isFound = false;

        for (int row = 0; row <=matrix.length -1 ; row++) {
            for (int column = 0; column <=matrix[0].length -1 ; column++) {
                if (matrix[row][column] == number) {
                    System.out.println(row+" "+column);
                    isFound = true;
                }

            }

        }
        if (!isFound) {
            System.out.println("Not found");
        }
    }

    private static void fillMatrix(int[][] matrix , Scanner scanner){

        for (int row = 0; row <=matrix.length - 1 ; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

        }
    }
}
