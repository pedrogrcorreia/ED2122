import java.util.ArrayList;

public class SortedStack<T extends Comparable<? super T>> {
    Stack<T> val = new Stack<>(new ArrayList<T>());
    Stack<T> min = new Stack<>(new ArrayList<T>());

    public void push(T v) {
        if (min.empty() || min.peek().compareTo(v) >= 0) {
            min.push(v);
        }
        val.push(v);
    }

    public T pop() {
        T ret = val.pop();

        if (ret.compareTo(min.peek()) == 0) {
            min.pop();
        }
        return ret;
    }

    public T findMin() {
        return min.peek();
    }

    public void show() {
        System.out.println("Values: ");
        val.show();
        System.out.println("Min: ");
        min.show();

    }

    public static void main(String[] args) {
        SortedStack ss = new SortedStack();
        ss.push(2);
        ss.push(3);
        ss.push(4);
        System.out.println("Min value: " + ss.findMin());
        ss.show();
        ss.push(1);
        ss.show();
        System.out.println("Min value: " + ss.findMin());
    }
}
