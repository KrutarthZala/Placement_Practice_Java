import java.util.Scanner;

class FibonacciSumRecursion
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println(fibonacci(num));
    }
    public static int fibonacci(int num)
    {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
