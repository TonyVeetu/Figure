package UteevBkRu;

public class Rhomb extends Figure{
	
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	private double diagonal1;
	private double diagonal2;
	private double square;

	private double prec = 1.0e-4;
	public Rhomb(Point a, Point b, Point c, Point d){
		//TODO if( !checkFigure(a, b, c, d) ) {
		if( checkFigure(a, b, c, d) ) {
			diagonal1 = Point.getLength(a, c);
			diagonal2 = Point.getLength(b, d);
			square = (diagonal1*diagonal2)/2;
		}		
	}
	
	private boolean checkFigure(Point a, Point b, Point c, Point d){
		side1 = Point.getLength(a, b);
		side2 = Point.getLength(b, c);
		side3 = Point.getLength(c, d);
		side4 = Point.getLength(d, a);
		
		//TODO check: is it work?
		double rezult = ((side1 - side2) + (side3 - side4));
		if( rezult > prec){
			System.out.println(rezult + "NO");
			System.out.println("Error in creation Rhomb");
			side1 = 0; side2 = 0; side3 = 0; side4 = 0;
			return false;
		}
		return true;
	}
	
	public double getSquare(){
		return square;
	}
	
	public double getPerimeter(){
		return -1;
	}
	
	public double getHeight(){
		return -1;
	}
	
	public double getLengthEdge(){
		return -1;
	}
	
	public double getRadius(){
		return -1;
	}
	
	public double getDiameter(){
		return -1;
	}
	
	public double getMedian(){
		return -1;
	}
	
	public double getBisectrix(){
		return -1;
	}
}
