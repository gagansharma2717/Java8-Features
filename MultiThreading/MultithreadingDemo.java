package MultiThreading;

public class MultithreadingDemo extends Thread{

    public  void run(){
        try{

            System.out.println("Thread is "+Thread.currentThread().getId()+" running");
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
    }

}

class Mulitthread{

    public static void main(String[] args) {

        int n = 8;

        for (int i = 0 ; i < n ; i++)
        {
            MultithreadingDemo multithreadingDemo = new MultithreadingDemo();
            multithreadingDemo.start();
        }
    }
}

