package figure;

public class Point {
	private double x,y;
	public Point(){
		this(0,0);
	}
	public Point(double X, double Y){
		x = X;
		y = Y;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
}
