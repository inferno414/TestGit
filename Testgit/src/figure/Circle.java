package figure;

public class Circle implements IFigure {
	private Point O;
	private double r;
	public Circle(Point A, double R){
		O = A;
		r = R;
	}
	public double GetArea(){
		return 3.1415*r*r;
	}
	

}
