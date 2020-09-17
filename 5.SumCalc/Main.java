public class Main {
	public static void main (String[] args) {
		if (args.length < 2) {
			System.out.println("ErrorInput");
		} else if (Integer.valueOf(args[0])  <= 0) {
				System.out.println("N must be >= 1");
		} else {
			int n = Integer.valueOf(args[0]);
			double x = Double.valueOf(args[1]);
			double sum = 0;
			for (int i = n; i > 0; i--) {
				sum = x / (i + 1 + sum);
			}
			sum += 1;
			System.out.println("Sum = " + sum);
		}
	}
}