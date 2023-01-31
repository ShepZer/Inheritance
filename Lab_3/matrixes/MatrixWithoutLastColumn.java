package Lab_3.matrixes;
import Lab_3.Exception.*;

public class MatrixWithoutLastColumn extends Matrix{

	public MatrixWithoutLastColumn (int row, int column){
		super(row, column - 1);
		
		this.curColumn = column;

		if(row <= 0 || column <= 0){
			throw new MyException ("Error. Matrix with given dimensions could not be created");
		}
	}

	public void setElement (int row, int column, int value){

		if (row > curRow || row < 0 || column > curColumn || column < 0){
			throw new MyException ("Error. Dimensions exceed matrix dimensions");
		}

		matrix[row][column] = value;
	}

	public int getElement (int row, int column){

		if(column == curColumn - 1){
			int sum = 0;
			for(int j = 0; j < column; j++){ 
				sum = sum + matrix[row][j];
			}
			return sum;
		}
		else{
			if(column > curColumn){throw new MyException ("Error. Element not found");}
			else{return matrix[row][column];}
		}
	}
}