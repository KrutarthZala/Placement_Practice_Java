import java.util.Scanner;

public class Pattern18HourGlass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc. nextInt();
        int sp = 0;
        int st = row;

        for (int i = 1; i <= row; i++) {
            
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= st; j++) {
                if (i > 1 && i <= row / 2 && j > 1 && j < st) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");       
                }
            }

            if (i <= row / 2) {
                sp++;
                st -= 2;
            } else {
                sp--;
                st += 2;
            }

            System.out.println();
        }
    }
}
