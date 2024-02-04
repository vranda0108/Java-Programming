/* is we execute javac A.java and then java A then the following error will occur:-
   Error: Main method not found in class A, please define the main method as:
   public static void main(String[] args)
   or a JavaFX application class must extend javafx.application.Application*/
class A{
	//executed 2'nd
	static{
		System.out.println("A's static block");
	}
}		
class Sggs{
	//executed 3'rd after all static block's are executed 
	Sggs(float x){
		System.out.println("Sggs constructor");
	}
	//executed 1'st becoz we r executing Sggs class 
	static{
		System.out.println("Sggs's static block");
	}
	public static void main(String args[]){
	A sggs=new A();
	Sggs sggs1=new Sggs(0.3f);
	}
}
