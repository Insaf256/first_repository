import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Enter number of lines");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt() - 1;

		int l = 1;
		for (int i = 1; i <= n - n/2; i++) {
			l = l * (n/2 + i) / i;
		}
		l = (int)(Math.log(l) / Math.log(10)); 
		l += 2 + l%2;
		System.out.println(l);
		for (int i = 0; i <= n; i++) {
			System.out.print(i + ")\t");
			int t = 1;
			for (int j = i; j <= (n*2-1)/2; j++) {
				for (int k = 0; k < l/2; k++) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("%" + l + "d", t);
				t = t * (i-j) / (j+1);
			}
			System.out.println();
		}
	}
}
