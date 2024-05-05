interface printable{
	void print();
	default void show(){
		System.out.println("Draw!");
	}
}
class showable implements printable{
	public void print(){
		System.out.println("Print!");		
	}
}
class F{
	public static void main(String args[]){
		printable p=new showable();
		p.print();
		p.show();
	}
}
