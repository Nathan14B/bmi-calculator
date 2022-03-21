package model.exceptions;

public class NonPositiveValueException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public NonPositiveValueException(String message) {
		super(message);
	}
}