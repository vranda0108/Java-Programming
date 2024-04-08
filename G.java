class G{
	public static void main(String args[]){
       		try{
			int data=100/0;
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
       		finally{
       			System.out.println("finally block is always executed!");     			
       		}
              	System.out.println("rest of the code...");
       		try{
			//int data=100/0;
			String s=null;
			System.out.println(s.length());
		}
		/*catch(NullPointerException e){
			System.out.println("NullPointerException");
		}*/
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
       		finally{
       			System.out.println("finally block is always executed!");     			
       		}
       		System.out.println("rest of the code...");
       	}  
}
