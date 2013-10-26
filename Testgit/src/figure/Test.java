package figure;

public class Test {
//штанов=киска
	public static void main(String[] args) {
		IFigure arr[] = new IFigure[3];
		arr[0] = new Triangle(new Point(1.4,1.), new Point(20.4,3.6),new Point(7.5,30.6));
		arr[1] = new Circle(new Point(3.,3.),10);
		arr[2] = new Rectangle(new Point(1.,2.),new Point(12,4));
		for(int i=0; i<3;i++) {
			System.out.println("Area "+ arr[i].GetName() + " = " + arr[i].GetArea());
		}
		
	}
}
//х*й п***а пошли все на**й
