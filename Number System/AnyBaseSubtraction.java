import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        int b = sc.nextInt();
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();

        int sub = doSubtraction(b, n1, n2);

        System.out.print("Subtraction of "+n1+" and "+n2+" is "+sub);

         
    }

    public static int doSubtraction(int b, int n1, int n2)
    {
        int rv = 0;

        int c = 0;
        int p = 1;

        while (n1 > 0 || n2 > 0 || c > 0) {
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int d = 0;
            rem2 += c;

            if (rem2 >= rem1) {
                c= 0;
                d = rem2 - rem1;
            } else {
                c = -1;
                d = rem2 + b - rem1;
            }

            rv += d * p;
            p *= 10;
        }

        return rv;
    }
}
