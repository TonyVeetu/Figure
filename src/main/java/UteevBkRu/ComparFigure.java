package UteevBkRu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparFigure implements Comparable<Figure>{
	Figure fig;
	double prec = 1.10e-4;
	
	public ComparFigure(Figure fig){
		this.fig = fig;
	}
	//TODO think: am i need to create Figure fig?
	public int compareTo(Figure fig2){
		double sq1 = fig.getSquare();
		double sq2 = fig2.getSquare();
		if( Math.abs(sq1 - sq2) < prec ){
			return 0;
		}
		return (sq1 > sq2) ? 1: -1;
	}	
	
	public static void main(String args[]){		
		ArrayList<Figure> mas = new ArrayList<Figure>();
		mas.add(new Circle(new Point (0, 0), new Point(0,2)));				
		mas.add(new Parallelogram(new Point(0,0),new Point(1,2),new Point(4,2),new Point(3,0) ) );				
		mas.add( new Rhomb(new Point(0,0),new Point(0,1),new Point(1,1),new Point(1,0)) );		
		mas.add( new Trapezium(new Point(0,0),new Point(2,3),new Point(4,3),new Point(4,0)) );
		mas.add( new Triangle(new Point(0,0),new Point(4,4),new Point(4,0)) );
		
		//TODO зачем я это делал???? =))
//		ComparFigure comp = new ComparFigure(mas[0]);
//		int a = comp.compareTo(mas[1]);		
//		System.out.print(a);	
		
		Collections.sort(mas);
		for(Figure i : mas){
			System.out.print("Square = " + i.getSquare() + "; ");
		}
		
//******_____This work!!____********		
//		Figure[] cirk = new Figure[5];
//		cirk[0] = new Circle(new Point (0, 0), 3);
//		cirk[1] = new Circle(new Point (0, 0), 2);
//		cirk[2] = new Circle(new Point (0, 0), 7);
//		cirk[3] = new Circle(new Point (0, 0), 0.5);
//		cirk[4] = new Trapezium(new Point(0,0),new Point(2,3),new Point(4,3),new Point(4,0));		
//		Arrays.sort(cirk);		
//		for(Figure i : cirk){
//			System.out.print("Square = " + i.getSquare() + "; ");
//		}
	}	
}
