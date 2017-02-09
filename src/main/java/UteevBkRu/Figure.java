package UteevBkRu;

public abstract class Figure implements Comparable<Figure> {
	
	double prec = 1.10e-4;
	//******__!!!!!___******
	//Math.abs; use this; return 1, 0 and -1!
	//Нужно реализовать интерфейс только в супер классе!!! 
	public int compareTo(Figure fig2 ){
		double sq2 = fig2.getSquare();
		if( Math.abs(this.getSquare() - sq2) < prec){
			return 0;
		}
		return (this.getSquare() > sq2) ? 1 : -1;
	}
	
	public abstract double getSquare(); 
	
	public abstract double getPerimeter(); 
	
	public abstract double getHeight(); 
	
	public abstract double getLengthEdge(); 
	
	public abstract double getRadius(); 
	
	public abstract double getDiameter(); 
	
	public abstract double getMedian(); 
	
	public abstract double getBisectrix(); 
	
}
