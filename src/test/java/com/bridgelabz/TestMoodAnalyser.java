package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyser {
    @Test
    public void givenSadMessageShouldReturnSad(){
        MoodAnalyser moodAnalyse = new MoodAnalyser("I am in Sad mood");
        String mood = moodAnalyse.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenHappyMessageShouldReturnSad(){
        MoodAnalyser moodAnalyse = new MoodAnalyser("I am in Happy mood");
        String mood = moodAnalyse.analyseMood();
        Assert.assertEquals("SAD",mood);
    }
}
