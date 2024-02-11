class H{
	static int x=45;
	int y=2024;
	H(){
		x=12;
		//this keyword gives the address of class if fxn toString() is not present orelse toString() fxn is implemented
		System.out.println("Inside H() constructor::"+this);
	}
	H(int x){
		System.out.println("Inside H(int x) constructor::"+this);
	}
	static public void main(String args[]){
		H h=new H();
		System.out.println("Inside main");
		h=new H();
		/*H hh=new H(5);
		System.out.println(h);
		System.out.println(hh);*/
		System.out.println(x);
		System.out.println(h.x);
		System.out.println(H.x);
		System.out.println(h.y);
	}
	/*public String toString(){
		return "HI";
	}*/
}
