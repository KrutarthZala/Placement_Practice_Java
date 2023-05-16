import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        int[] span = solve(arr);
        System.out.print("Array after stock span : ");
        for (int i : span) {
            System.out.print(i+" ");
        }
    }

    public static int[] solve(int[] arr)
    {
        int[] span = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        st.push(0);
        span[0]=1;

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }

            st.push(i);
        }

        return span;
    }
}
