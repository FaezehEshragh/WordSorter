package main.java.com.example.calculator;

public class ValueCalculatorImpl implements WordValueCalculatorInterface
{
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
