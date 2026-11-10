public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int numOdd = 0;
        long prev = 1;
        long curr = 1;
        for (int i = 0; i < x; i++) {
            System.out.print(prev);
            if (prev % 2 != 0) {
                numOdd++;
            }
            if (i < x - 1)
                System.out.print(" ");
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}