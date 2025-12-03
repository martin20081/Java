package programmingAdvANCED_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class queueDemo {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //creating queue
        ArrayDeque<Integer> queue = new ArrayDeque<>();


        //find the size of the queue
        System.out.println(queue.size());//0

        //checking if my queue is empty
        System.out.println(queue.isEmpty());//true


        //check if it contains certain number
        System.out.println(queue.contains(0));


        //adding elements in my queue
        queue.offer(2);
        queue.offer(12);
        queue.offer(23);
        queue.add(23);


        //deleting an element from ur queue
        queue.poll();
        int removedElement = queue.poll();

        //reaching the firstElement
        int firstElement = queue.peek();
    }
}
