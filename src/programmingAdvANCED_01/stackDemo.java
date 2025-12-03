package programmingAdvANCED_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class stackDemo {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        //stack size
        int size = stack.size();
        System.out.println(size);


        // check if its empty
        boolean isEmpty = stack.isEmpty();
        System.out.println(isEmpty);

        //check if stack contains certain element
        boolean containsElement = stack.contains(3);
        System.out.println(containsElement);

        //adding Elements - push
        stack.push(2);


        //removing Elements
        stack.pop();
        int lasNumber = stack.pop();

        //finding Last Number
        int currentLastNumber = stack.peek();





    }
}
