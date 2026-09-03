public class ExceptionDemo {
    public static void main(String[] args) {

        // NullPointerException example
        String s4 = null;

        if (s4 != null) {
            System.out.println(s4.length());
        } else {
            System.out.println("s4 is null");
        }

        // Array example
        int[] ar = { 1, 2, 3 };
        int idx = 2;

        if (idx >= 0 && idx < ar.length) {
            System.out.println(ar[idx]);
        } else {
            System.out.println("Index out of range");
        }
    }
}