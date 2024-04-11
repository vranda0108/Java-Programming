import java.io.*;
class j{
	void method() throws IOException{
		System.out.println("throwsblock");
		throw new IOException("Device Error!");
		//ERROR!!!!!!!!!
		//System.out.println("throwsblock");
	}
}
class J{
	public static void main(String args[]){
		try{
			j obj=new j();
			obj.method();
		}
		catch(Exception e){
			System.out.println("Exception handled!");
		}
		System.out.println("Rest code...");
	}
}
