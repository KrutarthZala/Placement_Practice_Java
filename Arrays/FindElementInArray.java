import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element you want to search : ");
        int s = sc.nextInt();
        int idx = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                idx = i;
                break;
            }
        }

        System.out.print("Element at index "+idx);

    }
}
