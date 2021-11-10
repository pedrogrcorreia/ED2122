package Ex2;

public class SearchArrayCompareTo {
    public static <T extends Comparable<T>> boolean searchArrayCompareTo(T array[], T element){
        int counter = 0;

        for(T it : array){
            if(element.compareTo(it) == 0){
                counter++;
                if(counter>1){
                    return true;
                }
            }
        }
        return false;
    }
}
