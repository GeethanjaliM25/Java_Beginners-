import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionDemo {
    public static void main(String[] args) {

        LinkedList<String> lst = new LinkedList<String>();

        lst.add("Microsoft");
        lst.add("Google");
        lst.add("Apple");
        lst.add("Apache");
        lst.addLast("Apache");
        lst.add(2, "Oracle");

        System.out.println("-- Traversing using for loop");

        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }

        System.out.println("-- Traversing using Iterator");

        Iterator<String> itr = lst.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("-- Traversing using for-each");

        for (String e : lst) {
            System.out.println(e);
        }

        System.out.println("-- Traversing using for-each method");

        lst.forEach(System.out::println);

        ArrayList<String> ar = new ArrayList<String>();

        ar.add("IBM");
        ar.add("Apple");
        ar.add("DBoss");

        ar.addAll(lst);

        System.out.println("-- Traversing over merged collection");

        for (String e : ar) {
            System.out.println(e);
        }

        HashSet<String> set = new HashSet<String>(ar);

        System.out.println("-- Traversing over set collection");

        for (String e : set) {
            System.out.println(e);
        }

        TreeSet<String> tree = new TreeSet<String>(set);

        System.out.println("-- Traversing over sorted collection");

        for (String e : tree) {
            System.out.println(e);
        }
    }
}