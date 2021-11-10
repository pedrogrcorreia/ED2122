package Ex1;

public class SearchArray {
    public static <T> boolean searchArray(T array[], T element){
        int counter=0;
        for(T it : array){
            if(it == element){
                counter++;
                if(counter>1){
                    return true;
                }
            }
        }
        return false;
    }
}
