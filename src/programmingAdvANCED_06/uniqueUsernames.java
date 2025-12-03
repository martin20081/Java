package programmingAdvANCED_06;

import com.sun.source.doctree.EscapeTree;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueUsernames {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        Set<String> words = new LinkedHashSet<>();


        fillInSet(words , n , scanner);


        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void fillInSet(Set<String> words, int n , Scanner scanner ) {

        for (int position = 0 ; position < n; position++) {

            String command = scanner.nextLine();

            words.add(command);

        }




    }
}
