package Ex3;

public class GetArrayPosition {
    public static int getArrayPosition(int value, int[] array){
        int start = 0;
        int end = array.length;
        int mid = (start+end)/2;

        do{
            for(int i=start; i<end; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\n");
            if(array[mid] == value){
                return mid;
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
            return mid;
        }
        return -1;
    }
}
