import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first array size : ");
        int size1 = sc.nextInt();

        int [] arr1 = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element : ");
            arr1[i] = sc.nextInt();
        }


        System.out.print("Enter second array size : ");
        int size2 = sc.nextInt();

        int [] arr2 = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element : ");
            arr2[i] = sc.nextInt();
        }

        int[] sum = new int[size1 > size2 ? size1 : size2];
        int c = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += arr1[i];
            }

            if (j >= 0) {
                d += arr2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (c != 0) {
            System.out.print(c);
        }

        for (int val : sum) {
            System.out.print(val);
        }


    }
}
