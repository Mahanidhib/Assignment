package com.capgemini.demo.exception;

public class RecordNotFoundException extends RuntimeException {

	public RecordNotFoundException(String message) {
        super(message);
    }

    public RecordNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
