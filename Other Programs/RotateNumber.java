import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Enter step : ");
        int k = sc.nextInt();

        int temp = n;
        int nod = 0;

        while(temp != 0)
        {
            temp /= 10;
            nod++;
        }

        k = k % nod; //*If k is greater than nod */
        if (k < 0) { //*If number is negative */
            k = k + nod;
        }
        
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }

        int q = n / div;
        int r = n % div;

        int rot = r * mul + q;
        System.out.print("Number after rotation : "+rot);
    }
}
