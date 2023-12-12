package com.example.sorter;

import java.util.Arrays;
import java.util.List;

import com.example.calculator.WordValueCalculatorImpl;
import com.example.calculator.WordValueCalculatorInterface;
import com.example.sorter.oop.OOPWordSorter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OOPWordSorterTest
{
    WordValueCalculatorInterface wordValueCalculator = new WordValueCalculatorImpl();
    WordSorter wordSorter= new OOPWordSorter(wordValueCalculator);

    @Test
    public void testSortWordsOOP()
    {
        List<String> wordsList = Arrays.asList("Test", "Word", "Sorter", "OOP", "PROGRAMMING");
        List<String> expectedResult = Arrays.asList("OOP", "Word", "Test", "Sorter", "PROGRAMMING");

        List<String> actualResult = wordSorter.sortWords(wordsList);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortWordsOOPWithEmptyList()
    {
        List<String> inputWords = Arrays.asList();
        List<String> expectedOutput = Arrays.asList();

        List<String> actualOutput = wordSorter.sortWords(inputWords);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSortWordsOOPWithEmptyWords()
    {
        List<String> inputWords = Arrays.asList("", "", "");
        List<String> expectedOutput = Arrays.asList("", "", "");

        List<String> actualOutput = wordSorter.sortWords(inputWords);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSortWordsOOPWithNullWords()
    {
        List<String> inputWords = Arrays.asList(null, "ABC", "");
        List<String> expectedOutput = Arrays.asList(null, "", "ABC");

        List<String> actualOutput = wordSorter.sortWords(inputWords);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSortWordsOOPWithEqualValueWords()
    {
        List<String> inputWords = Arrays.asList("ABC", "BCA");
        List<String> expectedOutput = Arrays.asList("ABC", "BCA");

        List<String> actualOutput = wordSorter.sortWords(inputWords);

        assertEquals(expectedOutput, actualOutput);
    }

}
