import Ex3.Figure;
import Ex3.Rectangle;
import Ex3.Square;
import Ex5.Point;

import static Ex1.SearchArray.searchArray;
import static Ex2.SearchArrayCompareTo.searchArrayCompareTo;
import static Ex3.Resolution.ex3a;
import static Ex3.Resolution.ex3b;
import static Ex3.Resolution.ex3c;
import static Ex4.SearchMax.searchMax;

public class Main {

    public static <T> void printArray(T[] array){
        for(T it : array){
            System.out.print(it + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args){

        String[] stringArray = {"Ana", "Joao", "Manel", "Manel", "Ze"};
        Integer[] integerArray = {1, 2, 3, 4, 4};
        printArray(stringArray);
        printArray(integerArray);

        System.out.println("----EX1----");
        System.out.println("stringArray search for Manel: "+searchArray(stringArray, "Manel"));
        System.out.println("integerArray search for 4: "+searchArray(integerArray, 4));

        System.out.println("----EX2----");
        System.out.println("stringArray search (compareTo) for Manel: "+searchArrayCompareTo(stringArray, "Manel"));
        System.out.println("integerArray search (compareTo) for 4: "+searchArrayCompareTo(integerArray, 4));

        System.out.println("----EX3----");
        Rectangle rec = new Rectangle(3, 3);
        Square sq = new Square(3);

        System.out.println(ex3a(rec, sq));
        System.out.println(ex3b(rec, sq));
        System.out.println(ex3c(rec, sq));

        System.out.println("----EX4----");
        System.out.println(searchMax(stringArray, "Zg"));
        System.out.println(searchMax(integerArray, 2));

        System.out.println("----EX5----");
        Point<Integer, Integer> p = new Point<>(4, 5);
        Point<Number, Number> p2 = new Point<>(3, 3);
        System.out.println("p: " + p);
        System.out.println("p2: " + p2);
        p2.copy(p);
        // p.copy(p2) can't be done because we are going high on hiearchy
        System.out.println("p2 after copy: " + p2);
    }
}
