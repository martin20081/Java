package programmingAdvANCED_07;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class readFile {

    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\kiril\\IdeaProjects\\Java_Advanced\\src\\programmingAdvANCED_07\\input.txt";


        FileInputStream inputStream = new FileInputStream(path);


        int currentByte = inputStream.read();

        while (currentByte >= 0) {

            System.out.print(Integer.toBinaryString(currentByte)+" ");

            currentByte = inputStream.read();
        }

        inputStream.close();
    }
}
