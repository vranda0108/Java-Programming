import java.util.Scanner;
class multilevel
{
    int a;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a=");
        a=sc.nextInt();
    }
    void putdata()
    {
        System.out.println("Add="+a);
    }
}
class multilevel1 extends multilevel
{
    int b;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter b=");
        b=sc.nextInt();
    }
    void output()
    {
        System.out.println("Add="+(a+b));
    }
}
class multilevel2 extends multilevel1
{
    int c;
    void show()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter c=");
        c=sc.nextInt();
    }
    void display()
    {
        System.out.println("Add="+(a+b+c));
    }
}
class demo
{
public static void main(String args[])
{
    multilevel2 ml=new multilevel2();
    ml.getdata();
    ml.putdata();
    ml.input();
    ml.output();
    ml.show();
    ml.display();
}
}