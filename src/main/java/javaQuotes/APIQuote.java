package javaQuotes;

public class APIQuote {
    public Quote quote;


    @Override
    public String toString() {
        String output = "";
        output += quote.author + ": \n";
        output += "- " + quote.body;

        return output;
    }
}
