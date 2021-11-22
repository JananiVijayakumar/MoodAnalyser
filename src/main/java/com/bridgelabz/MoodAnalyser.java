package com.bridgelabz;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = message;
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException{
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (Exception e){
            if (message==null)
                throw new MoodAnalyserException("Invalid Mood", MoodAnalyserException.ExceptionType.NULL);
            else
                throw new MoodAnalyserException("Invalid Mood", MoodAnalyserException.ExceptionType.EMPTY);
        }
    }
}