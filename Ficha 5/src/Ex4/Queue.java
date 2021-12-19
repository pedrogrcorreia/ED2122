import java.util.List;
import java.util.ListIterator;

public class Queue<T> {
    List<? super T> l;

    public Queue(List<? super T> li) {
        l = li;
        l.clear();
    }

    public boolean empty() {
        return l.size() == 0;
    }

    /** Add element to the end of the queue */
    public void add(T n) {
        l.add(n);
    }

    /** Remove the first element */
    public T remove() {
        return (T) l.remove(0);
    }

    /** Get the first element */
    public T element() {
        ListIterator<? super T> li = l.listIterator();
        return (T) li.next();
    }

    public static double test(Queue q, long sz) {
        long startTime = System.nanoTime();
        for (int j = 0; j < sz; j++) {
            q.add(j);
        }
        for (int j = 0; j < sz; j++) {
            q.remove();
        }
        return (System.nanoTime() - startTime) / 1000000.0;
    }

    public static void main(String args[]) {
        List alist = new ArrayList();
        List llist = new LinkedList();
        long n, sz = 50000, nruns = 20;

        double tm;

        Queue qal = new Queue(alist);
        Queue qll = new Queue(llist);

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
