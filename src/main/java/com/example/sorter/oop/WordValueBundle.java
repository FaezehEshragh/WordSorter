package main.java.com.example.sorter.oop;

import main.java.com.example.calculator.WordValueCalculatorImpl;
import main.java.com.example.calculator.WordValueCalculatorInterface;

public class WordValueBundle implements Comparable<WordValueBundle>
{
    private final String word;
    private final int value;
    private WordValueCalculatorInterface valueCalculatorInterface;

    public WordValueBundle(String word)
    {
        this.valueCalculatorInterface = new WordValueCalculatorImpl();
        this.word = word;
        this.value = valueCalculatorInterface.calculateValue(word);
    }

    public String getWord()
    {
        return word;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public int compareTo(WordValueBundle other)
    {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordValueBundle that = (WordValueBundle) o;
        return this.value == that.value;
    }

}
