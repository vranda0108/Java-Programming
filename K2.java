class K{
	static int x=786;
	int y=2024;
	
	//init block
	{
		System.out.println("Inside K init block="+this);
	}
	
	//default constructor
	K(){
		System.out.println("Inside K constructor:J()::"+this);
	}
	
	//main method
	public static void main(String args[]){
		System.out.println("Inside main");
		K k=new K();
		System.out.println(k);
		K k1=new K();
		System.out.println(k1);
		//return Y=2024
		System.out.println("Default toString() returns="+k1);
		k1.y=2026;
		//prints Y=2026
		System.out.println(k1);
	}
	
	//functions
	//returns 'class K':-
	/*public String toString(){
		return ""+getClass();
		//return "Y="+y;
	}*/
	
	/*returns only 'K':-
	public String toString(){
		return ""+getClass().getName();
	}*/
	
	/*returns hashCode:-
	public String toString(){
		return ""+getClass().getName()+"@"+hashCode();
	}*/
	
	/*returns hashCode in hexadecimal form:-
	public String toString(){
		return ""+getClass().getName()+"@"+Integer.toHexString(hashCode());
	}*/
}
