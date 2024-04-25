class StaticDemo {
static int a = 42;
static int b = 99;
static void callme() {
System.out.println("a = " + a);
}
}
class StaticByName {
public static void main(String args[]) {
//StaticByName s=new StaticByName();
//StaticDemo z=new StaticDemo();
StaticDemo.callme();
//System.out.println("b = " + z.b);
System.out.println("b = " + StaticDemo.b);
}
}
