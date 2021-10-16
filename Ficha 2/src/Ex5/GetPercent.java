package Ex5;

import static Ex4.GetPositionOrOrder.getPositionOrOrder;

public class GetPercent {
    public static double getPercent(int valor, int[] array){
        int pos = getPositionOrOrder(valor, array);
        if(pos>=0){
            return (double)pos/array.length;
        }
        int posInsert = -pos-1;
        return posInsert/(double)array.length;
    }
}
