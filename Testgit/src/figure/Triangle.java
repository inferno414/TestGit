package figure;

public class Triangle implements IFigure {
	private Point PS[] = new Point[3];
	public Triangle(Point A, Point B, Point C){
		PS[0] = A;
		PS[1] = B;
		PS[2] = C;
	}
	public double GetArea(){
		return ((PS[0].getX()-PS[2].getX())*(PS[1].getY()-PS[2].getY())-(PS[1].getX()-PS[2].getX())*(PS[0].getY()-PS[2].getY()))/2;
	}
	@Override
	public String GetName() {
		return "Triangle";
	}
}
