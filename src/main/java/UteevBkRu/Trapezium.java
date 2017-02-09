package UteevBkRu;

public class Trapezium extends Figure{

	private double sideAB;
	private double sideBC;
	private double sideCD;
	private double sideDA;
	private double hight;
	private double square;
	private double prec = 1.10e-4;
	//**
	//    B______C
	//    /|     \  
	//   / |h     \   
	// A/__|_______\D
	//  len
	// BC || DA
	//*
	public Trapezium(Point a, Point b, Point c, Point d){
		if( checkFigure(a, b, c ,d) ){//TODO check
			double len = b.getX() - a.getX();
			hight = Math.sqrt((sideAB*sideAB) - (len*len));
			square = (sideBC + sideDA)*hight/2;			
		}
	}
	
	public boolean checkFigure(Point a, Point b, Point c, Point d){
		sideAB = Point.getLength(a, b);
		sideBC = Point.getLength(b, c);
		sideCD = Point.getLength(c, d);
		sideDA = Point.getLength(d, a);
		
		double deltY1 = b.getY() - c.getY();
		double deltY2 = a.getY() - d.getY();
		if( (deltY1 >= prec) && (deltY2 >= prec) ){
			double sin1 = deltY1/sideBC;
			double sin2 = deltY2/sideDA;
			if(sin1 != sin2){ // => BC не параллельно DA
				sideAB = 0; sideBC = 0; sideCD = 0; sideDA = 0;
				System.out.println("Erroe in creation of Trapezium!");
			}
		}
		else if( ((deltY1 < prec) && ( deltY2 >= prec)) || ((deltY1 >= prec) && ( deltY2 < prec)) ){
			sideAB = 0; sideBC = 0; sideCD = 0; sideDA = 0;
			System.out.println("Erroe in creation of Trapezium!");
		}
		else{// BC || DA
			//System.out.println("Success in creation of Trapezium!" + "delta1" + deltY1 + "delta2" + deltY2);
		}		
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
