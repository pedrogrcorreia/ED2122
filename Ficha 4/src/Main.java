import java.util.Iterator;

public class Main {

    public static <T extends Comparable<? super T>> T maiorg(Iterable<T> d) {
        Iterator<T> it = d.iterator();
        T m, temp;
        m = it.next();

        while (it.hasNext()) {
            temp = it.next();
            if (temp.compareTo(m) > 0) {
                m = temp;
            }
        }

        return m;
    }

    public static Double maior(Iterable<Double> d) {
        Iterator<Double> it = d.iterator();
        Double m, temp;

        m = it.next();

        while (it.hasNext()) {
            temp = it.next();
            if (temp > m) {
                m = temp;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        DezReais d = new DezReais();
        ItDezReais id = new ItDezReais(d);

        for (int j = 0; j < 10; j++) {
            d.add(Double.valueOf(j));
        }

        while (id.hasNext()) {
            System.out.println("Last: " + id.next());
        }

        DezReaisMutavel drm = new DezReaisMutavel();
        ItDezReaisMutavel idrm = new ItDezReaisMutavel(drm);

        for (int j = 0; j < 10; j++) {
            drm.add(Double.valueOf(j));
        }

        Double db1;

        while (idrm.hasNext() && (db1 = idrm.next()) < 6) {
            System.out.println("Last: " + db1);
        }

        idrm.remove();

        ItDezReaisMutavel idrm2 = new ItDezReaisMutavel(drm);

        while (idrm2.hasNext()) {
            System.out.println("Without 6: " + idrm2.next());
        }
    }
}
