class L{
	static int x=786;
	int y=2024;
	public static void main(String args[]){
		System.out.println("Inside main");
		L l=new L();
		System.out.println("Default toString() returns="+l);
		System.out.println("Class toString() returns="+l.myToString());
	}
	public String myToString(){
		return "MyToString"+getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
}
