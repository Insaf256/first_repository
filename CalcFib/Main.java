import java.util.Scanner;
import java.math.*;

public class Main {
	
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        // int n = 6;

        long start = System.nanoTime();
        printFib(calcFibRec(n));
        System.out.println("RecTime: " + (System.nanoTime() - start));

        start = System.nanoTime();
        printFib(calcFibWithoutRec(n));
        System.out.println("WithoutRecTime: " + (System.nanoTime() - start));

        start = System.nanoTime();
        System.out.println(calcFibWithBigInt(n));
        System.out.println("WithBigIntTime: " + (System.nanoTime() - start));
              
    }

    public static int calcFibRec(int num) {
        if (num < 1) {
            return -1;
        }
        if (num <= 2) {
            return 1;
        }
        else {
            return calcFibRec(num-1) + calcFibRec(num-2);
        }
    }

    public static int calcFibWithoutRec (int num) {
        if (num <= 0) {
            return -1;
        }
        int fn_ = 1;
        int fn = 1;
        for (int i = 3; i <= num; i++) {
            fn += fn_;
            fn_ = fn - fn_;
        }
        return fn;
    }

    public static BigInteger calcFibWithBigInt(int num) {
	    if (num <= 0) {
	        return BigInteger.valueOf(-1);
	    }
	    BigInteger fn_ = new BigInteger("1");
        BigInteger fn = new BigInteger("1");
        for (int i = 3; i <= num; i++) {
            fn = fn.add(fn_);
            fn_ = fn.subtract(fn_);
        }
        return fn;
	}

    public static void printFib(int num) {
        if (num == -1) {
            System.out.println("Bad number.");
        }
        else {
            System.out.println(num);
        }
    }
}