import java.util.Scanner;
class prime
{
    int n;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num to check=");
        n=sc.nextInt();
    }
    void putdata()
    {
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            count=count+1;
        }
        if(count==2)
        System.out.println("num is prime");
        else
        System.out.println("num is not prime");
    }
    public static void main(String args[])
    {
        prime p=new prime();
        p.getdata();
        p.putdata();
    }
}
