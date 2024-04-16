class example{
	public static void main(String...args) throws InterruptedException{
	
		try{
			Thread.sleep(1000);
			System.out.println("Try 1");
			System.out.println(args[0]);
		}
		
		/*catch(Exception e){
			System.out.println("Exception caught");
		}*/
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException catched!");
			System.out.println(e);
		}
		
		/*catch(InterruptedException e){
			System.out.println("InterruptedException catched!");
			System.out.println(e);
		}*/
		
		finally{
			System.out.println("Finally block");
		}
	}
}
