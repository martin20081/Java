package Generics_jar_03;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();

        List<String> names = new ArrayList<>();

        isUtilities.getMin(numbers);
        isUtilities.getMax(names);
    }
}
