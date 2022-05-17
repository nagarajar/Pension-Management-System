package com.cts.authorization.exception;

/**
 * Class to handle Invalid token given by the JWT
 * @author Nagaraja
 *
 */
public class InvalidTokenException extends RuntimeException {

	private static final long serialVersionUID = -3700741193887093791L;

	public InvalidTokenException(String message) {
		super(message);
	}
}
