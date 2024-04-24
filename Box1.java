class Box1 {
double width;
double height;
double depth;
Box1(double width, double heigth, double depth) {
this.width = width;
this.height = heigth;
this.depth = depth;
}
// compute and return volume
double volume() {
return width * height * depth;
}
}
class BoxDemo7 {
public static void main(String args[]) {
// declare, allocate, and initialize Box objects
Box1 mybox1 = new Box1(10, 20, 15);
Box1 mybox2 = new Box1(3, 6, 9);
double vol;
// get volume of first box
vol = mybox1.volume();
System.out.println("Volume is " + vol);
// get volume of second box
vol = mybox2.volume();
System.out.println("Volume is " + vol);
}
}
