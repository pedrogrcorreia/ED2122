package Ex6;

import static Ex4.GetPositionOrOrder.getPositionOrOrder;

public class GetNumbersOnInterval {
    public static int getNumbersOnInterval(int min, int max, int[] array){
        int j, k;
        j = getPositionOrOrder(min, array);
        k = getPositionOrOrder(max, array);
        if(j<0) j = -j-1;
        if(k<0) k = -k-1; else k++;

        return k-j;
    }
}
