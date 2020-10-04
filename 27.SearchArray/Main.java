import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// RANDOM ARRAYS
		int s2 = (int)(Math.random() * 15 + 5);
		int s1 = (int)(Math.random() * (s2 - 1) + 1);
		System.out.println(s1 + " " + s2);

		int[] arr1 = new int[s1];
		int[] arr2 = new int[s2];

		for (int i = 0; i < s1; i++) {
			arr1[i] = (int)(Math.random() * 99);
		}

		int k = (int)(Math.random() * (s2-s1));
		for (int i = 0; i < k; i++) {
			arr2[i] = (int)(Math.random() * 99);
		}
		for (int i = k; i < k + s1; i++) {
			arr2[i] = arr1[i-k];
		}
		for (int i = k + s1; i < s2; i++) {
			arr2[i] = (int)(Math.random() * 99);
		}
		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));

		// START SEARCH ARRAY
		System.out.println();

		k = 0;
		for (int i = 0; i < s2; i++) {
			if (arr1[k] == arr2[i]) {
				k += 1;
			}
			else {
				k = 0;
			}
			if (k == s1) {
				System.out.print("Entry index: ");
				System.out.println(i - k + 1);
				break;
			}
		}
	}
}
