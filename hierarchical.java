import java.util.Scanner;
class hierarchical
{
    int a,b;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a=");
        a=sc.nextInt();
        System.out.println("enter b=");
        b=sc.nextInt();
}
}
class hierarchical1 extends hierarchical
{
    void output()
    {
        System.out.println("Add="+(a+b));
    }
}
class hierarchical2 extends hierarchical
{
    void display()
    {
        System.out.println("Subtract="+(a-b));
    }
}
class demo{
public static void main(String args[])
{
    hierarchical1 H=new hierarchical1();
    H.getdata();
    H.output();
    hierarchical2 h=new hierarchical2();
    h.getdata();
    h.display();
}
}