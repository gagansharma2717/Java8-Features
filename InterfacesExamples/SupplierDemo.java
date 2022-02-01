package InterfacesExamples;

import StreamAPIs.Class1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<List<Product>> supplier = ()-> {
            List<Product> productList = new ArrayList<>();
            productList.add(new Product(1,"Gagan",1234));
            productList.add(new Product(2,"Shyam",1255));
            productList.add(new Product(3,"Rahul",1545));
            return  productList;
        };

        System.out.println(supplier.get());
    }
}

