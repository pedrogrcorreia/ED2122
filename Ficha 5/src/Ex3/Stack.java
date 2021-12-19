import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Stack<T> {
    List<? super T> l;

    public Stack(List<? super T> li) {
        l = li;
        l.clear();
    }

    public boolean empty() {
        return l.size() == 0;
    }

    public T peek() {
        ListIterator<? super T> li = l.listIterator(l.size());
        return (T) li.previous();
    }

    public T pop() {
        return (T) l.remove(l.size() - 1);
    }

    public void push(T n) {
        l.add(n);
    }

    public static double test(Stack p, long sz) {
        long startTime = System.nanoTime();
        for (int j = 0; j < sz; j++) {
            p.push(j);
        }
        for (int i = 0; i < sz; i++) {
            p.pop();
        }
        return (System.nanoTime() - startTime) / 1000000.0;
    }

    public void show() {
        ListIterator<? super T> i = l.listIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void main(String[] args) {
        List alist = new ArrayList();
        List llist = new LinkedList();
        long n, sz = 50000, nruns = 20;

        double tm;

        Stack sal = new Stack(alist);
        Stack sll = new Stack(llist);

        System.out.println("Medium execution time " + nruns + "executions (ms)");
        System.out.println("N | ArrayList | LinkedList");

        for (int i = 1; i <= 30; i++) {
            n = sz * i;
            tm = 0;
            for (int j = 0; j < nruns; j++) {
                tm += test(sal, n);
            }
            System.out.printf("%d | %9.2f | ", i, (float) (tm / nruns));
            tm = 0;
            for (int j = 0; j < nruns; j++) {
                tm += test(sll, n);
            }
            System.out.printf("%.2f\n", (float) (tm / nruns));
        }
    }
}
