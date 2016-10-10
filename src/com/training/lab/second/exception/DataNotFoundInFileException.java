package com.training.lab.second.exception;

/**
 * Created by USER on 02.10.2016.
 */
public class DataNotFoundInFileException extends Exception {
    public DataNotFoundInFileException() {
    }

    public DataNotFoundInFileException(String message) {
        super(message);
    }

    public DataNotFoundInFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataNotFoundInFileException(Throwable cause) {
        super(cause);
    }
}
