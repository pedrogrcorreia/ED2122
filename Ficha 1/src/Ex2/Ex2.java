package Ex2;

public class Ex2 {
    private static long stopTime;
    private static long startTime;

    private static void showTime() {
        long interval=stopTime-startTime;
        long secs=interval/1000000000L;
        long decs=interval-secs*1000000000L;
        decs/=100000000L;
        System.out.println("secs="+secs+"."+decs);
    }
    private static void stopTimer() {
        stopTime=System.nanoTime();
    }
    private static void startTimer() {
        startTime=System.nanoTime();
    }

    static void ex1a(long n){
        long soma=0;
        startTimer();
        for(long i=0;i<n;i++)
            for(long j=0;j<n;j++)
                soma++;
        stopTimer();
        showTime();
    }

    static void ex1b(long n){
        long soma=0;
        startTimer();
        for(long i=0;i<n;i++)
            soma++;
        stopTimer();
        showTime();
    }

    static void ex1c(long n){
        long soma=0;
        startTimer();
        for(long i=0;i<n;i+=2)
            soma++;
        stopTimer();
        showTime();
    }

    static void ex1d(long n){
        long soma=0;
        startTimer();
        for(long i=0;i<1000;i++)
            soma++;
        stopTimer();
        showTime();
    }

    static void ex1e(long n){
        long soma=0;
        startTimer();
        for(long i=0;i<n;i++)
            soma++;
        for(long j=0;j<n;j++)
            soma++;
        stopTimer();
        showTime();
    }

    static void ex1f(long n){
        long soma=0;
        startTimer();
        if(n>20000) n = 20000;
        for(long i=0;i<n;i++)
            for (long j = 0; j < n; j++)
                soma++;
        stopTimer();
        showTime();
    }

    static void ex1g(long n){
        long soma=0;
        startTimer();
        for(long i=0;i<n;i++)
            for(long j=0;j<n*n;j++)
                soma++;
        stopTimer();
        showTime();
    }

    static void ex1h(long n){
        long soma=0;
        startTimer();
        for(long i=0;i<n;i++)
            for(long j=0;j<i;j++)
                soma++;
        stopTimer();
        showTime();
    }

    static void ex1i(long n){
        long soma=0;
        startTimer();
        for(long i=0;i<n*n;i++)
            for(long j=0;j<i;j++)
                soma++;
        stopTimer();
        showTime();
    }

    static void ex1j(long n){
        long soma=0;
        startTimer();
        for(long i=0;i<n;i*=2)
            soma++;
        stopTimer();
        showTime();
    }

    public static void main(String[] args) {
        int n = 120000;
        System.out.print("a) N data: ");
        ex1a( n );
        System.out.print("a) 4N data: ");
        ex1a( 4*n );

        System.out.print("b) N data: ");
        ex1b(n);
        System.out.print("b) 4N data: ");
        ex1b(4*n);

        System.out.print("c) N data: ");
        ex1c(n);
        System.out.print("c) 4N data: ");
        ex1c(4*n);

        System.out.print("d) N data: ");
        ex1d(n);
        System.out.print("d) 4N data: ");
        ex1d(4*n);

        System.out.print("e) N data: ");
        ex1e(n);
        System.out.print("e) 4N data: ");
        ex1e(4*n);

        System.out.print("f) N data: ");
        ex1f(n);
        System.out.print("f) 4N data: ");
        ex1f(4*n);

        System.out.print("g) N data: ");
        ex1g(n);
        System.out.print("g) 4N data: ");
        ex1g(4*n);

        System.out.print("h) N data: ");
        ex1h(n);
        System.out.print("h) 4N data: ");
        ex1h(4*n);

        System.out.print("i) N data: ");
        ex1i(n);
        System.out.print("i) 4N data: ");
        ex1i(4*n);

        System.out.print("j) N data: ");
        ex1j(n);
        System.out.print("j) 4N data: ");
        ex1j(4*n);
    }
}
