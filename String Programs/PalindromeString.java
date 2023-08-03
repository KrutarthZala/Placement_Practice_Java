import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String palstr = sc.nextLine();

        palstr = palstr.toLowerCase();
        boolean Ans = isPalindrome(palstr);
        System.out.print(Ans);

    }

    public static boolean isPalindrome(String str)
    {
        String revstr = "";

        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) 
        {
            revstr += str.charAt(i);
        }

        if (str.equals(revstr)) 
        {
            ans = true;
        }

        return ans;
    }
}
