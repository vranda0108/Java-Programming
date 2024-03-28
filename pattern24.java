import java.util.Scanner;
class pattern24
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,b,c=5;
        System.out.println("enter no of rows:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(b=1;b<i;b++)
            System.out.print(" ");
            for(j=1;j<=2*(n-i)+1;j++)
            System.out.print(c);
            c=c-1;
            System.out.println();
        }
    }
}

