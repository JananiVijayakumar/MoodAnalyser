package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyser {
    @Test
    public void givenNullMoodShouldThrowNullException(){
        MoodAnalyser moodAnalyse = new MoodAnalyser(null);
        try {
            String mood = moodAnalyse.analyseMood();
        }catch (MoodAnalyserException e){
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void givenAnyMessageShouldThrowEmptyException(){
        MoodAnalyser moodAnalyse = new MoodAnalyser("I am in Happy Mood");
        try {
            String mood = moodAnalyse.analyseMood();
        }catch (MoodAnalyserException e){
            Assert.assertEquals(MoodAnalyserException.ExceptionType.EMPTY,e.type);
        }
    }
}
