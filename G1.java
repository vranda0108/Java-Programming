interface printable{
	void print();
	static int show(int x){
		return x*x*x;
	}
}
class showable implements printable{
	public void print(){
		System.out.println("Print!");		
	}
}
class G{
	public static void main(String args[]){
		printable p=new showable();
		System.out.println(printable.show(3));
		p.print();
		//System.out.println(printable.show(3));
	}
}
