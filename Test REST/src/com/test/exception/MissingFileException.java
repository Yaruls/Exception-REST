package com.test.exception;

public class MissingFileException extends Exception {

	public MissingFileException() {
		super("No File found with given name !!");
	}

	public MissingFileException(String string) {
		super(string);
	}

}
