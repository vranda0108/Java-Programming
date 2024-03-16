import java.util.Scanner;
class pattern15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,b;
        System.out.println("enter no of rows:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(b=1;b<i;b++)
            System.out.print(" ");
            for(j=1;j<=n+1-i;j++)
            System.out.print(j);
            System.out.println();
        }
    }
}

