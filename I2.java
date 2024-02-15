class College{
	static int collegeID=456;
	{
		System.out.println("Inside college init block:"+this);
	}
	/*static{
		System.out.println("Inside college static block:"+collegeID);
	}*/
	College(){
		System.out.println("Inside college constructor block:"+this);
	}
}
class I extends College{
	static int x=765;
	//see what happens if below sentence is there or not
	//if below sentence is not there then it will print 8 lines else it will print 10 lines including college class static block
	static College i=new College();
	int y=12;
	{
		System.out.println("Inside I init block:"+this);
	}
	I(){
		System.out.println("Inside I constructor block::I()::"+this);
	}
	public static void main(String args[]){
		System.out.println("Inside main");
		I i1=new I();
		System.out.println(i1);
	}
	static{
		System.out.println("Inside I static block");
	}
}	
