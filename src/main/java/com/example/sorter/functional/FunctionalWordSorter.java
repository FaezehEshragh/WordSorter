package main.java.com.example.sorter.functional;

import java.util.Comparator;
import java.util.List;

import main.java.com.example.calculator.WordValueCalculatorInterface;
import main.java.com.example.sorter.WordSorter;

public class FunctionalWordSorter implements WordSorter
{
    WordValueCalculatorInterface valueCalculator;

    public FunctionalWordSorter(WordValueCalculatorInterface valueCalculator)
    {
        this.valueCalculator = valueCalculator;
    }

    /**
     * Uses a functional approach to sort the words
     *
     * @param words - List od input words
     * @return List<String> - List of sorted words
     */
    public List<String> sortWords(List<String> words)
    {
        return words.stream()
                    .sorted(Comparator.comparingInt(valueCalculator::calculateValue))
                    .toList();
    }

}
