import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextint();

		int i = Math.min(n, m);

		while (i-- > 0) {
			if (n % i == 0 && m % i == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
