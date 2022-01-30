package StreamAPIs.Class1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStreamApi {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println("--------------------In Natural Order---------------------");
        List<String> list2 = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        list2.forEach(System.out::println);

        System.out.println("--------------------In Reverse Order---------------------");
        fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        System.out.println("------------In Natural Order Using Comparator ----------");
        List<String> res = fruits.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        res.forEach(System.out::println);

        System.out.println("------------In Reverse Order Using Comparator ----------");
        fruits.stream().sorted((o1,o2) -> o2.compareTo(o1)).forEach(System.out::println);

        System.out.println("------------In Natural Order Using Sorted ----------");
        fruits.stream().sorted().forEach(System.out::println);


    }
}
