class College
{
	College()
	{
		System.out.println("College construcctor");
	}
}
class SGGS extends College
{
	//SGGS()
	SGGS(int x)
	{
		System.out.println("Sggs construcctor");
	}
	//public static void main(String args[])
	static public void main(String args[])
	{
		//SGGS sggs=new SGGS();
		SGGS sggs=new SGGS(5);
	}
}

