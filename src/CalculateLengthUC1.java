import java.util.Scanner;
public class CalculateLengthUC1 {
    public static void main(String[] args) {
        System.out.println("Calculate length between two points");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter y2: ");
        int y2 = sc.nextInt();
        double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println(length);
    }
}
