package InterfacesExamples;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {

        BiConsumer<Integer,Integer> add = (i1,i2) -> System.out.println(i1+i2);
        add.accept(10,20);

        BiConsumer<Integer,Integer> sub = (i1,i2) -> System.out.println(i1-i2);
        sub.accept(10,20);

        BiConsumer<Integer,Integer> mul = (i1,i2) -> System.out.println(i1*i2);
        mul.accept(10,20);

        BiConsumer<Integer,Integer> div = (i1,i2) -> System.out.println(i1/i2);
        div.accept(10,20);
    }
}
