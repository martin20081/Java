package programmingAdvANCED_04;

import java.util.Scanner;

public class matrixOfPalindromes {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int row = Integer.parseInt(command.split(" ")[0]);
        int col = Integer.parseInt(command.split(" ")[1]);

        String[][] matrix = new String[row][col];


        fillMatrix(matrix , row , col);

        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {



    }

    private static void fillMatrix(String[][] matrix , int rows , int col){

        for (int row = 0; row < rows; row++) {

            for (int columns = 0; columns < col; columns++) {

                char char1and3 = (char) (97 + row);
                char char2 = (char) (97 + row + columns);
                String toRefill =  new StringBuilder().append(char1and3).append(char2).append(char1and3).toString();

                matrix[row][columns] = toRefill;


            }

        }

    }
}
