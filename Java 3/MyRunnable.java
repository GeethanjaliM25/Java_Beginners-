public class MyRunnable implements Runnable {
    private int data;

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        for (int c = 1; c <= 50; c++)
            System.out.println(tname + ":" + ++data);

    }

    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "First");
        Thread t2 = new Thread(mr, "Second");
        Thread t3 = new Thread(mr, "Third");

        t1.start();
        t2.start();
        t3.start();

    }

}
