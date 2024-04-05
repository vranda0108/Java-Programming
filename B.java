class B{
	public static void main(String args[]){
		try{
			int i[]=new int[5];
			i[5]=100/0;
		}
		catch(ArithmeticException e){
       			System.out.println("Arithematic Exception");
       		}
       		catch(ArrayIndexOutOfBoundsException e){
       			System.out.println("ArrayIndexOutOfBounds Exception");
       		}
       		catch(Exception e){
       			System.out.println("Exception");
       		}
       		System.out.println("rest of the code...");
       	}  
}
