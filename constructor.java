import java.util.Scanner;
class constructor
{
    int a,b;
    constructor()
    {
        a=0;
        b=0;
    }
    constructor(int x,int y)
    {
        a=x;
        b=y;
    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num");
        a=sc.nextInt();
        System.out.println("enter second num");
        b=sc.nextInt();
    }
    void putdata()
    {
        System.out.println("Add="+(a+b));
    }
    public static void main(String args[])
    {
        constructor c=new constructor(10,15);
        c.getdata();
        c.putdata();
    }
}