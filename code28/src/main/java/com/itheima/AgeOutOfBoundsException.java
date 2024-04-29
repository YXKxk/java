package com.itheima;

public class AgeOutOfBoundsException extends  RuntimeException{
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
