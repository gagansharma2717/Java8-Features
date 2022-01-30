package StreamAPIs.Class1;

import Lambda.Class2_LambdaExamples.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExample2 {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Gagan",22,75000));
        emp.add(new Employee(2,"Rohit",35,55000));
        emp.add(new Employee(3,"Akshay",67,35000));
        emp.add(new Employee(4,"Happy",44,45000));
/*
        List<Employee> res = emp.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());*/

        System.out.println("--------------------Comparison On Salary------------------");
        List<Employee> res = emp.stream().sorted((e1,e2) -> (int) (e1.getSalary()-e2.getSalary())).collect(Collectors.toList());
        res.forEach(System.out::println);

        System.out.println("--------------------Comparison On Salary With Comparing Method------------------");
        List<Employee> res1 = emp.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        res1.forEach(System.out::println);

        System.out.println("--------------------Comparison On Name With Comparing Method------------------");
        List<Employee> res2 = emp.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        res2.forEach(System.out::println);


        System.out.println("--------------------Comparison On Age------------------");
        List<Employee> res3 = emp.stream().sorted((e1,e2) ->(int) (e1.getAge() - e2.getAge())).collect(Collectors.toList());
        res3.forEach(System.out::println);


    }
}

