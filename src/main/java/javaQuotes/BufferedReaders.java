package javaQuotes;

import java.io.*;
import java.net.HttpURLConnection;

public class BufferedReaders {

    // Generates a reader for quotes from an API
    public static BufferedReader getBufferedReader(HttpURLConnection connection) throws IOException {
        InputStream inputStream = connection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        return reader;
    }

    //Generates a reader for quotes found locally
    public static BufferedReader localGetBufferedReader(String path) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        return reader;
    }

    public static String dataFromBufferedReader(BufferedReader reader) throws IOException {
        StringBuilder builder = new StringBuilder();
        String currentLine = reader.readLine();
        while (currentLine != null) {
            builder.append(currentLine);
            currentLine = reader.readLine();
        }
        return builder.toString();
    }
}
