package InterfacesExamples;

import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static void main(String[] args) {

        //    This interface has only two generic parameters input type and return type generic and one one method apply


//        Function<String,Integer> func = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        };

        Function<String,Integer> func = (s) -> s.length();

        System.out.println(func.apply("Gagan"));

        Function<Integer,String> func2 = (num) -> {
            if(num % 2 == 0 ) return  "Number is Even";
            else return"Number is odd";
        };

        System.out.println(func2.apply(5));
        System.out.println(func2.apply(56));


    }


}
