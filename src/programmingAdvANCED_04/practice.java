package programmingAdvANCED_04;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class practice {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(command[0]);
        int cols = Integer.parseInt(command[1]);

        int[][] firstMatrix = new int[rows][cols];

        fillFirstMatrix(firstMatrix , scanner);

        String[] secondCommand = scanner.nextLine().split(" ");

        int secondRows = Integer.parseInt(secondCommand[0]);
        int secondCols = Integer.parseInt(secondCommand[1]);

        int[][] secondMatrix = new int[secondRows][secondCols];

        fillSecondMatrix(secondMatrix , scanner);



       int firstSum =  returnFirstMatrixSum(firstMatrix);

       int secondSum = returnSecondMatrixSum(secondMatrix);


        if (firstSum == secondSum) {
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

    }
    private static void fillFirstMatrix(int[][] matrix , Scanner scanner){


        for (int row = 0; row <=matrix.length -1 ; row++) {
            matrix[row] = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }


    private static void fillSecondMatrix(int[][] matrix , Scanner scanner){

        for (int row = 0; row <=matrix.length -1 ; row++) {
            matrix[row] = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

    }

    private static int returnFirstMatrixSum(int[][] matrix){

        int sum = 0;

        for (int row = 0; row <=matrix.length -1 ; row++) {

            for (int col = 0; col <=matrix[row].length -1 ; col++) {

                sum+=matrix[row][col];
            }
        }

        return sum;
    }
    private static int returnSecondMatrixSum(int[][] matrix){

        int sum = 0;

        for (int row = 0; row <=matrix.length -1 ; row++) {

            for (int col = 0; col <=matrix[row].length -1 ; col++) {

                sum+=matrix[row][col];

            }
        }
        return sum;
    }
}
