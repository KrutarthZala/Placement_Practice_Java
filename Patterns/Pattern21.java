import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number : ");
        int r1 = sc.nextInt();

        DrawPattern1(r1);

        System.out.println("-------------");

        System.out.print("Enter row number : ");
        int r2 = sc.nextInt();

        DrawPattern2(r2);

    }

    static void DrawPattern1(int r)
    {
        int sp = 0;
        int st = r;
        int num = r * (r + 1) / 2;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < st; j++) {
                System.out.printf(" %d",num);
                num--;
            }
            System.out.println();
            sp++;
            st--;
        }
    }

    static void DrawPattern2(int r)
    {
        int num = r * (r + 1) / 2;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.printf("%d ",num);
                    num--;
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
