package StreamAPIs.Class3;

import java.util.ArrayList;
import java.util.List;

public class ForEachListExample {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Gagan",25));
        list.add(new Person("Rakesh",32));
        list.add(new Person("Akshay",35));
        list.add(new Person("Rohit",28));

       /* for(Person person : list)
        {
            System.out.println(person);
        }
*/
       /* list.forEach((person) -> {
            System.out.println(person.getAge());
            System.out.println(person.getName());
        });*/

        list.stream().forEach(System.out::println);



    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

