interface drawing{
	void draw();
}
class circle implements drawing{
	public void draw(){
		System.out.println("Drawing circle");
	}
}
class rectangle implements drawing{
	public void draw(){
		System.out.println("Drawing rectangle");
	}
}
class B{
	public static void main(String args[]){
		drawing d=new circle();
		d.draw();
		drawing dd=new rectangle();
		dd.draw();
	}
}
