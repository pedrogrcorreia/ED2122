import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ex6 {

    public static <T> void revPrint(Collection<T> col) {
        Stack<T> stack = new Stack<>(new ArrayList<T>());
        for (T val : col) {
            stack.push(val);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        List alist = new ArrayList();

        alist.add("AA");
        alist.add("BB");
        alist.add("CC");
        alist.add("DD");

        System.out.println(alist);
        revPrint(alist);
    }
}
