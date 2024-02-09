class F{
	static int x=786;
	{
		System.out.println("Inside F's init block");
		int x=7;
		System.out.println(x);
	}
	static public void main(String args[]){
		F f=new F();
		//F f1=new F();
		//f=new F();
		System.out.println("Inside main="+x);
		f.displayX();
	}
	public void displayX(){
		System.out.println(x);
	}
}
