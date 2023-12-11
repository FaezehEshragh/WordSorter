package main.java.com.example.sorter.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.com.example.sorter.WordSorter;

public class OOPWordSorter implements WordSorter
{

    /**
     * Uses an OOP approach to sort the words
     *
     * @param words - List of input words
     * @return List<String> - List of sorted words
     */
    public List<String> sortWords(List<String> words)
    {
        List<WordValueBundle> wordValueList = new ArrayList<>();

        // Wrap each word with its value
        for (String word : words)
        {
            wordValueList.add(new WordValueBundle(word));
        }

        // Sort the word wrappers based on their values
        Collections.sort(wordValueList);

        // Extract the sorted words from the wrappers
        List<String> sortedWords = new ArrayList<>();
        for (WordValueBundle wrapper : wordValueList)
        {
            sortedWords.add(wrapper.getWord());
        }

        return sortedWords;
    }

}