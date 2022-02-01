package StreamAPIs.Class4;

import java.util.stream.IntStream;

public class StreamDem {

    public static void main(String[] args) {

        //Printing 10 to 100 without any loop
        IntStream.range(10,101).forEach(System.out::println);
    }
}
