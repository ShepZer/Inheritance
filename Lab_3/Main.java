package Lab_3;
import Lab_3.matrixes.*;
import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		
		MatrixWithoutLastColumn test1 = new MatrixWithoutLastColumn (3, 3);
		MatrixWithoutLastColumn test2 = new MatrixWithoutLastColumn (3, 3);
		//SquareMatrix sm1 = new SquareMatrix (3);
		//SquareMatrix sm2 = new SquareMatrix (3);
		//Matrix m1 = new Matrix (3, 3);
		//Matrix m2 = new Matrix (3, 3);

		test1.setElement(0, 0, -1);
		test1.setElement(0, 1, -2);
		test1.setElement(1, 0, 4);
		test1.setElement(1, 1, 1);
		/*
		m1.setElement(0, 0, 1);
		m1.setElement(0, 1, 2);
		m1.setElement(1, 0, 1);
		m1.setElement(1, 1, 2);
		m1.setElement(2, 0, 5);
		m1.setElement(2, 1, 1);
		*/
	
		test2.setElement(0, 0, -1);
		test2.setElement(0, 1, 2);
		test2.setElement(1, 0, -4);
		test2.setElement(1, 1, 1);
		test2.setElement(2, 0, -3);
		test2.setElement(2, 1, 2);

		//System.out.println(test.getElement(0, 2));

		System.out.println(test1);
		System.out.println(test2);

		//System.out.println(m1);
		
		test1.sum(test2);

		test1.product(test2);
	
		//System.out.println(m1);
	
		//test.product(m1);
		//test.sum(sm1);

	}
}