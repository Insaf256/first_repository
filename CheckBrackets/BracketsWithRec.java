import java.util.*;

public class BracketsWithRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] brac = { '(', ')', '[', ']', '{', '}' };
        String str = sc.nextLine();

        char[] charStr = new char[str.length()];
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            for (char b : brac) {
                if (t == b) {
	                charStr[k] = t;
	                k++;
	                break;
	            }
            }
        }
        k--;
        System.out.println(Arrays.toString(charStr));
        System.out.println(check(charStr, 0, k));
    }

    public static boolean check(char[] arr, int i, int k) {
    	if ((k + i) % 2 == 0) {
    		return false;
    	}
    	if (i > k) {
    		return true;
    	}
    	if (arr[i] == '(' && arr[k] == ')' || arr[i] == '[' && arr[k] == ']' || arr[i] == '{' && arr[k] == '}') {
    		return check(arr, i+1, k-1);
    	}
    	else {
    		return false;
    	} 
    }
}
