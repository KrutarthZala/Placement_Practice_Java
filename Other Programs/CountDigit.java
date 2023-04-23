import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int dig = 0 ;
        while (num != 0) {
            num /= 10;
            dig++;
        }

        System.out.print("Digits are "+dig);
    }
}
