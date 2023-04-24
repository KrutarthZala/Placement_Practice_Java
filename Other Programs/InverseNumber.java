import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Digit : ");
        int digit = sc.nextInt();

        int inv = 0; //*Inverse of number*/
        int op = 1; //*Original Position */

        while (digit != 0) {
            int od = digit % 10; //*Original Digit */
            int id = op; //*Original Position */
            int ip = od; //*Inverse Position */

            //* Make change in inv using ip and id
            inv = inv + id * (int) Math.pow(10, ip-1);

            digit /= 10;
            op++;
        }

        System.out.print("Inverse digit : "+ inv);


    }
}
