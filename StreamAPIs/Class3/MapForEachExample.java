package StreamAPIs.Class3;

import java.util.HashMap;
import java.util.Map;

public class MapForEachExample {
    public static void main(String[] args) {

        Map<Integer,Person> map = new HashMap<>();

        map.put(1,new Person("Gagan",22));
        map.put(2,new Person("Rahul",32));
        map.put(3,new Person("Mohit",35));
        map.put(4,new Person("Karan",26));
        map.put(5,new Person("Akshay",30));

//       With For loop
//       for(Map.Entry<Integer,Person> entry : map.entrySet())
//        {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue().getName());
//        }

        //With ForEach and Lambda
        map.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v.getName());
        });

    }
}
