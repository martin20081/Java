package programmingAdvANCED_07;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class listFiles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        File folder = new File("C:\\Users\\kiril\\IdeaProjects\\Java_Advanced\\src\\programmingAdvANCED_07");

        boolean isExist = folder.exists();

        if (isExist) {
            if (folder.isDirectory()) {
               File [] file =  folder.listFiles();

                for (File file1 : file) {
                    if (!file1.isDirectory()) {
                        System.out.printf("%s: [%d]%n",file1.getName() , file1.length());
                    }
                }
            }
        }

    }
}
