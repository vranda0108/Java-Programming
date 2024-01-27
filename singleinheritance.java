import java.util.Scanner;
class singleinheritance
{
    int a,b;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num:");
        a=sc.nextInt();
        System.out.println("enter second num:");
        b=sc.nextInt();
    }
    void putdata()
    {
        System.out.println("sum="+(a+b));
    }
}
class in extends singleinheritance
{
    int c;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter third num:");
        c=sc.nextInt();
    }
    void output()
    {
        System.out.println("add="+(a+b+c));
    }
}
class demo
{
public static void main(String[] args)
{
    in aa=new in();
    aa.getdata();
    aa.putdata();
    aa.input();
    aa.output();
}
}

