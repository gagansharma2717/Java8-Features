package StreamAPIs.Class2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindExampleStreams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,4,6,3,6,3);

//        findFirst
        Optional<Integer> element = list.stream().findFirst();
        if(element.isPresent())
        {
            System.out.println(element.get());
        }else{
            System.out.println("Stream is Empty!!!");
        }

        Optional<Integer> any = list.stream().findAny();
        if(any.isPresent()){
            System.out.println(any.get());
        }else{
            System.out.println("Stream is Empty!!!");
        }

    }
}
