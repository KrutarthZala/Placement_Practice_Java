import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  row : ");
        int row = sc.nextInt();

        int sp = row / 2;
        int st = 1;

        for (int i = 1; i <= row; i++) {
            
            for (int j = 1; j <= sp; j++) {
                if (i == row / 2 + 1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            if (i <= row / 2 ) {
                st++;
            } else {
                st--;
            }
            System.out.println();
        }
    }
}
