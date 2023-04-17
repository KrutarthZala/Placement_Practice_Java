import java.util.Scanner;

public class PythagorasTriplets
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pythagoras Triplet : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;

        if(b >= max)
        {
            max = b;
        }
        if (c >= max) {
            max = c;
        }

        if (max == a) {
            boolean flag = ((b * b + c * c) == (a * a));
            System.out.print(flag);

        } else if (max == b) {
            boolean flag = ((a * a + c * c) == (b * b));
            System.out.print(flag);
        } else {
            boolean flag = ((b * b + a * a) == (c * c));
            System.out.print(flag);
        }
    }
}