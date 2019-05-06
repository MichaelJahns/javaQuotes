package javaQuotes;

public class HelperFunctions {
    public static GenericQuote randomQuote(double random, GenericQuote[] quotes) {
        int randomIndex = (int) (random * quotes.length);
        GenericQuote output = quotes[randomIndex];
        return output;
    }
}
