class father1{
	int balance=123;
	public father1(int balance){
		//prints 123
		//balance=balance;
		//print 456
		int x=balance=balance;
		System.out.println(x);
		//all prints 456
		/*this.balance=balance;
		System.out.println(balance);
		System.out.println(this.balance);*/
		//prints 456,123
		balance=balance;
		System.out.println(balance);
		System.out.println(this.balance);
	}
	public static void main(String args[]){
		father1 f=new father1(456);
		System.out.println(f.balance);
	}
}
