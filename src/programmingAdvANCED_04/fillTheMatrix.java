package programmingAdvANCED_04;

import java.util.Scanner;

public class fillTheMatrix {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);




        String[] command = scanner.nextLine().split(", ");

        int n = Integer.parseInt(command[0]);
        String commandParts = command[1];

        int [][] matrix = new int[n][n];


        switch (commandParts){

            case "A"->fillTheMatrixPatternA(matrix);

            case "B"->fillTheMatrixPatternB(matrix);

        }

        for (int i = 0; i < matrix.length  ; i++) {

            for (int j = 0; j < matrix .length ; j++) {

                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }

    }

    private static void fillTheMatrixPatternB(int[][] matrix) {



        int startNumber = 1;

        for (int col = 0; col < matrix.length; col++) {


            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = startNumber++;
                }
            } else  {
                for (int row = matrix.length -1; row >=0; row--) {
                    matrix[row][col] = startNumber++;
                }
            }

        }

    }
    private static void fillTheMatrixPatternA(int[][] matrix ) {

        int startNumber = 1;

        for (int col = 0; col < matrix.length; col++) {

            for (int rows = 0; rows < matrix.length; rows++) {
                matrix[rows][col] = startNumber++;
            }
            
        }

    }
}
