package com.training.lab.second.exception;

/**
 * Created by USER on 07.10.2016.
 */
public class WrongDataException extends Exception {
    public WrongDataException() {
    }

    public WrongDataException(String message) {
        super(message);
    }

    public WrongDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongDataException(Throwable cause) {
        super(cause);
    }
}
