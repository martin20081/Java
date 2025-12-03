package programmingAdvANCED_03;

import java.util.Arrays;
import java.util.Scanner;

public class maximumSumOfSubMatrix {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(command[0]);
        int col = Integer.parseInt(command[1]);


        int[][] matrix = new int[rows][col];

        fillMatrix(matrix , scanner);

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        int startRow = 0;
        int startCol = 0;

        for (int row = 0; row < rows -1; row++) {

            for (int column = 0; column < col -1; column++) {

                int sumOfSubMatrix = matrix[row][column]
                        + matrix[row][column+1]
                        +matrix[row+1][column+1]
                        +matrix[row+1][column];


                if (sumOfSubMatrix > maxSum) {
                    maxSum = sumOfSubMatrix;
                    startRow = row;
                    startCol = column;
                }


            }
        }

        System.out.print(matrix[startRow][startCol]+" ");
        System.out.println(matrix[startRow][startCol+1]);

        System.out.print(matrix[startRow+1][startCol]+" ");
        System.out.println(matrix[startRow+1][startCol+1]);
        System.out.println(maxSum);
    }

    private static void fillMatrix(int[][] matrix , Scanner scanner){

        for (int row = 0; row <=matrix.length - 1 ; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();

        }
    }
}
