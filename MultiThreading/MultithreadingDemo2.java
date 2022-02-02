package MultiThreading;

public class MultithreadingDemo2 implements Runnable {

    public void run() {
        try {
            System.out.println("Thread is " + Thread.currentThread().getId() + " running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class mthread{

    public static void main(String[] args) {

        int n = 8;

        for (int i = 0 ; i < n ; i++)
        {
            Thread obj = new Thread(new MultithreadingDemo2());
            obj.start();
        }
    }
}
