class ExceptionHandling{
	public static void main(String args[]){
		try{
			int a=1;
			int b=10/0;
			try{
				if(a==1)
				a=a/a-a;
				if(a==2){
					int c[]={1};
					c[8]=9;
				}
			}
			finally{
				System.out.println("A");
			}
		}
		catch(Exception e){
			System.out.println("B");
		}
	}
}
