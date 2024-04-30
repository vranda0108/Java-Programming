interface bank{
	float RateOfInterest();
}
class SBI implements bank{
	public float RateOfInterest(){
		return 9.15f;
	}
}
class HDFC implements bank{
	public float RateOfInterest(){
		return 8.77f;
	}
}
class C{
	public static void main(String args[]){
		bank b=new SBI();
		b.RateOfInterest();
		bank bb=new HDFC();
		System.out.println("Rate="+bb.RateOfInterest());
	}
}
