import java.util.Scanner;
class pattern3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("enter no of rows:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+i);
            }
            System.out.println();
        }
    }
}