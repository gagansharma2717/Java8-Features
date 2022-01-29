package Lambda.Class1_LambdaExamples;

public class ThreadExample {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Thread Executed");

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
