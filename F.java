class F{
	public static void main(String args[]){
		try{
			try{
				try{
					int i[]=new int[4];
					i[4]=10;
				}
				catch(ArithmeticException e){
					System.out.println("ArithmeticException");
				}
			}
			catch(ArithmeticException e){
				System.out.println("ArithmeticException");
			}
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e){
			System.out.println("Parent Exception");
		}
		System.out.println("rest code...");
	}	
}
