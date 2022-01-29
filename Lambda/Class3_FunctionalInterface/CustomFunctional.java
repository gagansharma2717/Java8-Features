package Lambda.Class3_FunctionalInterface;

public class CustomFunctional {

    interface Custom{

        void print(String message);
    }

    public static void main(String[] args) {

        Custom custom = (message) -> System.out.println(message);
        custom.print("Hello World!!!");
    }
}
