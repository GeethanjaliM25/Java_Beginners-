public class StaticDemo {
    private int data;
    private int count;

    public StaticDemo(int data) {
        this.data = data;
        count++;
    }

    public void display() {
        System.out.println("Data: " + data);
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo(10);
        obj1.display();

        StaticDemo obj2 = new StaticDemo(20);
        obj2.display();
        StaticDemo obj3 = new StaticDemo(30);
        obj3.display();
    }
}
