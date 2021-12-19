import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex7 {

    /** a) O(N) execution complexity */
    public static <T> void removeEven(List<T> alist) {
        ListIterator<T> iti = alist.listIterator();
        List<T> l = new ArrayList<>(alist.size() / 2 + 1);

        while (iti.hasNext()) {
            iti.next();
            if (iti.hasNext()) {
                l.add((T) iti.next()); /** copy elements on odd positions */
            }
        }

        alist.clear();
        alist.addAll(l);
    }

    /** b) O(1) space complexity */
    public static <T> void removeEven_v2(List<T> alist) {
        ListIterator iti = alist.listIterator();

        while (iti.hasNext()) {
            iti.next();
            iti.remove();
            if (iti.hasNext()) {
                iti.next();
            }
        }
    }

    public static void main(String[] args) {
        List alist = new ArrayList();

        alist.add("AA");
        alist.add("BB");
        alist.add("CC");
        alist.add("DD");

        System.out.println(alist);
        removeEven(alist);
        System.out.println(alist);
    }
}
