import java.util.Scanner;
class addtwonum
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num:");
        a=sc.nextInt();
        System.out.println("enter second num:");
        b=sc.nextInt();
        System.out.println("add:"+(a+b));
    }
}
