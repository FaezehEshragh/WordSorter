package com.example.calculator;

public class WordValueCalculatorImpl implements WordValueCalculatorInterface
{

    /**
     * Calculates the numeric value of the input word (A=1, Z=26)
     *
     * @param word - the input word
     * @return int - the calculated value
     */
    public int calculateValue(String word)
    {
        int value = 0;
        if (word != null)
        {
            for (char c : word.toCharArray())
            {
                value += Character.toUpperCase(c) - 'A' + 1;
            }
        }
        return value;
    }
}
