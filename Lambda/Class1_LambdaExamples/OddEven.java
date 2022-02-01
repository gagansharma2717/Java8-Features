package Lambda.Class1_LambdaExamples;

@FunctionalInterface
interface evenOdd{

    void check(int a);
}



public class OddEven {
    public static void main(String[] args) {

        evenOdd num = (n) -> {
            if((n % 2) == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        };

        num.check(3);

        num.check(2);

    }
}
