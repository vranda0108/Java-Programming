import java.util.Scanner;
class Add
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
        System.out.println("Add="+(a+b));
    }
    public static void main(String args[])
    {
        Add aa=new Add();
        aa.getdata();
        aa.putdata();
    }
}