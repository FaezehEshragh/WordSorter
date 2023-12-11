package main.java.com.example;

import java.util.List;

import main.java.com.example.calculator.WordValueCalculatorImpl;
import main.java.com.example.calculator.WordValueCalculatorInterface;
import main.java.com.example.sorter.functional.FunctionalWordSorter;
import main.java.com.example.sorter.oop.OOPWordSorter;

public class Main
{
    public static void main(String[] args)
    {
        List<String> wordList = List.of("RunKeeper", "Coding", "Test", "OOP", "FUNCTIONAL", "PROGRAMMING");

        // Initiating the calculator to inject to the sorter classes in the next step
        WordValueCalculatorInterface wordValueCalculator = new WordValueCalculatorImpl();

        // Using OOP to sort the words
        List<String> sortedWordsOOP = new OOPWordSorter(wordValueCalculator).sortWords(wordList);
        System.out.println("Sorted Words (OOP): " + sortedWordsOOP);

        // Using Functional Programming to sort the words
        List<String> sortedWordsFunctional = new FunctionalWordSorter(wordValueCalculator).sortWords(wordList);
        System.out.println("Sorted Words (Functional): " + sortedWordsFunctional);
    }
}