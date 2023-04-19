import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        int sp = row / 2;
        int st = 1;

        for (int i = 1; i <= row; i++) {
            
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }

            if (i <= row / 2) {
                sp--;
                st += 2;
            }
            else
            {
                sp++;
                st -= 2;
            }

            System.out.println();
        }
    }
}
