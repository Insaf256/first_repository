public class Main2 {
	public static void main (String[] args) {
		if (args.length < 1) {
			System.out.println("EmptyInput");
		} else if (Double.valueOf(args[0])  <= 0.0) {
				System.out.println("NegativeTime");
		} else {
			final double g = 9.81;
			final double u = 340;
			double t = Double.valueOf(args[0]);
			System.out.println("Depth: " + Math.pow(Math.sqrt(u*u + 2*g*u*t)-u, 2) / (2*g));
		}
	}
}