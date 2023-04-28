import java.util.Scanner;

public class DifferenceOfTwoArray
{
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

        int[] diff = new int[size2];

        int c = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int d = 0;
            int alv = i >= 0 ? arr1[i] : 0;

            if (arr2[j] + c >= alv) {
                d = arr2[j] + c - alv;
                c = 0;
            } else {
                d = arr2[j] + c + 10 - alv;
                c = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx <diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

        while (idx < diff.length) {
            System.out.print(diff[idx]);
            idx++;
        }
    }
}