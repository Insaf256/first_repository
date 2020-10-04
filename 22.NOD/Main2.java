import java.util.*;
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		while (n != m) {
			if (n > m) {
				n -= m;
			}
			else {
				m -= n;
			}
		}
		System.out.println(n);
	}
}
