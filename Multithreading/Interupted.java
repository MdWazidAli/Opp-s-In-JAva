public class interupted extends Thread{


    @Override
    public void run() {
        System.out.println("Interupted Is Running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread Interupte: " + e);

        }
    }
}


     public void main(String[] args) throws InterruptedException {
    interupted t1 = new interupted();
    t1.start();
    t1.interrupt();

}