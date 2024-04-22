class ThrowableGetStackTraceExample1 {  
   	public static void main(String[] args) {  
  		try{  
       			int i=10/0;  
   		}
   		catch(Exception e){  
       			StackTraceElement[] trace = e.getStackTrace();  
       			System.out.println(e);
       			System.err.println(trace[0].toString());  
       			System.out.println(trace[0].getClass());  
       			System.out.println(trace[0].getMethodName());  
       			System.out.println(trace[0].getFileName());  
       			System.out.println(trace[0].getLineNumber()); 
       		}
       	}  
} 
