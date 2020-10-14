import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	// int n = 10;

        long start = System.nanoTime();
        System.out.println(n + "! = " + calcFucRec(n));
        System.out.println("RecFucTime: " + (System.nanoTime() - start)); 

        start = System.nanoTime();
        System.out.println(n + "! = " + calcFuc(n));
        System.out.println("WhileFucTime: " + (System.nanoTime() - start));

        start = System.nanoTime();
        System.out.println(n + "! = " + calcFucWithBigInt(n));
        System.out.println("BigIntFucTime: " + (System.nanoTime() - start));      
    }
    
    public static int calcFucRec (int n) {
    	if (n < 0) {
    		return -1;
    	}
        if (n == 0) {
            return 1;
        }
        return n * calcFucRec(n-1);
    }
    public static int calcFuc (int n) {
    	if (n < 0) {
    		return -1;
    	}
    	int fuc = 1;
    	while (n > 0) {
    		fuc *= n;
    		n--;
    	}
    	return fuc;
    }

    public static BigInteger calcFucWithBigInt(int value) {
	    if (value == 0) {
	        return BigInteger.valueOf(1);
	    } else {
	        return calcFucWithBigInt(value - 1).multiply(BigInteger.valueOf(value));
	    }
	}
}