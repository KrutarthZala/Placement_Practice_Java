import java.util.Scanner;

public class Pattern8ReverseDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            
            for (int j = 1; j <= row; j++) {
                if (i + j == row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
