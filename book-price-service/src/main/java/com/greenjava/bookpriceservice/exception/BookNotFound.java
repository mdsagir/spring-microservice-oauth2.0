package com.greenjava.bookpriceservice.exception;

public class BookNotFound extends RuntimeException {

    public BookNotFound(String message) {
        super(message);
    }
}
