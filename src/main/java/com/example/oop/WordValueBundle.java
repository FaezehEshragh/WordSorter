package main.java.com.example.oop;

public class WordValueBundle implements Comparable<WordValueBundle>
{
    private final String word;
    private final int value;

    public WordValueBundle(String word)
    {
        this.word = word;
        this.value = calculateValue(word);
    }

    public String getWord()
    {
        return word;
    }

    public int getValue()
    {
        return value;
    }

    public static int calculateValue(String word)
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
