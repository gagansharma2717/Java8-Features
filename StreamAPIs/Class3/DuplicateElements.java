package StreamAPIs.Class3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4,5,1,2,1,3,2,4,5,3,2);

        List<String> strList = Arrays.asList("Gagan","Rahul","Gagan","Saket","Rahul","Gagan");

        Map<Integer,Long> map = numList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map.forEach( (k,v) -> System.out.println(k + "-" + v));

        Map<String, Long> map2 = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map2.forEach( (k,v) -> System.out.println(k + "-" + v));

    }
}
