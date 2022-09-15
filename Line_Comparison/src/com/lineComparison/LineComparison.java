package com.lineComparison;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program ");

		int x1,x2,y1,y2;
		double distance;
		x1=1;y1=1;x2=4;y2=4;
		distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
		System.out.println("distance between = "+"("+x1+","+y1+"),"+"("+x2+","+y2+") "+distance);

		int lengthLine1 = 2;
		int lengthLine2 = 5;		
		int d1 = (int) (lengthLine1);
		int d2 = (int)(lengthLine2);
		if (d1==(d2))
			System.out.println("Line 1 and line 2 have Equal lengths.");
		else
			System.out.println("Line 1 and Line 2 do not have Equal lengths.");
		
		if ((Double.compare(lengthLine1, lengthLine2)) == 0) 
			System.out.println("Length of Line 1 is equal to the length of Line 2.");
			else 
				if ((Double.compare(lengthLine1, lengthLine2)) < 0) 
					System.out.println("Length of Line 1 is less than the length of Line 2.");
				else
					if ((Double.compare(lengthLine1, lengthLine2)) > 0) 
						System.out.println("Length of Line 1 is greater than the length of Line 2.");


		
	}			

}

