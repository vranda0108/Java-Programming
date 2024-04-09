class H{
	public static void validate(int age){
		if(age<18){
			throw new ArithmeticException("Person is not Eligible!");
		}
		else{
			System.out.println("Person is Eligible!");
		}
	}
	public static void main(String args[]){
		validate(19);
		validate(13);
		System.out.println("rest code...");
	}
}
