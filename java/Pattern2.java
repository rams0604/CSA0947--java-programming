import java.util.Scanner;
public class Pattern {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        int n=5;        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
