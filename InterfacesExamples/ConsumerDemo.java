package InterfacesExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> cons = (t) -> System.out.println(t);
        cons.accept("Rahul");

        Consumer<String> consumer = (input) -> System.out.println(input + " Hello World!!!");
        consumer.accept("Gagan");
    }
}
