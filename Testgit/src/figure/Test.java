package figure;

public class Test {

	public static void main(String[] args) {
		Figure arr[] = new Figure[2];
		arr[0] = new Triangle(new Point(1.4,1.), new Point(20.4,3.6),new Point(7.5,30.6));
		arr[1] = new Circle(new Point(3.,3.),10);
		for(int i=0; i<2;i++) {
			System.out.println("Area "+ i + " = " + arr[i].GetArea());
		}
		
	}
}

