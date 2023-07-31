import java.util.Scanner;

public class PrintSeriesRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        printSeries(num);


    }

    public static int printSeries(int num)
    {
        if (num == 0) {
            //System.exit(1);
            return 0;
        } else {
            System.out.print(num+" ");
            return printSeries(num - 1);
        }
    }
}
