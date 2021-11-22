package com.bridgelabz;

public class MoodAnalyser {
    private  String message;
    public MoodAnalyser(String Message){
        this.message=Message;
    }

    public String analyseMood(String message){
        this.message=message;
        return analyseMood();
    }
    public String analyseMood(){
            if(message.contains("Sad"))
                return "SAD";
                return "HAPPY";
    }
    }
