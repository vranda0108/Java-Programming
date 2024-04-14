class StaticDemo {
static int a = 42;
static int b = 99;
static void callme() {
System.out.println("a = " + a);
}
}
class StaticByName {
public static void main(String args[]) {
StaticDemo.callme();
StaticDemo sd=new StaticDemo();
System.out.println("b = " + StaticDemo.b);
System.out.println("b = " + sd.b);
}
}
