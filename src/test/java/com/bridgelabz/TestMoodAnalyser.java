package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyser {
    @Test
    public void givenMessageShouldAnalyseAndReturnHappyOrSad(){
        MoodAnalyser moodAnalyse = new MoodAnalyser(null);
        String mood = moodAnalyse.analyseMood("Sad");
        Assert.assertEquals("SAD",mood);
    }
}
