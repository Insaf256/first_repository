public class Main {
	public static void main (String[] args) {
		if (args.length < 1) {
			System.out.println("EmptyInput");
		} else if (Float.valueOf(args[0])  <= 0.0f) {
				System.out.println("NegativeTime");
		} else {
			final float g = 9.81f;
			System.out.println("Depth: " + g * Math.pow(Float.valueOf(args[0]), 2) / 2);
		}
	}
}