import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression : ");
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if(ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    System.out.print(val);
                    return;
                }
            } else if(ch == '}') {
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    System.out.print(val);
                    return;
                }
            } else if(ch == ']') {
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    System.out.print(val);
                    return;
                }
            } else {
                // System.out.print("Enter valid expression !!");
                // return;
            }
        }

        if (st.size() == 0) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }

    }

    public static boolean handleClosing(Stack<Character> st, char corresoch)
    {
        if (st.size() == 0) {
            return false;
        } else if(st.peek() != corresoch) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
