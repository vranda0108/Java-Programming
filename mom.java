class mom{
	int balance=0;
	static String surname;
	static boolean status;
	public static void main(String args[]){
		mom son=new mom();
		/*
		error: reference to fun is ambiguous
		son.fun(10,10);
		son.fun(10,10);
		*/
		/*error: '.class' expected
		son.fun(long 10,10);*/
		son.fun(10,10l);
		son.fun(10l,10);
	}
	public void fun(int a,long b){
		System.out.println("inside fun(int,long)");
		System.out.println(a+b);
	}
	public void fun(long b,int a){
		System.out.println("inside fun(long,int)");
		System.out.println(a+b);
	}
}
