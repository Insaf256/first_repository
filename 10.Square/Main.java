public class Main {
    public static void main (String[] args) {
        if (args.length < 1) {
            System.out.println("EmptyInput");
        } else if (Integer.valueOf(args[0])  <= 0) {
                System.out.println("N must be >= 1!");
        } else {
            int n = Integer.parseInt(args[0]);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}