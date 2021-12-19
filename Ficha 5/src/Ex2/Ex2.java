import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex2 {
    static void inverter(List<?> l) {
        ListIterator it = l.listIterator(l.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }

    public static void main(String[] args) {
        List alist = new ArrayList<>();
        alist.add("A");
        alist.add("B");
        alist.add("C");

        System.out.println("Original list: " + alist);
        inverter(alist);
    }
}
