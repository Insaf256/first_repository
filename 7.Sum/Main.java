public class Main {
	public static void main (String[] args) {
		if (args.length < 1) {
			System.out.println("EmptyInput");
		} else if (Integer.valueOf(args[0])  <= 0) {
				System.out.println("NegativeNumber");
		} else {
			int num = Integer.valueOf(args[0]);
			Double sum = 0.0;
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 1) {
					sum += 1.0 / Math.pow(i*2-1, 2);
				} else {
					sum -= 1.0 / Math.pow(i*2-1, 2);
				}
			}
			System.out.println("Sum: " + sum);
		}
	}
}