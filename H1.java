interface showable{
	void show();
	interface printable{
		void print();
	}
}
class H implements showable.printable{
	public void print(){
		System.out.println("Show!");
	}
	public static void main(String args[]){
		showable.printable sp=new H();
		sp.print();
	}
}
