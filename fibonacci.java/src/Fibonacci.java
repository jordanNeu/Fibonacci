public class Fibonacci {
    //Our Iterative Method
    static void iterate (long n) {
        // Variable Declaration
        long a = 0;
        long b = 1;
        long i = 0;

    while (i <= n) {
            // While loop that adds the current number to the last until the counter has reached 'n'
            System.out.println(a + " ");
            long c = b + a;
            a = b;
            b = c;
            i = i + 1;
        }
    }
    //Recursion Method
    static long recursion(long n) {
        if (n <= 1) {
            return n;
        }
        else {
            return recursion(n - 1) + recursion(n - 2);
        }
    }
    public static void main(String[] args)  {
        // ITERATION
        // Array of increments for our Runtime
        long iterations[] = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        for (long i : iterations) {
            // Records time in nanoseconds
            long startTime = System.nanoTime();
            System.out.println("\n" + "Iteration: " );
            // Calls iterate method
            iterate(i);
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println("Time in nanoseconds: " + totalTime);
        }
        //RECURSION
        // Array of increments for our Runtime
        long recursions[] = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        for (long n : recursions) {
            // Records time in nanoseconds
            long startTime1 = System.nanoTime();
            System.out.println("\n" + "Recursion: " );
            // Calls recursion method
            System.out.println(recursion(n));
            long endTime1 = System.nanoTime();
            long totalTime1 = endTime1 - startTime1;
            System.out.println("Time in nanoseconds: " + totalTime1);
        }
    }
}

