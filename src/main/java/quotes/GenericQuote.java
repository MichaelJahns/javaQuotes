package quotes;

public class GenericQuote {
    public APIQuote apiQuote;
    public JsonQuote jsonQuote;

    @Override
    public String toString() {
        String output = "";

        if (apiQuote != null) {
            output += apiQuote.quotes.author + ": \n";
            output += "- " + apiQuote.quotes.body;
        } else if (jsonQuote != null) {
            output += jsonQuote.author + ": \n";
            output += "- " + jsonQuote.text;
        }

        return output;
    }
}
