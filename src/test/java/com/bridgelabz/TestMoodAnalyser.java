package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyser {
    @Test
    public void givenMessageShouldAnalyseAndReturnHappyOrSad(){
        MoodAnalyser moodAnalyse = new MoodAnalyser();
        String mood = moodAnalyse.analyseMood("Sad");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessageShouldReturnSad(){
        MoodAnalyser moodAnalyse = new MoodAnalyser();
        String mood = moodAnalyse.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessageShouldReturnHappy(){
        MoodAnalyser moodAnalyse = new MoodAnalyser();
        String mood = moodAnalyse.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY",mood);
    }
}
