import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        int sp = 2 * row - 3;
        int st = 1;

        for (int i = 1; i <= row; i++) {

            int val = 1;
            for (int j = 1; j <= st; j++) {
                System.out.print(val+" ");
                val++;
            }

            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }

            if (i == row) {
                st--;
                val--;
            }
            for (int j = 1; j <= st; j++) {
                val--;
                System.out.print(val +" ");
            }

            st++;
            sp -= 2;
            System.out.println();
        }
    }
}
