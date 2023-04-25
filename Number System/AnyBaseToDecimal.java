import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter digit of any base : ");
        int digit = sc.nextInt();
        System.out.print("Enter base : ");
        int base = sc.nextInt();

        int atod  = getAnyBaseToDecimal(digit, base);

        System.out.print("Decimal number of "+digit+" is "+atod);

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
}
