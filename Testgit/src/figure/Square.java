package figure;

public class Square implements IFigure {
	private Point center;
	private double a;
	public Square(Point P, double A){
		center = P;
        a = A;
	}
	public double GetArea(){
		return a*a;
	}
	
    
}