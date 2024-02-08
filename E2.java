//init block gets invoked whenever we are calling the constructor
//all the static blocks are executed first whenever class is loaded
//after all the static blocks are executed then only init block is executed if present

class E{
	static int x=786;
	//init block :- starting and ending with curly braces(2nd)
	//init block belongs to instances
	{
		System.out.println("Inside E's init block");
	}
	//constructor(3rd)
	E(){
		System.out.println("Inside E's constructor");
	}
	//main block
	static public void main(String args[]){
		//if "x=123" is written below in place if "int x=123", then the line no. 24,26,27 will print 123
		int x=123;
		E e=new E();
		//(4th)
		System.out.println("Inside main");
		//it will print 123
		System.out.println(x);
		//all prints 786
		System.out.println(e.x);
		System.out.println(E.x);
	}
	//static block(1st)
	//static block belongs to class variables
	static{
		System.out.println("Inside E's static block");
	}
}
