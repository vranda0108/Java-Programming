class C{
	public static void main(String args[]){
		try{
			int data=100/0;
			//Thread.sleep(3000);
		}
		/*catch(ArithmeticException e){
       			System.out.println("Arithematic Exception");
       		}
		try{
			int i[]={1,2,3};
			System.out.println(i[4]);
		}*/
		catch(ArrayIndexOutOfBoundsException e){
       			System.out.println("ArrayIndexOutOfBounds Exception");
       		}
       		System.out.println("rest of the code...");
       	}  
}
