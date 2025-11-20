package edu.aston.userservice.service;

public class UserServiceException extends RuntimeException {
    public UserServiceException(final String message) {
        super(message);
    }

    public UserServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
