class EvenThread extends Thread {

    public EvenThread() {
        super("Even");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

class OddThread extends Thread {

    public OddThread() {
        super("Odd");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

public class NumberThreads {

    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();
        odd.start();
    }
}