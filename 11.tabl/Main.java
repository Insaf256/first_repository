public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("EmptyInput");
        } else if (Integer.valueOf(args[0])  <= 0) {
                System.out.println("N must be >= 1!");
        } else {
            int n = Integer.parseInt(args[0]);
            for (int i = 1; i <= n; i++) {
                System.out.print("\t" + i);
            }
            System.out.println(); System.out.println();
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                for (int j = 1; j <= n; j++) {
                    System.out.print("\t" + i * j);
                }
                System.out.println(); System.out.println();
            }
        }
    }
}