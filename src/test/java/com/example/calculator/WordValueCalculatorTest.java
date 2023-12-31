package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordValueCalculatorTest
{
    WordValueCalculatorInterface wordValueCalculator = new WordValueCalculatorImpl();

    @Test
    public void shouldCalculateWordValueCorrectly()
    {
        assertEquals(1, wordValueCalculator.calculateValue("A"));
        assertEquals(26, wordValueCalculator.calculateValue("Z"));
        assertEquals(27, wordValueCalculator.calculateValue("AZ")); // A=1, Z=26, so AZ=1+26=27
        assertEquals(3, wordValueCalculator.calculateValue("BA")); // B=2, A=1, so BA=2+1=3
    }

    @Test
    public void shouldCalculateWordValueCorrectlyForEmptyString()
    {
        assertEquals(0, wordValueCalculator.calculateValue("")); // Empty string should have a value of 0
    }

    @Test
    public void shouldCalculateWordValueCorrectlyForNullValues()
    {
        assertEquals(0, wordValueCalculator.calculateValue(null)); // Null input should have a value of 0
    }
}
