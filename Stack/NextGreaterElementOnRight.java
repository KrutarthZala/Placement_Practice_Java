import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementOnRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        int[] nge = solve(arr);
        System.out.print("Array after next greater element on right : ");
        for (int i : nge) {
            System.out.print(i+" ");
        }
    }

    public static int[] solve(int[] arr)
    {
        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            // pop a(element) push

            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return nge;
    }
}
