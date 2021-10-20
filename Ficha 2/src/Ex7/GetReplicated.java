package Ex7;

import static Ex4.GetPositionOrOrder.getPositionOrOrder;

public class GetReplicated {
    public static boolean getReplicated(int val, int array[]){
/*      Linear complexity solution

        boolean replicated = false;
        for(int i = 0; i<array.length; i++){
            if(array[i] == val){
                replicated = true;
            }

            if(replicated){
                return true;
            }
        }
*/

/*       Professor solution

        int j;

        j = getPositionOrOrder(val, array);

        if(j<0){
            return false;
        }

        if(j==0){
            if(array[1] != val){
                return false;
            }
            else{
                return true;
            }
        }

        if(j==array.length-1){
            if(array[j-1] != val){
                return false;
            }
            else{
                return true;
            }
        }

        if( (array[j] == array[j-1]) || (array[j] == array[j]+1) ){
            return true;
        }

        return false;

*/

        int pos = getPositionOrOrder(val, array);

        if(pos == 0){
            if(array[pos+1] == val){
                return true;
            }
        }
        if(pos == array.length){
            if(array[pos-1] == val){
                return true;
            }
        }
        if(array[pos-1] == val || array[pos+1] == val){
            return true;
        }
        return false;


    }
}
