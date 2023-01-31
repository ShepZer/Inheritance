package Lab_3.matrixes;
import Lab_3.Exception.*;

public class Matrix{
	
	public int curRow;
	public int curColumn;
	public int[][] matrix;

	public Matrix (int row, int column){

		if(row <= 0 || column <= 0){
			throw new MyException ("Error. Matrix with given dimensions could not be created");
		}
		
		curRow = row;
		curColumn = column;
		matrix = new int [curRow][curColumn];

		for(int i = 0; i < curRow; i++){
			for(int j = 0; j < curColumn; j++){
				matrix[i][j] = 0;
			}
		}
	}

	public Matrix sum (Matrix q){

		Matrix matrix = new Matrix(curRow, curColumn);

		if(this.curColumn == q.curColumn + 1){
			for(int i = 0; i < curRow; i++){
				for(int j = 0; j < curColumn; j++){
					matrix.setElement(i, j, 0);
				}
			}

			if(curRow != q.curRow || curColumn != q.curColumn + 1){
				throw new MyException ("Error. Unable to calculate sum of matrices");
			}		

			for(int i = 0; i < curRow; i++){
				for(int j = 0; j < curColumn; j++){
					int t = q.getElement(i, j) + this.getElement(i, j);
					matrix.setElement(i, j, t);
				}
			}
		}
		else{

			for(int i = 0; i < curRow; i++){
				for(int j = 0; j < curColumn; j++){
					matrix.setElement(i, j, 0);
				}
			}

			if(curRow != q.curRow || curColumn != q.curColumn){
				throw new MyException ("Error. Unable to calculate sum of matrices");
			}		
	
			for(int i = 0; i < curRow; i++){
				for(int j = 0; j < curColumn; j++){
					int t = q.getElement(i, j) + this.getElement(i, j);
					matrix.setElement(i, j, t);
				}
			}
		}
		System.out.println(matrix);
		return matrix;
	}

	public Matrix product (Matrix q){

		if(this.curColumn != q.curRow){
			throw new MyException ("Error. Can't multiply matrices");
		}		

		Matrix matrix = new Matrix(curRow, q.curColumn);

		for(int i = 0; i < curRow; i++){
			for(int j = 0; j < q.curColumn; j++){
				matrix.setElement(i, j, 0);
			}
		}

		for(int i = 0; i < curRow; i++){
			for(int j = 0; j < q.curColumn; j++){
				for(int k = 0; k < curColumn; k++){
					int t = matrix.getElement(i, j) + this.getElement(i, k) * q.getElement(k, j);
					matrix.setElement(i, j, t);
				}
			}
		}

		System.out.println(matrix);
		return matrix;
	}

	public void setElement (int row, int column, int value){

		if (row > curRow || row < 0 || column > curColumn || column < 0){
			throw new MyException ("Error. Dimensions exceed matrix dimensions");
		}
		
		matrix[row][column] = value;
	}
	
	public int getElement (int row, int column){

		if(row > curRow || row < 0 || column > curColumn || column < 0){
			throw new MyException ("Error. Element not found");
		}

		return matrix[row][column];
	}

	public final boolean equals (Matrix m){

		int flag = 0;

		if(curRow == this.curRow && curColumn == this.curColumn){
			for(int i = 0; i < curRow; i++){
				for(int j = 0; j < curColumn; j++){
					if(this.getElement(i, j) != m.getElement(i, j)){
						flag = 1;
					} 
				}
			}
		}
		else{
			flag = 1;
		}

		if(flag == 0) return true;
		else return false;
	}

	public final String toString(){
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < curRow; i++){
			for(int j = 0; j < curColumn; j++){ 
				sb.append(getElement(i, j) + " ");
			}
			sb.append("\n");
		} 

		String text = sb.toString();
		return text;
	}
}
