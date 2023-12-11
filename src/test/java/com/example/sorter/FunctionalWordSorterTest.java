package test.java.com.example.sorter;

import java.util.Arrays;
import java.util.List;

import main.java.com.example.sorter.WordSorter;
import main.java.com.example.sorter.functional.FunctionalWordSorter;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionalWordSorterTest
{
    static WordSorter wordSorter;

    @BeforeClass
    public static void init()
    {
        wordSorter = new FunctionalWordSorter();
    }

    @Test
    public void testFunctionalWordSort()
    {
        List<String> wordsList = Arrays.asList("Test", "Word", "Sorter", "Functional", "PROGRAMMING");
        List<String> expectedResult = Arrays.asList("Word", "Test", "Sorter", "Functional", "PROGRAMMING");

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
