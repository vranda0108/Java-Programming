interface printable{
	void print();
}
interface showable{
	void print();
}
class D implements printable,showable{
	public void print(){
		System.out.println("Print!");
	}
	public static void main(String args[]){
		D d=new D();
		d.print();
	}
}
