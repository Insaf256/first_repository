public class Main2 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Pl, enter str and substr");
			System.exit(0);
		}
		
		String str = args[0];
		String substr = args[1];
		//String str = "asdfghjkl";
		//String substr = "SdF";

		int k = 0;
		int h = -1;
		for (int i = 0; i < str.length(); i++) { //i<str.length()-substr.length()+k
			int c1 = substr.charAt(k);
			int c2 = str.charAt(i);
			if (c1 == c2 || Math.abs(c1 - c2) == 'a'-'A' ) {
				k += 1;
			}
			else {
				k = 0;
			}
			if (k == substr.length()) {
				h = i - k + 1;
				break;
			}
		}
		System.out.println(h);
	}
}
