import java.util.*;
import java.util.regex.*;

public class ValidateHTMLTag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the HTML tag : ");
        String HTMLstr = sc.nextLine();

        System.out.print(isValidHTMLTag(HTMLstr));

    }

    public static boolean isValidHTMLTag(String str)
    {
        String regex = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";

        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }

        Matcher m = p.matcher(str);

        return m.matches();
    }
}
