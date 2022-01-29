package Lambda.Class3_FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {


        List<Person> list = new ArrayList<>();
        list.add(new Person("Aman",20));
        list.add(new Person("Gagan",25));
/*
        list.forEach((person) -> {
            System.out.println(person.getName());
        });*/

        Consumer<Person> consumer = ((person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

        consumer.accept(new Person("Karan",35));



    }

}
