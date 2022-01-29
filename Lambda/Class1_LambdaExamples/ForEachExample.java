package Lambda.Class1_LambdaExamples;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {

        List<String> lang = new ArrayList<String>();

        lang.add("C");
        lang.add("C++");
        lang.add("Java");

        lang.forEach((element) -> System.out.println(element));


    }

}
