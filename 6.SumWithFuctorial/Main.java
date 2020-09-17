public class Main {
	public static void main (String[] args) {
		if (args.length < 1) {
			System.out.println("EmptyInput");
		} else if (Integer.valueOf(args[0])  <= 0) {
				System.out.println("N must be >= 1");
		} else {
			int n = Integer.valueOf(args[0]);
			double sum = 0;
			for(int m = 1; m <= n; m++) {
				sum += Double.valueOf(Math.pow(fuc(m-1), 2)) / Double.valueOf(fuc(2*m));
			}
			System.out.println(sum);
		}
	}
	public static int fuc (int x) {
		if (x == 0) {
			return 1;
		} else {
			return x * fuc(x - 1);
		}
	}
}