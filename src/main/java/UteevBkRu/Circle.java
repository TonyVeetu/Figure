package UteevBkRu;
import java.util.*;

public class Circle extends Figure{
	
	private Point centerPoint = null;
	private double radius = 0;
	private double square;
	double prec = 1.10e-4;
	
	public Circle(Point center, double r){
		centerPoint = center;
		if(r > 0){
			radius = r;
			square = Math.PI*radius*radius;
		}
	}
	public Circle(Point center, Point nextPoint){
		centerPoint = center;
		if( checkFigure(center, nextPoint) ){
			setRadius(center, nextPoint);	
			square = Math.PI*radius*radius;
		}
		else{
			//TODO Что делать в этом случаи????????
			//По идеи не нужно создовать обьект!!
			System.out.println("Error! Radius = 0!");
		}
	}		
	
	public boolean checkFigure(Point a, Point b){
		double rad = Point.getLength(a, b);
		
		if( (Math.abs(rad - 0.0000001) < prec )) {
			System.out.println("Error! Radius = 0!");
			return false;
		}
		return true;
	}
	
	private void setRadius(Point a, Point b){			
		radius = Point.getLength(a, b);
	}
	
	public double getSquare(){
		return square;	
	}

	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getDiameter(){
		return radius*2;
	}
//____???????????????????????????????????____
//____*********************************_____
	public double getHeight(){
		return -1.0;
	}
	
	public double getLengthEdge(){
		return -1.0;
	} 
	public double getMedian(){
		return -1.0;
	}
	
	public double getBisectrix(){
		return -1.0;
	} 
}
