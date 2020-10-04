import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Enter number of lines");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt() - 1;
		for (int i = 0; i <= n; i++) {
			System.out.print(i + ")\t");
			int t = 1;
			for (int j = i; j <= (n*2-1)/2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(t + " ");
				t *= (i-j);
				t /= (j+1); 
			}
			System.out.println();
		}
	}
}
