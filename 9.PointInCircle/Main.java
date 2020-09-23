public class Main {
    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Please, enter 5 numbers: coordinats of center, radius and coordinates of point");
        } else if (Integer.valueOf(args[2])  < 0) {
                System.out.println("R must be >= 0");
        } else {
            int dx = Integer.parseInt(args[0]) - Integer.parseInt(args[3]);
            int dy = Integer.parseInt(args[1]) - Integer.parseInt(args[4]);
            int r = Integer.parseInt(args[2]);
            if (dx*dx + dy*dy <= r*r) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}