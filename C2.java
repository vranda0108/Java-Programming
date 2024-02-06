class Sggs{
	int x=786;
	static int y=11;
	/*
	ERROR :- Exception in thread "main" java.lang.StackOverflowError
	at Sggs.<init>(C.java:3);
	*/
	//Sggs sggs=new Sggs();	
	
	{
		System.out.println("Sggs init block");
	}
	Sggs(){
		System.out.println("Sggs constructor block");
	}
	
	Sggs sggs=new Sggs();
	
	//above stack overflow error can be solved by adding static keyword before the above line......
	//by entering down line we can solve
	//static Sggs sggs=new Sggs();
	
	static{
		System.out.println("Sggs static block");
	}
	
	static public void main(String args[]){
		Sggs sggs1=new Sggs();
		//print out value of x only by using object sggs1......output:-786;
		System.out.println(sggs1.x);
		//all prints 11
		System.out.println(y);
		System.out.println(Sggs.y);
		System.out.println(sggs1.y);
	}	
}
