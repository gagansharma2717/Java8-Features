package Lambda.Class1_LambdaExamples;

public class LambdaDiffWays {
    @FunctionalInterface
    interface Addable{
        //Functional interface can have only one abstract method and can contain any number of default and static methods.
        //A functional interface can extend interface only when parent interface does not contain any abstract method

        int add(int a, int b);

        default void m1(){

        }
        static void m2(){

        }
    }

    public static void main(String[] args)
    {
        /*Lamda with 2 arguments
        Addable withLambda = (int a ,int b) -> (a+b);
        System.out.println(withLambda.add(100,200));*/

        /*Lamda with 2 arguments without type
        Addable withLambda = (a ,b) -> (a+b);
        System.out.println(withLambda.add(100,200));
*/
        //Lamdba with multiple arguments
        Addable withLambda = (a ,b) -> {
            System.out.println(a);
            System.out.println(b);
            return (a+b);
        };
        System.out.println(withLambda.add(100,200));

    }
}
