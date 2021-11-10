package Ex4;

public class SearchMax {
    public static <T> boolean searchMax(T array[], Comparable<? super T> element){
        for(T it : array){
            if(element.compareTo(it) < 0){
                return true;
            }
        }
        return false;
    }
}
