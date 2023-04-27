import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int base = sc.nextInt();

        int ans = 0;
        int i = 0;
        while (num != 0 ) {
            int temp = num % 10;
            num /= 10;

            ans += temp*Math.pow(base, i);
            i++;

        }
        System.out.println(ans);
    }
}
