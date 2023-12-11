package main.java.com.example;

import java.util.List;

import main.java.com.example.oop.OOPWordSorter;

public class Main
{
    public static void main(String[] args)
    {
        List<String> wordList = List.of("RunKeeper", "Coding", "Test", "OOP", "FUNCTIONAL", "PROGRAMMING");

        // Using OOP
        List<String> sortedWordsOOP = new OOPWordSorter().sortWords(wordList);
        System.out.println("Sorted Words (OOP): " + sortedWordsOOP);

    }
}