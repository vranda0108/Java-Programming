class father{
	int balance;
	static String surname="baheti";
	//public father() can also be written
	/*father(){
		System.out.println(balance);
	}*/
	public father(){
		//this(23);
		balance=567;
		String surname="biyani";
		System.out.println(balance);
		System.out.println(surname);
		System.out.println("constructor");
	}
	static public void main(String args[]){
	//here new operator calls or invokes the constructor
		father f=new father();
		System.out.println(f);
		//prints 567
		System.out.println(f.balance);
		System.out.println(surname);
		father f1=new father();
		System.out.println(f1);
	}
}
