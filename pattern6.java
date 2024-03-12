import java.util.Scanner;
class pattern6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,j;
        System.out.println("enter no of rows:");
        n=sc.nextInt();
        for(n=n;n>=1;n--)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}