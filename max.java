import java.util.Scanner;
class max
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num:");
        a=sc.nextInt();
        System.out.println("enter second num:");
        b=sc.nextInt();
        System.out.println("enter third num:");
        c=sc.nextInt();
        if(a>b&&a>c)
        System.out.println("max num is a:"+a);
        else if(b>a&&b>c)
        System.out.println("max num is b:"+b);
        else
        System.out.println("max num is c:"+c);
    }
}