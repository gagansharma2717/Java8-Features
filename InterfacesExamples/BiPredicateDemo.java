package InterfacesExamples;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {

        BiPredicate<String,String> biPredicate = (s1,s2) -> s1.equals(s2);

        System.out.println(biPredicate.test("Ramesh","Ramesh"));
        System.out.println(biPredicate.test("Java","java"));


        BiPredicate<Integer,Integer> b1 = (n1, n2) -> n1 > n2;
        BiPredicate<Integer,Integer> b2 = (n1,n2) -> n1 == n2;

        boolean res = b1.and(b2).test(20,10);
        System.out.println(res);

        boolean res1 = b1.or(b2).test(20,10);
        System.out.println(res1);

    }
}
