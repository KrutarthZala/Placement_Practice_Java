import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.print("Enter base 1 : ");
        int b1 = sc.nextInt();
        System.out.print("Enter base 2 : ");
        int b2 = sc.nextInt();

        int atoa = getAnyBaseToAnyBase(num, b1, b2);

        System.out.print(num + " of base " + b2 + " is " + atoa);

    }

    public static int getAnyBaseToAnyBase(int n,int b1,int b2)
    {
        int b1todec = getAnyBaseToDecimal(n, b1);
        int dectob2 = decimalToAnyBaseConversion(b1todec, b2);

        return dectob2;
    }

    public static int getAnyBaseToDecimal(int d, int b)
    {
        int rv = 0;

        int p = 1;
        while (d != 0) {
            int rem = d % 10;
            d /= 10;

            rv += rem * p;
            p *= b;
        }

        return rv;
    }

    public static int decimalToAnyBaseConversion(int d, int b)
    {
       int rv = 0;
        
       int p = 1; //*This p is use for calculate power of 10 and print digits in reverse order. */
       while (d != 0) {
        int dig = d % b;
        d /= b;

        rv += dig * p;
        p *= 10;

       }

       return rv;
    }
}
