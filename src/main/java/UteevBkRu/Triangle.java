package UteevBkRu;

public class Triangle extends Figure{

	private double sideAB;
	private double sideBC;
	private double sideCA;
	private double hight;
	private double square;
	private double prec = 1.10e-4;
	
	//Только так! a.getY = c.getY;
	public Triangle(Point a, Point b, Point c){
		//TODO is it work?
		if(checkFigure(a,b,c)){
			hight = b.getY() - a.getY();// TODO hight might be less zero!
			square = (sideCA*hight)/2;
		}
	}
	
	public boolean checkFigure(Point a, Point b, Point c){
		//TODO make equals
		if( !(a.equals(b) ) && !(a.equals(c) ) && !(b.equals(c)) ){
			if( ((a.getY() - c.getY()) < prec) && ((a.getY() - c.getY()) >-prec) ){
				sideAB = Point.getLength(a, b);
				sideBC = Point.getLength(b, c);
				sideCA = Point.getLength(c, a);
				return true;
			}
			else{
				sideAB = 0; sideBC = 0; sideCA = 0;
				System.out.println("Error in creation Triangle!");
				return false;
			}				
		}
		else{
			sideAB = 0; sideBC = 0; sideCA = 0;
			System.out.println("Error in creation Triangle!");
			return false;
		}
		
	}
	
	public double getSquare(){
		return square;
	}
	
	public double getPerimeter(){ 
		return -1.1;
	}

	public double getHeight(){  
		return -1.1;
	}
	
	public double getLengthEdge(){ 
		return -1.1;
	}
	
	public double getRadius(){ 
		return -1.1;
	}
	
	public double getDiameter(){  
		return -1.1;
	}
	
	public double getMedian(){  
		return -1.1;
	}
	
	public double getBisectrix(){  
		return -1.1;
	}
}
