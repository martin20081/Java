package programmingAdvANCED_03;

import java.util.Arrays;
import java.util.Scanner;

public class compareMatrices {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(command[0]);
        int col = Integer.parseInt(command[1]);

        int[][] matrix = new int[rows][col];

        fillTheMatrixOne(matrix , scanner);


        String [] secondCommand = scanner.nextLine().split(" ");

        int row = Integer.parseInt(secondCommand[0]);
        int column = Integer.parseInt(secondCommand[1]);


        int [][] matrixTwo = new int[row][column];

        fillMatrixTwo(matrixTwo , scanner);


        int firstSum = 0;
        int secondSum = 0;

        for (int row1= 0; row1 < matrix.length  ; row1++) {

            for (int colum = 0; colum < matrix[0].length ; colum++) {

                firstSum+=matrix[row1][colum];

            }

        }


        for (int row1= 0; row1 < matrixTwo.length  ; row1++) {
            for (int colum = 0; colum < matrixTwo[0].length ; colum++) {
                secondSum+=matrix[row1][colum];
            }

        }




        if (firstSum == secondSum) {
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }


    }

    private static void fillTheMatrixOne(int[][] matrix ,Scanner scanner){

        for (int row = 0; row <=matrix.length - 1 ; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

        }

    }


    private static void fillMatrixTwo(int[][] matrix , Scanner scanner){

        for (int row = 0; row <=matrix.length -1 ; row++) {
            matrix[row] = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

    }


    }
