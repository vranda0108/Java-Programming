class N{
	public void fun(int a,int...b){
		System.out.println("N");
		System.out.println("length is="+b.length);
	}
	public static void main(String args[]){
		N n=new N();
		n.fun(12,13,14,15,16);
		System.out.println(n);
	}
}
