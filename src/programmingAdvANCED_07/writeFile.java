package programmingAdvANCED_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class writeFile {


    public static void main(String[] args) throws IOException {



        String pathReadFile = "C:\\Users\\kiril\\IdeaProjects\\Java_Advanced\\src\\programmingAdvANCED_07\\input.txt";
        String pathWriteFile = "C:\\Users\\kiril\\IdeaProjects\\Java_Advanced\\src\\programmingAdvANCED_07\\output_task_02";


        FileInputStream readStream = new FileInputStream(pathReadFile);
        FileOutputStream writeStream = new FileOutputStream(pathWriteFile);

        int currentByte = readStream.read();

        while (currentByte >= 0) {

         char currentSymbol = (char) currentByte;

         if (currentSymbol != '.' && currentSymbol!= ',' && currentSymbol != '!' && currentSymbol != '?') {
             writeStream.write(currentSymbol);

         }
            currentByte = readStream.read();
        }

        readStream.close();;
        writeStream.close();


    }
}
