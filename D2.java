class D{
	static{
		//executed 1'st
		System.out.println("Inside D at start");
	}
	static int x=786;
	static public void main(String args[]){
		D d=new D();
		//executed 3'rd
		System.out.println("Inside main");
		//prints 786
		System.out.println(x);
	}
	static{
		//executed 2'nd
		System.out.println("Inside D at end");
		/*ERROR :- cannot find symbol y
		y=12;*/
	}
}
