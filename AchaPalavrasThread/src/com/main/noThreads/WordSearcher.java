package com.main.noThreads;

import java.io.*;
import java.util.Locale;

public class WordSearcher {

    protected String expectedWord;


    public WordSearcher(String expectedWord) {
        this.expectedWord = expectedWord;
    }



    public Integer Search(String[] filePaths){

        Integer wordsCount = 0;

        for (String filePath: filePaths) {

            try {

                BufferedReader reader = new BufferedReader(new FileReader(filePath));

                wordsCount+=  getHowManyWordsInBufferedReader(reader);

                reader.close();

            }
            catch (IOException e)
            {
                System.err.println("WordSearcher: Search: 'could not find/read file'.");
            }
        }

        return wordsCount;

    }

    private Integer getHowManyWordsInBufferedReader(BufferedReader reader) throws IOException {

        String currentLine = reader.readLine();
        int count = 0;

        while (currentLine!=null){

            currentLine.toLowerCase(Locale.ROOT);
            String[] words = currentLine.split(" ");

            for (String word: words) {
                if(word.equals(expectedWord)){
                    count++;
                }
            }

            currentLine = reader.readLine();
        }

        return count;
    }


}
