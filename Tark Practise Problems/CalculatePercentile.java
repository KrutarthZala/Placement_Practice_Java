import java.util.Scanner;

public class CalculatePercentile
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float count=0;

        System.out.print("Enter total students : ");
        int total = sc.nextInt();

        int stuMarks [] = new int[total];

        for (int i = 0; i < stuMarks.length; i++) {
            System.out.print("Enter student mark : ");
            stuMarks[i] = sc.nextInt();
        }

        System.out.print("Enter your mark : ");
        int myMark = sc.nextInt();

        for (int i = 0; i < stuMarks.length; i++) {
            if (stuMarks[i] < myMark) {
                count++;
            }
        }
        //* System.out.println(count);
        
        float percentile = (count / (float)total) * 100;
        System.out.printf("Your percentile is %.2f ",percentile);
    }
}