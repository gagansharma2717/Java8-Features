package StreamAPIs.Class3;


import java.util.HashSet;
import java.util.Set;


public class ForEachSetExample {
    public static void main(String[] args) {

//        Alt + Insert for getters, setter and constructor
//        ctrl+alt+shift+j for all occurrences of word

        Set<Person> set = new HashSet<>();
        set.add(new Person("Gagan",25));
        set.add(new Person("Rakesh",32));
        set.add(new Person("Akshay",35));
        set.add(new Person("Rohit",28));

        //Enhanced For loop
        for(Person person : set)
        {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }

        //Using forEach and lambda
        set.forEach((person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }));

        //Using Streams and Foreach
        set.stream().forEach((person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }));




    }
}
