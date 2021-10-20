package Ex8;

import static Ex3.GetArrayPosition.getArrayPosition;
import static Ex4.GetPositionOrOrder.getPositionOrOrder;

public class GetBiggerThanZ {
    public static int getBiggerThanZ(int z, int array[]){
        int pos = getPositionOrOrder(z, array);

        if(pos == -1 || pos == 0){
            return z;
        }

        if(pos<0){
            pos = -pos-1;
        }

        return array[pos-1];
//
//        System.out.println("POS " + pos);
//        if(pos < 0) {
//            pos = Math.abs(pos+1);
//            if(pos == array.length){
//                return array[pos-1];
//            }
//            return array[pos];
//        }
//
//        if(pos == array.length-1){
//            return array[pos-1];
//        }
//        if(pos == -1){
//            return z;
//        }
//        return array[pos-1];
//

    }
}
