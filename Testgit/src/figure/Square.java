package figure;

public class Square implements Figure {
	private Point center;
	private double a;
	public Circle(Point P, double A){
		center = P;
        a = A;
	}
	public double GetArea(){
		return a*a;
	}
	
    
}