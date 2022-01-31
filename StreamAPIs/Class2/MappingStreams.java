package StreamAPIs.Class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MappingStreams {
    public static void main(String[] args) {
        List<String> lower = Arrays.asList("a","b","c","d");

        /*
        Before Java 8

        List<String> upper = new ArrayList<>();

        for(String ele : lower)
        {
            upper.add(ele.toUpperCase());
        }

        upper.forEach((i) -> System.out.println(i));
*/

//        With Stream
//        List<String> res = lower.stream().map(String::toUpperCase).collect(Collectors.toList());
//        res.forEach(System.out::println);

//      Second Way
        lower.stream().map((i)-> i.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

//        Example 2
        List<Integer> num1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> res= num1.stream().map((i) -> i*i*i).collect(Collectors.toList());
        res.forEach(System.out::println);
    }
}
