class M{
	static M m=new M();
	static{
		System.out.println("inside static block");
	}
	{
		//M mm = new  M();
		System.out.println("inside init block");
	}
	M(){
		/*
		error: recursive constructor invocation :----
		this();
		*/
		System.out.println("inside constructor block");
	}
	//static M m=new M();
	//M m;
	public static void main(String args[]){
		//M obj=new M();
	}
}
