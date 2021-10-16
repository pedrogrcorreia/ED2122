package Ex1;

import java.util.Arrays;

public class BinaryRecursiveSearch {
    public static boolean binaryRecursiveSearch(int value, int[] array){
        int start = 0;
        int end = array.length;
        int mid = (start+end)/2;

        int[] newArray;

        if(end == 0){
            return false;
        }
        if(array[mid] == value){
            return true;
        }

        if(array[mid] > value){
            end = mid-1;
        }
        else{
            start = mid+1;
        }

        if(end<array.length){
            end++;
        }

        newArray = Arrays.copyOfRange(array, start, end);

        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        return binaryRecursiveSearch(value, newArray);
    }
}
