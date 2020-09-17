public class Main {
	public static void main (String[] args) {
		if (args.length < 1) {
            System.out.println("EmptyInput");
        } else if (Integer.valueOf(args[0])  <= 0) {
                System.out.println("N must be >= 1!");
        } else {
			int n = Integer.valueOf(args[0]);
			double Pi = 2;
			for(int i = 1; i <=n; i++) {
				Pi *= Math.pow(2*i, 2);
				Pi /= (2*i-1)*(2*i+1);
			}
			System.out.println("PI = " + Pi);
		}
	}
}