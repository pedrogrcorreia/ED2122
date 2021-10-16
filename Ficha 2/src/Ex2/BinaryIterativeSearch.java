package Ex2;

public class BinaryIterativeSearch {
    public static boolean binaryIterativeSearch(int value, int[] array){
        int start = 0;
        int end = array.length;
        int mid = (start+end)/2;

        do{
            for(int i=start; i<end; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\n");
            if(array[mid] == value){
                return true;
            }
            if(array[mid]<value){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = (start+end)/2;
        }while(start<end);
        if(mid>=array.length){
            mid = array.length-1;
        }
        if(array[mid]==value){
            return true;
        }
        return false;

//        Code done by me at class
//        for(int i=0; i<mid; i++){
//            if(array[mid] == valor){
//                return true;
//            }
//            if(array[mid]>valor){
//                end = mid - 1;
//            }
//            else{
//                start = mid + 1;
//            }
//            mid = (start+end)/2;
//            newArray = Arrays.copyOfRange(array, start, end);
//
//            for(int j=0; j<newArray.length; j++) {
//                System.out.print(newArray[j] + " ");
//            }
//            System.out.print("\n");
//        }
//        return false;
    }
}
