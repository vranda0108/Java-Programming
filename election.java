interface voter{
	void castvote();
}
/*interface EC{
	void checkvalidity(int age) throws invalidvoterexception;
}*/
class ecindia implements voter{
	final int minage;
	ecindia(int minage){
		this.minage=minage;
	}
	public void castevote(){
		int arr[]={1,2,3};
		try{
			System.out.println("in castvote::ECindia"+arr[3]);
		}
		catch(Exception e){
			System.out.println(e);
			for(StackTraceElement element:e.getStackTrace()){
				System.out.println(element);
				System.out.println(element.getStackTrace()+"."+element.getMethodName()+"("+element.getFileName()+"."+element.getLineNumber()+")");
			}
		}
	}
	public static void main(String args[]){
		ecindia v=new ecindia(12);
		v.castevote();
	}
}
