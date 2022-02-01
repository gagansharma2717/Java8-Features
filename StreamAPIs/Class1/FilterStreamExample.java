package StreamAPIs.Class1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamExample {
    public static void main(String[] args) {

        //Legacy Way
        /*List<Product> list = new ArrayList<>();

        for(Product product : getProducts())
        {
            if(product.getPrice() > 30000)
            {
                list.add(product);
            }
        }

        for (Product product : list){
            System.out.println(product);
        }*/

        //Using Stream Api
//        List<Product> list2 = getProducts().stream().filter((product) -> product.getPrice() > 30000f ).collect(Collectors.toList());
//        list2.forEach(System.out::println);

        getProducts().stream().filter((product) -> product.getPrice() > 30000f ).forEach(System.out::println);

    }

    private static List<Product> getProducts(){

        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1,"Gagan",20500f));
        productsList.add(new Product(2,"Rohit",55000f));
        productsList.add(new Product(3,"Akshay",75500f));
        productsList.add(new Product(4,"Hp",39500f));
        productsList.add(new Product(5,"Dell",28500f));
        return productsList;
    }
}

