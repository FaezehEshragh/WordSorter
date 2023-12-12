package com.example;

import java.util.List;

import com.example.calculator.WordValueCalculatorImpl;
import com.example.calculator.WordValueCalculatorInterface;
import com.example.sorter.functional.FunctionalWordSorter;
import com.example.sorter.oop.OOPWordSorter;

public class Main
{

//    Write a small piece of Java code that takes a list of words and sorts it by value (A=1, Z=26)
//    in standard OOP and again using functional programming. Please include the code, the input list, and output of your code.

// Clarifications:
    // What do you mean by word value?
    // How to consider Upper/lower letters (ignorecase)
    //UTF8 (other chars)
    // Default sort
    


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