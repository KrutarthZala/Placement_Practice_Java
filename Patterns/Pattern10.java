import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        int os = row / 2; //*Outer space */
        int is = -1;      //*Inner space */

        for (int i = 1; i <= row; i++) {
            
            for (int j = 1; j <=os; j++) {
                System.out.print(" ");
            }

            System.out.print("*");
            
            for (int j = 1; j <= is; j++) {
                System.out.print(" ");
            }

            if( i > 1 && i < row )
            {
                System.out.print("*");
            }

            if(i <= row /2)
            {
                os--;
                is += 2;
            }
            else{
                os++;
                is -= 2;
            }

            System.out.println();

        }
    }
}
