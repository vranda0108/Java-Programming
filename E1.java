interface printable{
	void print();
}
interface showable extends printable{
	void show();
}
class E implements showable{
	public void print(){
		System.out.println("Print!");
	}
	public void show(){
		System.out.println("Show!");
	}
	public static void main(String args[]){
		E e=new E();
		e.print();
		e.show();
	}
}
