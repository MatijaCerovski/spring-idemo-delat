package com.matija.web.error;

public class UsernameAlreadyExistException extends RuntimeException {

	
    private static final long serialVersionUID = 88643505533666163L;

    public UsernameAlreadyExistException() {
        super();
    }

    public UsernameAlreadyExistException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public UsernameAlreadyExistException(final String message) {
        super(message);
    }

    public UsernameAlreadyExistException(final Throwable cause) {
        super(cause);
    }
	
}
