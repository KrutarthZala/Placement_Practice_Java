import java.util.Scanner;

public class BulbProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter total number of bulbs : ");
        int bulb = sc.nextInt();

        System.out.print("Bulbs are on when we reach last bulb : ");
        for (int i = 1; i * i <= bulb; i++) {
            System.out.print(i*i + " ");
        }
    }
}
