package Ex1;

public class Ex1 {
    public static void main(String[] args){
        System.out.println("The soma++ operation is the main operation for the analysis in all cases.\n");
        System.out.println("a) The operation is performed n*n times => O(N^2)");
        System.out.println("If the data value is increased by 4, the execution time is 16 times larger => 4n*4n\n");

        System.out.println("b) The operation is performed n times => O(N)");
        System.out.println("If the data value is increased by 4, the execution time is 4 times larger => 4n\n");

        System.out.println("c) The operation is performed n/2 times => O(N)");
        System.out.println("If the data value is increased by 4, the execution time is 4 times larger => 4n/2\n");

        System.out.println("d) The operation is performed 1000*n times => O(N), because 1000 is a constant");
        System.out.println("If the data value is increased by 4, the execution time is 4 times larger => 1000*4n\n");

        System.out.println("e) The operation is performed n+n times => O(N)");
        System.out.println("If the data value is increased by 4, the execution time is 4 times larger => 2*(4n)\n");

        System.out.println("f) The operation is performed 20000*20000 times => O(1), because 20000 is a constant");
        System.out.println("If the data value is increased by 4, the execution time is the same\n");

        System.out.println("g) The operation is performed n*n*n times => O(N^3)");
        System.out.println("If the data value is increased by 4, the execution time is 64 times larger => 4n*4n*4n\n");

        System.out.println("h) The operation is performed n*i times => O(N^2), i = n/2");
        System.out.println("If the data value is increased by 4, the execution time is 16 times larger => 4n*4i\n");

        System.out.println("i) The operation is performed n*n*i times => O(N^3), i = n/2");
        System.out.println("If the data value is increased by 4, the execution time is 64 times larger => 4n*4n*4i\n");

        System.out.println("j) The value of i doubles every iteration => O(log(n))");
        System.out.println("If the data value is increased by 4, there are only 2 more executions\n");
    }
}
