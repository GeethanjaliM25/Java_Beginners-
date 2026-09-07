public class ThreadControl extends Thread {

    public ThreadControl(String name) {
        super(name);
    }

    @Override
    public void run() {

        String tname = Thread.currentThread().getName();

        while (true) {
            System.out.println(tname);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {

        ThreadControl t1 = new ThreadControl("Hello");
        ThreadControl t2 = new ThreadControl("World");

        t1.start();
        t2.start();
    }
}