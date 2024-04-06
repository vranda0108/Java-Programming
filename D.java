class D{
	public static void main(String args[]){
		try{
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e){
       			System.out.println("Arithematic Exception");
       		}
       		catch(ArrayIndexOutOfBoundsException e){
       			System.out.println("ArrayIndexOutOfBounds Exception");
       		}
       		catch(Exception e){
       			System.out.println("Parent Exception");
       		}
       		System.out.println("rest of the code...");
       	}  
}
