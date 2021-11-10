package Ex3;

public class Resolution {

    public static int ex3a(Figure f1, Figure f2){
        return f2.compareTo(f1);
    }

    public static int ex3b(Rectangle r, Comparable<?super Rectangle> c){
        return c.compareTo(r);
    }

    public static <T> int ex3c(T t, Comparable<? super T> c){
        return c.compareTo(t);
    }

}
