/*java.lang.ArithmeticException: / by zero
rest of the code...

class A{
	public static void main(String args[]){
		try{
			int data=100/0;
		}
		catch(ArithmeticException e){
       			System.out.println(e);
       		}
       		System.out.println("rest of the code...");
       	}  
}*/  


/*2.Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
	at A.main(A.java:17)

class A{
	public static void main(String args[]){
		try{
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e){
       			System.out.println(e);
       		}
       		System.out.println("rest of the code...");
       	}  
}*/

/*Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at A.main(A.java:37)

class A{
	public static void main(String args[]){
		try{
			String s="abc";
			int i=Integer.parseInt(s);
		}
		catch(ArithmeticException e){
       			System.out.println(e);
       		}
       		System.out.println("rest of the code...");
       	}  
}*/

/*class A{
	public static void main(String args[]){
		try{
			/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for
			length 5
			at A.main(A.java:56)
			int a[]=new int[5];
			a[10]=50;*/
			/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for
			length 3
			at A.main(A.java:60)
			int a[]={1,2,3};
			System.out.println(a[4]);*/
		/*}
		catch(ArithmeticException e){
       			System.out.println(e);
       		}
       		System.out.println("rest of the code...");
       	}  
}*/
