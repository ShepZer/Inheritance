package Lab_3.Exception;

public class MyException extends RuntimeException{
	public MyException (String m){
		super(m); //вызов конструктора RuntimeException
	}
}