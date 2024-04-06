class E{
public static void main(String args[]){
	try{
		try{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException");
		}
		try{
			int i[]=new int[5];
			i[5]=10;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		try{
			int data=100/0;
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		int d=20/0;
	}
	catch(Exception e){
		System.out.println("Parent Exception");
	}
	System.out.println("rest code...");	
}
}
