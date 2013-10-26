package figure;

public class Rectangle implements IFigure {
	private Point A,B;
	public Rectangle(Point A1, Point B1){
		A = A1;
        B = B1;
	}
	public double GetArea(){
		return (A.getX()+B.getX())*(A.getY()*B.getY());
	}
	@Override
	public String GetName() {
		return "Rectangle";
	}
	
    
}