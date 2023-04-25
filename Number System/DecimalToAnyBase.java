import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter decimal number : ");
        int decimal = sc.nextInt();
        System.out.print("Enter base : ");
        int base = sc.nextInt();

        int dtob = decimalToAnyBaseConversion(decimal,base);

        System.out.print(decimal+" of base "+base+" is "+dtob);
        
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
