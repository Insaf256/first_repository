public class Main {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0])
		for (int i = 0; i < n/2; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		for (int i = n % 2 + 2; i <= n; i += 2) {
			for (int j = 0; j < (n - i)/2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}