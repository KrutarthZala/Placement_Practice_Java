import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.print("Enter frequency number : ");
        int fnum = sc.nextInt();

        int frequency = getDigitFrequency(num, fnum);

        System.out.print("Frequency of "+fnum+" in "+num + " is "+frequency);

    }

    public static int getDigitFrequency(int n,int d)
    {
        int rv = 0;

        while (n != 0) {
            int rem = n % 10;
            if (rem == d) {
                rv++;
            }
            n /= 10;
        }

        return rv;
    }
}
