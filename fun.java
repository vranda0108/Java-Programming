class fun{
	public static void main(String args[]){
		fun son=new fun();
		System.out.println(son);
		System.out.println(son.fun1(10,10l));
		son.fun1(10,10l);	
	}
	public long fun1(int a,long b){
		System.out.println("inside fun(int,long)");
		System.out.println(a+b);
		return a+b;
	}
}
