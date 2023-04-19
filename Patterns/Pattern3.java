import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        int space = row - 1;
        int star = 1;

        for (int i = 1; i <= row; i++) {
            
            for (int j = 1; j <= space; j++) {
                System.out.print("  "); //*Here two spaces equals to one space otherwise it will print Pyramid. */
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            
            space--;
            star++;
            System.out.println();
        }

    }
}
