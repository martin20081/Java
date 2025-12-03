package programmingAdvANCED_08;

import java.util.Random;
import java.util.function.Supplier;

public class Demo {


    public static void main(String[] args) {


        Supplier<Integer> getRandomInt = () -> new Random().nextInt(50);

        int rnd = getRandomInt.get();



    }
}
