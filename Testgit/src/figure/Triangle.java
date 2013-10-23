package figure;

public class Triangle implements Figure {
	private Point PS[] = new Point[3];
	public Triangle(Point A, Point B, Point C){
		PS[0] = A;
		PS[1] = B;
		PS[2] = C;
	}
	public double GetArea(){
		return ((PS[0].x-PS[2].x)*(PS[1].y-PS[2].y)-(PS[1].x-PS[2].x)*(PS[0].y-PS[2].y))/2;
	}
}
