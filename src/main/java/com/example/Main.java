package main.java.com.example;

import java.util.Comparator;
import java.util.List;

import main.java.com.example.oop.OOPWordSorter;
import main.java.com.example.oop.WordValueBundle;

public class Main
{
    public static void main(String[] args)
    {
        List<String> wordList = List.of("RunKeeper", "Coding", "Test", "OOP", "FUNCTIONAL", "PROGRAMMING");

        // Using OOP
        List<String> sortedWordsOOP = new OOPWordSorter().sortWords(wordList);
        System.out.println("Sorted Words (OOP): " + sortedWordsOOP);

        // Using Functional Programming
        List<String> sortedWordsFunctional = wordList.stream()
                                                     .sorted(Comparator.comparingInt(WordValueBundle::calculateValue))
                                                     .toList();
        System.out.println("Sorted Words (Functional): " + sortedWordsFunctional);
    }
}