import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ItDezReaisMutavel implements Iterator<Double> {
    private int knownMod = 0;
    int posLast = -1;
    boolean canRemove = false;
    DezReaisMutavel drm;

    public void verifyMod(){
        if(knownMod != drm.getMod()){
            throw new ConcurrentModificationException();
        }
    }

    public ItDezReaisMutavel(DezReaisMutavel drm){
        this.drm = drm;
        knownMod = drm.getMod();
    }

    @Override
    public boolean hasNext() {
        return posLast+1 < drm.size();
    }

    @Override
    public void remove() {
        if(!canRemove){
            throw new IllegalStateException();
        }
        canRemove = false;
        drm.remove(posLast);
        posLast--;
        knownMod++;
    }

    @Override
    public Double next() {
        verifyMod();
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        canRemove = true;
        return drm.get(++posLast);
    }
}
