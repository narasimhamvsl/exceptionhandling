package com.exceptionhandling.exception;

public class InsuficientFundsException extends RuntimeException {

	public InsuficientFundsException(String message) {
		super(message);
	}

	public InsuficientFundsException(Throwable cause) {
		super(cause);
	}
}
