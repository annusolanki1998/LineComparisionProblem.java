import  java.util.Scanner;
public class LinesCompareUC3 {
    public static void main(String[] args) {
        System.out.println("Calculate length between two points");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y2: ");
        int y2 = sc.nextInt();
        double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println(length);

        System.out.println("Calculate length between another two points");
        System.out.println("Enter x3: ");
        int x3 = sc.nextInt();
        System.out.println("Enter z3: ");
        int z3 = sc.nextInt();
        System.out.println("Enter x4: ");
        int x4 = sc.nextInt();
        System.out.println("Enter z4: ");
        int z4 = sc.nextInt();
        double length1 = Math.sqrt(Math.pow(x4-x3,2)+Math.pow(z4-z3,2));
        System.out.println(length1);
        if (length == length1)
        {
            System.out.println("Both lines are equal");
        }
        else if (length >= length1)
        {
            System.out.println("Line one is greater than the another line");
        }
        else
        {
            System.out.println("Line one is less than the another line");
        }

    }
}



