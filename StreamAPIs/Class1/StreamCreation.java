package StreamAPIs.Class1;

import java.util.*;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {

        //create a stream
        Stream<String> stream1 = Stream.of("a","b","c","d");
        stream1.forEach(System.out::println);

        //create a stream from sources -- > Collection
        Collection<String> collection = Arrays.asList("Java","Spring","C++","GCP");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        //create a stream from sources -- > List
        List<String> list = Arrays.asList("Java","Spring","GCP");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        //create a stream from sources -- > Set
        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);

        //create a stream from --> Array
        String[] strArray = {"Gagan","Rakul","Shyam"};
        Stream<String> stream5 = Arrays.stream(strArray);
        stream5.forEach(System.out::println);
    }
}
