public class Main {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("EmptyInput");
		} else if (Doubles.valueOf(args[0])  <= 0.0f) {
				System.out.println("NegativeRadius");
		} else {
			double R = Double.valueOf(args[0]);
			double L = 2 * Math.PI * R;
			double S = Math.PI * Math.pow(R, 2) / 2;
			System.out.println("length: " + L + ";\nSquare: " + S);
		}
	}
}