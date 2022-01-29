package Lambda.Class2_LambdaExamples;
import java.util.*;

public class SortList {

    public static void main(String[] args) {
/*
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(30);
        list.add(80);

        System.out.println("Before Sort "+ list);
        Collections.sort(list); //Ascending Order
        System.out.println("After Sort in Ascending Order "+ list);
        Collections.reverse(list);
        System.out.println("After Sort in Descending Order "+ list);
    */

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(10,"Ramesh",20,45000));
        list.add(new Employee(20,"Sham",30,64000));
        list.add(new Employee(30,"Pramod",24,4600));
        list.add(new Employee(40,"Karan",27,50000));


 /*       Collections.sort(list, new MySort());
        System.out.println(list);*/

        /* Anonymous Class Implementation
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary());
            }
        });
        System.out.println(list);
        */

        /*Lambda Implementation for salary
        Collections.sort(list,(e1,e2)-> (int) (e2.getSalary() - e1.getSalary()));
        System.out.println(list);
*/
        /*Lamda Implementation for name
        Collections.sort(list,(e1,e2)-> e1.getName().compareTo(e2.getName()));
        System.out.println(list);
*/

        Collections.sort(list,(e1,e2)-> e2.getName().compareTo(e1.getName()));
        System.out.println(list);

    }

    /* Legacy Implementation
    static class MySort implements Comparator<Employee>
    {
        In Ascending Order
        @Override
        public int compare(Employee e1, Employee e2){
            return (int) (e1.getSalary()-e2.getSalary());
        }

        In Descending Order
        @Override
        public int compare(Employee e1, Employee e2){
            return (int) (e2.getSalary()-e1.getSalary());
        }
    }*/
}
