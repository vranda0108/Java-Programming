class O{
	String sggs;
	O(String sggs){
		this.sggs=sggs;
	}
	class department{
		String it;
		department(String it){
			this.it=it;
		}
	}
	public static void main(String args[]){
		O o=new O("O");
		System.out.println(o.sggs);
		System.out.println(o);
		department d=o.new department("It");
		System.out.println(d);
	}
}
