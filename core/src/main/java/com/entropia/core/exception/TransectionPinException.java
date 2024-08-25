package com.entropia.core.exception;

public class TransectionPinException extends Exception {

    private String code;

    public TransectionPinException(String message, String code) {
        super(message);
        this.code = code;
    }
}
