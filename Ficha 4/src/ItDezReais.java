import java.util.Iterator;
import java.util.NoSuchElementException;

public class ItDezReais implements Iterator<Double> {
    int posLast = -1;
    DezReais dr;

    public ItDezReais(DezReais dr){
        this.dr = dr;
    }

    @Override
    public boolean hasNext() {

        return posLast+1 < dr.size();
    }

    @Override
    public Double next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return dr.get(++posLast);
    }
}
