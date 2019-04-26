package javaQuotes;

public class GenericQuote {
    public APIQuote apiQuote;
    public JsonQuote jsonQuote;

    @Override
    public String toString() {
        String output = "";

        if (apiQuote != null) {
            output += apiQuote.quote.author + ": \n";
            output += "- " + apiQuote.quote.body;
        } else if (jsonQuote != null) {
            output += jsonQuote.author + ": \n";
            output += "- " + jsonQuote.text;
        }


        return output;
    }
}
