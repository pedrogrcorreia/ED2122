import java.util.Arrays;
import java.util.Random;

import static Ex1.BinaryRecursiveSearch.binaryRecursiveSearch;
import static Ex10.GetBiggerThanIndex.getBiggerThanIndex;
import static Ex2.BinaryIterativeSearch.binaryIterativeSearch;
import static Ex3.GetArrayPosition.getArrayPosition;
import static Ex4.GetPositionOrOrder.getPositionOrOrder;
import static Ex5.GetPercent.getPercent;
import static Ex6.GetNumbersOnInterval.getNumbersOnInterval;
import static Ex7.GetReplicated.getReplicated;
import static Ex8.GetBiggerThanZ.getBiggerThanZ;
import static Ex9.GetNumberNegative.getNumberNegative;

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
        int arrayPositionOrOrder = getPositionOrOrder(79, array);
        System.out.println("A: " + arrayPositionOrOrder);

        System.out.println("\t----EX 5----\t");
        double percent = getPercent(80, array);
        System.out.println("A: " + percent);

        System.out.println("\t----EX 6----\t");
        int numbersOnInterval = getNumbersOnInterval(19, 60, array);
        System.out.println("A: " + numbersOnInterval);


        int[] array2 = {3, 3, 7, 7, 12, 14, 14};

        System.out.println("\t----EX 7----\t");
        boolean getReplicated = getReplicated(14, array2);
        System.out.println("A: " + getReplicated);

        int[] array3 = {6, 7, 8, 9, 10, 11, 12};

        System.out.println("\t----EX 8----\t");
        int getBigger = getBiggerThanZ(15, array3);
        System.out.println("A: " + getBigger);

        int[] array4 = {3, 6, 8, -10, -3, -2, -1};

        System.out.println("\t----EX 9----\t");
        int getNegative = getNumberNegative(-2, array4);
        System.out.println("A: " + getNegative);

        int[] array5 = {3, 7, 12, 15};
        int[] array6 = {-3, 1, 7, 12, 15};
        int[] array7 = {-15,-14, 1, 2, 3, 4};

        System.out.println("\t----EX 10----\t");

        int getIndex = getBiggerThanIndex(array5);
        System.out.println("A: " + getIndex);

        getIndex = getBiggerThanIndex(array6);
        System.out.println("A: " + getIndex);

        getIndex = getBiggerThanIndex(array7);
        System.out.println("A: " + getIndex);
    }
}
