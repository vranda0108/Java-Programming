import java.util.Scanner;
class fxnoverridding
{
    int a;
    void show()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num=");
        a=sc.nextInt();
        System.out.println("a="+a);
    }
}
class fxn extends fxnoverridding
{
    int b;
    void show()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num=");
        b=sc.nextInt();
        System.out.println("b="+b);
    }
}
class demo
{
    public static void main(String args[])
    {
        fxn f=new fxn();
        f.show();
    }
}
