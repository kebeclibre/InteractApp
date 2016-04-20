package model.exceptions;

public class BadDateFormatException extends Exception {
	public BadDateFormatException() {
		super();
	}
	
	
	public BadDateFormatException(String mess) {
		super(mess);
	}
	
	public BadDateFormatException(Throwable cause) {
		super(cause);
	}
	
	public BadDateFormatException(String mess, Throwable cause) {
		super(mess,cause);
	}
	
}
