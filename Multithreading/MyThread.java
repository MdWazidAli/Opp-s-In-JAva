package Multithreading;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Running:");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
      MyThread t1 = new MyThread();
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());

        System.out.println(Thread.currentThread().getState());

        Thread.sleep(1000);
        System.out.println(t1.getState());

        t1.join();
        System.out.println(t1.getState());
    }
}
