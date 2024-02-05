/* if we execute javac B.java and then java B then the following error will occur:-
   Error: Main method not found in class B, please define the main method as:
   public static void main(String[] args)
   or a JavaFX application class must extend javafx.application.Application*/
class B{
	static int x=15;
	//executed 2'nd
	static{
		int x=20;
		System.out.println("B's static block");
	}
}
class Sggs{
	static int x=786;
	//executed 3'rd after all static block's are executed 
	Sggs(float x){
		System.out.println("Sggs constructor");
	}
	//executed 1'st becoz we r executing Sggs class 
	static{
		//if "int x=78" is written then in output :- 'x' value will be printed as 786;
		//if "int x=78" is not written then in output :- 'x' value will be printed as 78;
		//if three values of 'x' are written here below then in output :- 'x' value will be printed the last value of 'x' i.e 11;
		//x=78;
		//x=12;
		//x=11;
		System.out.println("Sggs's static block");
	}
	public static void main(String args[]){
	int x=12;
	//B sggs=new B();
	Sggs sggs1=new Sggs(0.3f);
	System.out.println(x);
	System.out.println(sggs1.x);
	System.out.println(Sggs.x);
	B sggs=new B();
	System.out.println(B.x);
	System.out.println(sggs.x);
	}
}
