package programmingAdvANCED_04;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class diagonalDifference {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix =  readMatrix(size , scanner);



        int rows = 0;
        int col = 0;

        int firstDiagonalSum = 0;

        for (int row = 0; row < size; row++) {

            firstDiagonalSum += matrix[row][col];

            rows++;
            col++;

        }

        rows = 0;
        col = size -1;
        int secondDiagonal = 0;

        for (int row = 0; row < size; row++) {

            secondDiagonal += matrix[row][col];

            rows++;
            col--;

        }

        int result = firstDiagonalSum - secondDiagonal;


        System.out.println(Math.abs(result));



    }

    private static int[][] readMatrix(int size, Scanner scanner) {

        int[][] matrixToReturn = new int[size][];

        for (int row = 0; row < size; row++) {

            matrixToReturn[row] = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }


        return matrixToReturn;
    }
}
