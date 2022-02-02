package Generics;
//
// Generics mean parameterized types. The idea is to allow type (Integer, String, … etc, and user-defined types)
// to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work
// with different data types.
// An entity such as class, interface, or method that operates on a parameterized type is called a generic entity.

class Test<T>{

    T obj;

    public Test(T obj){

        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {

        Test<Integer> intObj = new Test<>(15);
        System.out.println(intObj.getObj());

        Test<String> strObj = new Test<>("Gagan");
        System.out.println(strObj.getObj());

    }
}

