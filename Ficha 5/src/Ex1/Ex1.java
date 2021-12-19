import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Ex1 {
    public static <T> void myFill(List<? super T> d, T n) {
        ListIterator it = d.listIterator();
        while (it.hasNext()) {
            it.next();
            it.set(n);
        }
    }

    public static void main(String[] args) {
        List alist = new ArrayList<>();
        alist.add("A");
        alist.add("B");
        alist.add("C");

        System.out.println("Original list: " + alist);
        Collections.fill(alist, "ED");
        System.out.println("List filled with fill(): " + alist);
        myFill(alist, "F");
        System.out.println("List filled with myFill(): " + alist);
    }
}
