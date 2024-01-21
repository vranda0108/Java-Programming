import java.util.Scanner;
class reverse1
{
    int n;
    void getdata(int i)
    {
        n=i;
    }
    void putdata()
    {
        int rev=0;
        while(n>0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println("Rev="+rev);
    }
    public static void main(String args[])
    {
        int m;
        reverse1 r=new reverse1();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num=");
        m=sc.nextInt();
        r.getdata(m);
        r.putdata();
    }
}
