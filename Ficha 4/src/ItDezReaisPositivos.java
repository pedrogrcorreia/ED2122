import java.util.ConcurrentModificationException;
import java.util.Iterator;

class ItDezReaisPositivos implements Iterator<Double> {
    int posLast = -1;
    boolean canRemove = false;
    int knownMod;
    DezReaisMutavel dr;

    public void verifyMod() {
        if (knownMod != dr.getMod()) {
            throw new ConcurrentModificationException();
        }
    }

    public ItDezReaisPositivos(DezReaisMutavel drm) {
        this.dr = drm;
        knownMod = drm.getMod();
    }

    private int nextPositiveIndex(int from) {
        if (from >= dr.size()) {
            return -1;
        }
        while (dr.get(from) < 0) {
            if (++from >= dr.size()) {
                return -1;
            }
        }
        return from;
    }

    public Double next() {
        posLast = nextPositiveIndex(++posLast);
        return dr.get(posLast);
    }

    public boolean hasNext() {
        return nextPositiveIndex(posLast + 1) >= 0;
    }
}