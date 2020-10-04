public class Main {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Pl, enter adequate values a and b");
			System.exit(0);
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int[] arra = new int[b];
		int[] arrb = new int[a];

		for (int i = 0; i < arra.length; i++) {
			arra[i] = a*(i+1);
		}
		for (int i = 0; i < arrb.length; i++) {
			arrb[i] = b*(i+1);
		}
		for (int i = 0; i < arra.length; i++) {
			for (int j = 0; j < arrb.length; j++) {
				if (arra[i] == arrb[j]) {
					System.out.println(arra[i]);
					System.exit(0);
				}
			}
		}
		//String str = "asdfghjkl";
		//String substr = "SdF";

	}
}
