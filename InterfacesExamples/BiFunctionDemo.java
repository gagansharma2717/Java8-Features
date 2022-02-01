package InterfacesExamples;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> addition = (t, u) -> (t+u);
        System.out.println(addition.apply(10,20));

        BiFunction<Integer,Integer,Integer> subtraction = (t, u) -> (t-u);
        System.out.println(subtraction.apply(10,20));

        BiFunction<Integer,Integer,Integer> multiplication = (t, u) -> (t*u);
        System.out.println(multiplication.apply(10,20));

        BiFunction<Integer,Integer,Integer> divison = (t, u) -> (t/u);
        System.out.println(divison.apply(45,30));

    }
}
