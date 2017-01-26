package UteevBkRu;
import java.util.*;

public class Circle extends Figure{
	
	private Point centerPoint = null;
	private double radius = 0;
	
	public Circle(Point center, double r){
		centerPoint = center;
		radius = r;
	}
	public Circle(Point center, Point nextPoint){
		centerPoint = center;
		setRadius(center, nextPoint);		
	}
	
	private void setRadius(Point a, Point b){	
		//TODO check:is it correct? 
		radius = Point.getLength(a, b);
		if(radius == 0){
			System.out.println("radius = 0!");
		}
	}
	
	public double getSquare(){
		return Math.PI*radius*radius;	
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
