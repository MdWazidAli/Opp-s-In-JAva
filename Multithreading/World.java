package Multithreading;

public class World implements Runnable{
    public void run() {
        for (; ; ) {
            System.out.println("World");
        }
    }

}
