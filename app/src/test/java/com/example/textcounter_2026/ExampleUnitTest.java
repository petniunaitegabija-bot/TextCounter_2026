package com.example.textcounter_2026;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private final TextCounter counter = new TextCounter();

    @Test
    public void countWordsEmptyString() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = counter.countWords(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countWordsNull() {
        String givenString = null;
        int expectedValue = 0;
        int actualValue = counter.countWords(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countWordsHappyPath() {
        String givenString = "Krenta lapai";
        int expectedValue = 2;
        int actualValue = counter.countWords(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countWordsSpacesOnly() {
        String givenString = "   ";
        int expectedValue = 0;
        int actualValue = counter.countWords(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countPunctuationEmptyString() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = counter.countPunctuation(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countPunctuationHappyPath() {
        String givenString = "Kaip sekasi?!";
        int expectedValue = 2;
        int actualValue = counter.countPunctuation(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countPunctuationSpacesOnly() {
        String givenString = "   ";
        int expectedValue = 0;
        int actualValue = counter.countPunctuation(givenString);
        assertEquals(expectedValue, actualValue);
    }
}