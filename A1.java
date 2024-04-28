interface printable{
	void print();
}
class A implements printable{
	public void print(){
	/*error: print() in A cannot implement print() in printable
	void print(){
	     ^
  	attempting to assign weaker access privileges; was public :----
	void print(){*/
		System.out.println("Hello....Welcome to Interface!");
	}
	public static void main(String args[]){
		A a=new A();
		a.print();
	}
}
