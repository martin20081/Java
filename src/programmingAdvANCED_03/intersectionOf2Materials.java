package programmingAdvANCED_03;

import java.util.Arrays;
import java.util.Scanner;

public class intersectionOf2Materials {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int rows = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());


        String[][] firstMatrix = new String[rows][col];
        String[][] secondMatrix = new String[rows][col];


        fillFirstMatrix(firstMatrix , scanner);
        fillFirstMatrix(secondMatrix , scanner);

        for (int i = 0; i <= rows -1 ; i++) {
            for (int columns = 0; columns <=col -1 ; columns++) {

                String elementA = firstMatrix[i][columns];
                String elementB = secondMatrix[i][columns];


                if (elementA.equals(elementB)){
                    System.out.print(elementA+" ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    private static void fillFirstMatrix(String[][] firstMatrix , Scanner scanner){

        for (int row = 0; row <=firstMatrix.length - 1 ; row++) {
            firstMatrix[row] = scanner.nextLine().split("\\s+");

        }
    }
}
