import java.util.Arrays;
import java.util.Random;

import static Ex1.BinaryRecursiveSearch.binaryRecursiveSearch;
import static Ex2.BinaryIterativeSearch.binaryIterativeSearch;
import static Ex3.GetArrayPosition.getArrayPosition;
import static Ex4.GetPositionOrOrder.getPositionOrOrder;
import static Ex5.GetPercent.getPercent;
import static Ex6.GetNumbersOnInterval.getNumbersOnInterval;

public class Main {
    public static int[] createArrayWith(int value, int dim, boolean diff){
        int m[] = new int[dim];
        if(diff){
            for(int i=0; i<dim; i++){
                m[i] = i*10;
            }
            if((value%10!=0) || (0>value) ||(value>(dim-1)*10)){
                m[0] = value;
            }
        }
        else{
            Random r = new Random();
            int gama = Math.abs(value)<10?10:Math.abs(value);
            for(int i=0; i<dim; i++){
                m[i] = r.nextInt(gama*4)-gama*2;
            }
            m[0] = value;
        }
        Arrays.sort(m);
        return m;
    }

    public static void main(String args[]){
        int array[] = createArrayWith(60, 10, true);
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+ " ");
        }

        System.out.println();

        System.out.println("\t----EX 1----\t");
        boolean recursiveSolution = binaryRecursiveSearch(80, array);
        System.out.println("A: " + recursiveSolution);

        System.out.println("\t----EX 2----\t");
        boolean iterativeSolution = binaryIterativeSearch(80, array);
        System.out.println("A: " + iterativeSolution);

        System.out.println("\t----EX 3----\t");
        int arrayPosition = getArrayPosition(80, array);
        System.out.println("A: " + arrayPosition);

        System.out.println("\t----EX 4----\t");
        int arrayPositionOrOrder = getPositionOrOrder(80, array);
        System.out.println("A: " + arrayPositionOrOrder);

        System.out.println("\t----EX 5----\t");
        double percent = getPercent(80, array);
        System.out.println("A: " + percent);

        System.out.println("\t----EX 6----\t");
        int numbersOnInterval = getNumbersOnInterval(19, 60, array);
        System.out.println("A: " + numbersOnInterval);
    }
}
