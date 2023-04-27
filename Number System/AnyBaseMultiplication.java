import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter base : ");
        int b = sc.nextInt();
        System.out.print("Enter first number :  ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();

        int mul = doMultiplication(b, n1, n2);

        System.out.print("Multiplication of "+n1+" and "+n2+" is "+mul);


    }

    public static int doMultiplication(int b, int n1, int n2)
    {
        int rv = 0;

        int p =1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 /= 10;

            int sprd = getProductWithASingleDigit(b, n1, d2);
            rv = doAddition(b, rv, sprd * p);
            p *= 10;
        }

        return rv;
    }

    public static int getProductWithASingleDigit(int b, int n1, int d2)
    {
        int rv = 0;

        int c = 0;
        int p = 1;

        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 /= 10;

            int d = d1 * d2 + c;
            c = d / b;
            d = d % b;
            
            rv = rv + d * p;
            p *= 10;
        }

        return rv;
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
