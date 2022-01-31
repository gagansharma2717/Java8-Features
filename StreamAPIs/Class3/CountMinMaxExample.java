package StreamAPIs.Class3;

import java.util.Comparator;
import java.util.stream.Stream;

public class CountMinMaxExample {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println("Cnt : "+ stream.count());

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9);
        Integer min = stream2.min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min : "+ min);

        Stream<Integer> stream3 = Stream.of(1,2,3,4,5,6,9,7,8);
        Integer max = stream3.max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max : "+max);
    }
}
