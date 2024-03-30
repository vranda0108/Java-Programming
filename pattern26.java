import java.util.Scanner;
class pattern25
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,b,d;
        System.out.println("enter no of rows:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(d=1;d<=n-i;d++)
            System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
            System.out.print("*");
            System.out.println();
        }
        n=n-1;
        for(i=1;i<=n;i++)
        {
            for(b=1;b<=i;b++)
            System.out.print(" ");
            for(j=1;j<=2*(n-i)+1;j++)
            System.out.print("*");
            System.out.println();
        }
    }
}

