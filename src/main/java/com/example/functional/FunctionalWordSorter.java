package main.java.com.example.functional;

import java.util.Comparator;
import java.util.List;

import main.java.com.example.calculator.ValueCalculatorImpl;
import main.java.com.example.calculator.WordValueCalculatorInterface;

public class FunctionalWordSorter
{
    WordValueCalculatorInterface valueCalculator = new ValueCalculatorImpl();

    public List<String> sortWords(List<String> words)
    {
        return words.stream()
                    .sorted(Comparator.comparingInt(valueCalculator::calculateValue))
                    .toList();
    }


}
