import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int nod = 0 ;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            nod++;
        }

        int div = (int) Math.pow(10, nod - 1);

        while (div != 0) {
            int q = num / div;
            System.out.println(q);

            num %= div;
            div /= 10;
        }
    }
}
