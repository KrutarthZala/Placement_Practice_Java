import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        int b = sc.nextInt();
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();

        int add = doAddition(b, n1, n2);

        System.out.print("Addition of "+ n1 + " and "+ n2 +" is "+add);

    }

    public static int doAddition(int b,int n1, int n2)
    {
        int rv = 0;

        int c = 0;
        int p = 1;

        while (n1 > 0 || n2 > 0 || c > 0) {
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int sum = rem1 + rem2 + c; //* Do not forget to add carry. */
            c = sum / b; //* Quotient become carry. */
            sum = sum % b; //* Reminder become sum of individual digit. */

            rv += sum * p;
            p *= 10;
        }

        return rv;
    }
}
