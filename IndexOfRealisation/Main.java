public class Main {
	public static void main(String[] args) {
		String str = args[0];
		String substr = args[1];
		//String str = "asdfghjkl";
		//String substr = "dfh";

		int k = 0;
		int h = -1;
		for (int i = 0; i < str.length(); i++) { //opt:"i<str.length()-substr.length()+k"
			if (substr.charAt(k) == str.charAt(i)) {
				k += 1;
			} else {
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