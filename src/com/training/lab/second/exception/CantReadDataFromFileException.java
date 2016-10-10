package com.training.lab.second.exception;

/**
 * Created by USER on 02.10.2016.
 */
public class CantReadDataFromFileException extends Exception {
    public CantReadDataFromFileException() {
    }

    public CantReadDataFromFileException(String message) {
        super(message);
    }

    public CantReadDataFromFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public CantReadDataFromFileException(Throwable cause) {
        super(cause);
    }
}
