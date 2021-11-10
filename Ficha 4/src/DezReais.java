import java.util.Iterator;

public class DezReais implements Iterable<Double> {
    protected final int cap = 10;
    protected Double list[] = new Double[cap];
    protected int last = 0;

    Double get(int pos){
        return list[pos];
    }

    int size(){
        return last;
    }

    boolean add(Double val){
        if (size() >= cap){
            throw new RuntimeException();
        }
        list[last++] = val;
        return true;
    }

    public Iterator<Double> iterator(){
        return new ItDezReais(this);
    }
}
