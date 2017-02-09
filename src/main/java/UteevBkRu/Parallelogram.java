package UteevBkRu;

public class Parallelogram extends Figure{
	
	private double sideAB;
	private double sideBC;
	private double sideCD;
	private double sideDA;
	private double square;
	private double hight;
	//    B_________C
	//    /|       /
	//   / |h     /    
	// A/__|_____/D
	//  len
	public Parallelogram(Point A, Point B, Point C, Point D){
		checkFigure( A, B, C, D);
		//TODO like in each class
//		double len = B.getX() - A.getX();		
//		hight = Math.sqrt((sideAB*sideAB) - (len*len));
//		square = hight*sideDA;
	}
	
	public boolean checkFigure(Point A, Point B, Point C, Point D){
		sideAB = Point.getLength(A, B);
		sideBC = Point.getLength(B, C);
		sideCD = Point.getLength(C, D);
		sideDA = Point.getLength(D, A);
		if((sideAB != sideCD) || (sideBC != sideDA)){//TODO  use точность!!!!
			sideAB = 0;sideBC = 0;sideCD = 0;sideDA = 0;
			System.out.println("Error!It isn't a Parallelogram!");
			return false;
		}	
		double len = B.getX() - A.getX();
		hight = Math.sqrt((sideAB*sideAB) - (len*len));
		square = hight*sideDA;
		return true;	
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
