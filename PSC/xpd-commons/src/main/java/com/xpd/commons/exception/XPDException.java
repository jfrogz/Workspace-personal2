package com.xpd.commons.exception;

public class XPDException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public XPDException() {
    }

    public XPDException(String message) {
        super(message);
    }

    public XPDException(String message, Throwable cause) {
        super(message, cause);
    }

    public XPDException(Throwable cause) {
        super(cause);
    }

}
