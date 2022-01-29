package Lambda.Class3_FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        //F4 to see source
        Predicate<Person> predicate = (person) -> (person.getAge() > 30);
        boolean res = predicate.test(new Person("Rahul",31));
        System.out.println(res);
    }

}

