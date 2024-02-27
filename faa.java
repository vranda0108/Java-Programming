class faa{
	public static void main(String args[]){
		faa daughter=new faa();
		System.out.println(daughter.fun(5,"vru",81));
		System.out.println(daughter.fun(daughter));
	}
	/*error: varargs parameter must be the last parameter
	public int fun(int...b,int a,int c){*/
	public int fun(int a,String s,int...b){
		//String s="vru";
		/*it is printing address of b
		System.out.println(b);*/
		System.out.println(a);
		System.out.println("length is:"+b.length);
		return 0;
	}
	public faa fun(faa b){
		System.out.println(b);
		b.balance=786;
		System.out.println(b);
		return b;
	}
}
