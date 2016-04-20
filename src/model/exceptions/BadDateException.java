package model.exceptions;

public class BadDateException extends Exception {
	public BadDateException() {
		super();
	}
	
	
	public BadDateException(String mess) {
		super(mess);
	}
	
	public BadDateException(Throwable cause) {
		super(cause);
	}
	
	public BadDateException(String mess, Throwable cause) {
		super(mess,cause);
	}
}
