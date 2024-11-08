public static class setPriority extends Thread{

    public setPriority(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("setPriority Is Running...");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <=5; j++) {

                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
         }
        }
    }



      public static void main(String[] args) throws InterruptedException {

          setPriority l = new setPriority("Low Priority Thread");
          setPriority m = new setPriority("Medium Priority Thread");
          setPriority n = new setPriority("High Priority Thread");

          l.setPriority(Thread.MIN_PRIORITY);
          m.setPriority(Thread.NORM_PRIORITY);
          n.setPriority(Thread.MAX_PRIORITY);
          l.start();
          m.start();
          n.start();



}

