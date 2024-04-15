class College{
	String collegename;
	College(String collegename){
		this.collegename=collegename;
	}
}
class TechUni extends College{
	String techuniname;
	TechUni(String techuniname){
		super(techuniname);
		this.techuniname=techuniname;
	}
	public static void main(String args[]){
		TechUni TU=new TechUni("Sggs TechUni");
		System.out.println("Default toString returns="+TU);
	}
}
