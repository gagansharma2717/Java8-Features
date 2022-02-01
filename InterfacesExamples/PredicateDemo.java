package InterfacesExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* Legacy way
public class PredicateDemo implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        if(t % 2 == 0) return true;
        else
        return false;
    }

    public static void main(String[] args) {

        Predicate<Integer> predicate = new PredicateDemo();

        System.out.println(predicate.test(5));
    }
}
*/

public class PredicateDemo{

    public static void main(String[] args) {

        /* Anonymous Class
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer % 2 == 0) return true;
                else return false;
            }
        };
*/
        Predicate<Integer> predicate = (num) -> {
            if(num % 2 == 0) return  true;
            else return false;
        };
        System.out.println(predicate.test(6));
        System.out.println(predicate.test(7));

//      Number within range
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> predicate1 = (i) -> i > 5;
        Predicate<Integer> predicate2 = (i) -> i < 8;

        list.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList()).forEach(System.out::println);
    }
}