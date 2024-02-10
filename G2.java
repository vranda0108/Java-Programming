class G{
	static int x=786;
	static{
		int x=12;
		System.out.println("static block is executed only once in the beginning when class is loaded");
	}
	//init block
	{
		System.out.println("Inside G's init block");
	}
	//default constructor
	G(){
		//1.x=12;
		System.out.println("Inside G block");
	}
	//parametarized constructor
	G(int x){
		System.out.println("Inside G");
	}
	static public void main(String args[]){
		G g=new G();
		//2.it will print out address of g
		System.out.println(g);
		//1.System.out.println("Inside main");
		g=new G(5);
		//2.it will print out address of g
		System.out.println(g);
		//1.System.out.println("Inside main");
		//1.x=786
		System.out.println(x);
		/*1.the value of x will be 12
		System.out.println(x);
		*/
	}
}
