package Ex9;

public class GetNumberNegative {
    public static int getNumberNegative(int val, int array[]){
        int start = 0;
        int end = array.length;
        int mid = (start+end)/2;

        do{
            for(int i=start; i<end; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\n");
            if(array[mid] == val){
                return mid;
            }
            if(array[mid]*val > 0) {
                if (array[mid] < val) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else{
                if(array[mid] < val){
                    start = mid - 1;
                }else{
                    end = mid + 1;
                }
            }
            mid = (start + end) / 2;
        }while(start<end);
        if(mid>=array.length){
            mid = array.length-1;
        }
        if(array[mid]==val){
            return mid;
        }
        return -1;
    }

}
