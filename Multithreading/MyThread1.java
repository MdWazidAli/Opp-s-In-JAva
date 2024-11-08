package Multithreading;

public class MyThread1 extends Thread{
    @Override
    public void run() {
//        System.out.println("Running...");
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
         MyThread1 Thread = new MyThread1();
         Thread.start();
         Thread.join();
        System.out.println("hello");
    }

}
