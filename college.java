class college{
	//String collegename;
	String name;
	college(String collegename){
		//this.collegename=collegename;
		this.name=collegename;
	}
	class department{
		//String departmentname;
		String name;
		department(String departmentname){
			//this.departmentname=departmentname;
			this.name=departmentname;
			System.out.println("Java");
		}
		/*String getDetails(){
			return "CollegeName="+collegename+","+"DepartmentName="+departmentname;
		}*/
		String getDetails(){
			return name+"in\nCollegeName="+college.this.name+"\nDeptname="+name;
		}
	}
	public static void main(String args[]){
		college c=new college("SGGS");
		//System.out.println(c.collegename);
		department d=c.new department("IT");
		System.out.println(d.getDetails());
		//System.out.println(d.departmentname);
		//System.out.println(c.collegename);
		//it print mainclassname$innerclassname@hexcode=college$department@679bd5
		System.out.println(d);
		System.out.println(c);
	}
	/*public String toString(){
		return ""+getClass();
	}
	public String toString(){
		return ""+getClass().getName();
	}
	public String toString(){
		return ""+getClass().getName()+"@"+hashCode();
	}*/
	public String toString(){
		return ""+getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
}
