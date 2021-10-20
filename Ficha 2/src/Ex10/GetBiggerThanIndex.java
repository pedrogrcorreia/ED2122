package Ex10;

import static Ex8.GetBiggerThanZ.getBiggerThanZ;

public class GetBiggerThanIndex {
    public static int getBiggerThanIndex(int[] array){
        int start = 0;
        int end = array.length;
        int mid = (start+end)/2;
        int pos = -1;


        for(int i=start; i<end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");

/*      Professor solution

        do{
            if(array[mid]>mid){
                end = mid;
            }
            else{
                start = mid+1;
            }
            mid = (start+end)/2;
        }while(start<end);
        if(array[mid]>mid){
            return mid;
        }
        return -1;

*/

        do {
            if (array[mid] > mid) {
                end = mid - 1;
                pos = mid;
            }
            else{
                start = mid + 1;
            }
            mid = (start+end)/2;
        }while(start<end);

        return pos;
    }
}
