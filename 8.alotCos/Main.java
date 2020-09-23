public class Main {
	public static void main (String[] args) {
		if (args.length < 2) {
			System.out.println("EmptyOrShortInput");
		} else if (Integer.valueOf(args[0])  <= 0) {
				System.out.println("N must be >= 1");
		} else {
			int n = Integer.valueOf(args[0]);
			double x = Double.valueOf(args[1]), result = 0;
			for (int i = 0; i < n; i++) {
				result = Math.cos(result + x);
			}
			System.out.println("Answer: " + result);
		}
	}
}