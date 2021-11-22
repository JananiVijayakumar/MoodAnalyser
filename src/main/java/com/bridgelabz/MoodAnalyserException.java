package com.bridgelabz;

public class MoodAnalyserException extends Exception {
    public ExceptionType type;
    public enum ExceptionType {
        NULL, EMPTY;
    }
    public MoodAnalyserException(String message, ExceptionType type){
        super(message);
    }
}
