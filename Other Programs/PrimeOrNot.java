import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        isPrime(num);
        isPrimeSecondMethod(num);

    }

    public static void isPrime(int num)
    {
        boolean bl = false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                bl = true;
                break;
            }
        }

        if (bl) {
            System.out.print("Number is not Prime.");
        } else {
            System.out.print("Number is Prime.");
        }
    }

    public static void isPrimeSecondMethod(int num)
    {
        int count = 0;

        for (int i = 1; i <= num; i++) 
        {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.print("Number is Prime.");
        } else {
            System.out.print("Number is not Prime.");       
        }
    }
}
