class J{
	static int x=786;
	int y=2024;
	{
		System.out.println("Inside J init block="+this);
	}
	J(){
		System.out.println("Inside J constructor:J()::"+this);
	}
	public static void main(String args[]){
		System.out.println("Inside main");
		J j=new J();
		System.out.println(j);
		J j1=new J();
		System.out.println(j1);
		//return Y=2024
		System.out.println("Default toString() returns="+j1);
		//returns Y=2024
		System.out.println("Class's toString() returns="+j1.myToString());
		j1.y=2026;
		// prints Y=2026
		System.out.println(j1);
		//prints Y=2024
		System.out.println(j.myToString());
		System.out.println(j1.myToString());
	}
	
	/*
	1.down sentence will print 'HI' inplace of 'this' becoz we have used toString
	  public String toString(){
	
	2.down sentence will print 'address' of object inplace of 'this' becoz we have used toString1 instead of toString
	  public String toString1(){*/
	
	public String toString(){
		//return "HI";
		//now down sentence is printing 2024 inplace of 'this keyword'
		return "Y="+y;
	}
	
	/*this function is printing 'address':- */
	public String myToString(){
		return "Y="+y;
	}
}
