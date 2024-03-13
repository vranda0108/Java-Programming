import java.util.Scanner;
class pattern8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,j,k=1;
        System.out.println("enter no of rows:");
        n=sc.nextInt();
        for(n=n;n>=1;n--)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j+k);
            }
            k=k+1;
            System.out.println();
        }
    }
}