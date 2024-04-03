class Example{
	/*public static void sleep(int b) throws InterruptedException{
		System.out.println("InterruptedException");
	}*/
	public static void main(String...args){
		/*Example E=new Example();
		E.sleep(3000);*/
		try{
			Thread.sleep(1000);
			System.out.println(args[0]);
			System.out.println("Inside try block");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException!");
		}
		catch(InterruptedException e){
			System.out.println("InterruptedException!");
		}
		catch(Exception e){
			System.out.println("Exception!");
		}
		finally{
			System.out.println("Finally block");
		}
	}
}
