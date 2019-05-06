package quotes;

public class APIQuote {
    public Quote quotes;


    @Override
    public String toString() {
        String output = "";
        output += quotes.author + ": \n";
        output += "- " + quotes.body;

        return output;
    }
}
