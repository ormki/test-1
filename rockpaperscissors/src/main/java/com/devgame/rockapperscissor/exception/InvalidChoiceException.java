package com.devgame.rockapperscissor.exception;

public class InvalidChoiceException extends Exception {

    /**
     Constructor that accepts a custom message
     **/
    public InvalidChoiceException(String message) {
        super(message);
    }

    /**
     * Constructor that accepts a custom message and a cause
     * @param message
     * @param cause
     */
    public InvalidChoiceException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor that accepts a cause
     * @param cause
     */
    public InvalidChoiceException(Throwable cause) {
        super(cause);
    }
}