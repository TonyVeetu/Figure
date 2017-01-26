package UteevBkRu;

public class Rhomb extends Figure{
	
	private double prec = 1.0e-4;
	public Rhomb(Point a, Point b, Point c, Point d){
		isRhomb(a, b, c, d);
	}
	
	private boolean isRhomb(Point a, Point b, Point c, Point d){
		double side1 = Point.getLength(a, b);
		double side2 = Point.getLength(b, c);
		double side3 = Point.getLength(c, d);
		double side4 = Point.getLength(d, a);
		//TODO check: is it work?
		double rezult = ((side1 - side2) + (side3 - side4));
		if( rezult < prec){
			System.out.println(rezult + " YES");
			return true;
		}
		else{
			System.out.println(rezult + "NO");
			return false;
		}
	}
	
	public double getSquare(){
		return 1;
	}
	
	public double getPerimeter(){
		return 1;
	}
	
	public double getHeight(){
		return 1;
	}
	
	public double getLengthEdge(){
		return 1;
	}
	
	public double getRadius(){
		return 1;
	}
	
	public double getDiameter(){
		return 1;
	}
	
	public double getMedian(){
		return 1;
	}
	
	public double getBisectrix(){
		return 1;
	}
}
