public class Main {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("EmptyInput");
		} else if (Float.valueOf(args[0])  <= 0.0f) {
				System.out.println("NegativeRadius");
		} else {
			final float Pi = 3.14f;
			float R = Float.valueOf(args[0]);
			Float L = 2f * Pi * R;
			Float S = Pi * R * R / 2;
			System.out.println("length: " + L + ";\nSquare: " + S);
		}
	}
}