package Exceptions;

public class UserException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int errorType;
	
	/**
	 * Constructor for the UserException.  Takes a string and 
	 * add to the super class message
	 * @param message
	 */
	public UserException(String message) {
		super("Aidan exception type : "+message);
		setErrorType(3);
	}

	/**
	 * @return the errorType
	 */
	public int getErrorType() {
		return errorType;
	}

	/**
	 * @param errorType the errorType to set
	 */
	public void setErrorType(int errorType) {
		this.errorType = errorType;
	}
}
