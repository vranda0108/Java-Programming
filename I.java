class UserDefinedException extends Exception{
	public UserDefinedException(String str){
		super(str);
	}
}
class I{
	public static void main(String args[]){
		try{
			throw new UserDefinedException("This is UserDefinedException!");
		}
		catch(UserDefinedException e){
			System.out.println("UserDefinedException catch block");
			System.out.println(e.getMessage());
		}
	}
}
