package Lambda.Class2_LambdaExamples;

public class ArithmeticOps {

    interface Arithmetic{

        int Operations(int a, int b);
    }

    public static void main(String[] args) {

        /*Arithmetic add = new Arithmetic() {
            @Override
            public int Operations(int a, int b) {
                return a + b;
            }
        };*/
        Arithmetic addition  = (a, b) -> a + b;
        System.out.println(addition.Operations(10,20));

        Arithmetic subtraction  = (a, b) -> a - b;
        System.out.println(subtraction.Operations(10,20));

        Arithmetic multiplication  = (a, b) -> a * b;
        System.out.println(multiplication.Operations(10,20));

        Arithmetic divison  = (a, b) -> a / b;
        System.out.println(divison.Operations(10,20));
    }


}
