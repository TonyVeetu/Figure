package UteevBkRu;
import java.util.*;

public class Point {

	private double x = 0;
	private double y = 0;
	private static double len = 0;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public static double getLength(Point a, Point b){
		//TODO check: is it work?
		if(!a.equals(b)){
			double x = a.getX() - b.getX();
			double y = a.getY() - b.getY();
			double prom = x*x + y*y;
			len = Math.sqrt(prom);
		}
		else{
			len = 0;
		}
		return len;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
}
