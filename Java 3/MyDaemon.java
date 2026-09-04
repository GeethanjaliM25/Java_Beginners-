public class MyDaemon extends Thread {

    private int limit;

    public MyDaemon(int limit, String name) {
        super(name);
        this.limit = limit;
    }

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();

        for (int c = 1; c <= limit; c++)
            System.out.println(tname + " : " + c);
    }

    public static void main(String[] args) {

        MyDaemon d1 = new MyDaemon(50, "first");
        MyDaemon d2 = new MyDaemon(100, "second");
        MyDaemon d3 = new MyDaemon(150, "third");

        MyDaemon d4 = new MyDaemon(100000, "daemon");
        d4.setDaemon(true);

        d1.start();
        d2.start();
        d3.start();
        d4.start();
    }
}