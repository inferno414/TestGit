package figure;

public class Square implements IFigure {
	private Point k4sh4;
	private double a;
	public Square(Point P, double A){
		k4sh4 = P;
        a = A;
	}
	public double GetArea(){
		return a*a;
	}
	@Override
	public String GetName() {
		return "Square";
	}
	
    
}