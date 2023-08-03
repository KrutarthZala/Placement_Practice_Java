import java.util.Scanner;

public class ReverseString 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        //* Method 1 : Using StringBuilder Class */
        
        System.out.println("---- Method 1 ----");
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed String : "+ sb);
        
        //* Method 2 : Using Character Array. */
        
        System.out.println("---- Method 2 ----");
        System.out.print("Enter the string : ");
        String str1 = sc.nextLine();
        String rstr = "";
        char ch;
        
        for (int i = str1.length() - 1; i >= 0 ; i--) 
        {
            ch = str1.charAt(i);
            rstr += ch;    
        }
        System.out.print("Reversed String : "+ rstr);


    }
}