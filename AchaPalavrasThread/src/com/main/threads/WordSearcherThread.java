package com.main.threads;


import com.main.noThreads.WordSearcher;

public class WordSearcherThread extends WordSearcher implements Runnable {

    private String[] filePaths;

    public WordSearcherThread(String expectedWord, String[] filePaths) {
        super(expectedWord);
        this.filePaths = filePaths;
    }

    @Override
    public void run() {
       Integer referenceCount = super.Search(filePaths);
       System.out.println("found "+referenceCount+" references for word '"+super.expectedWord+"'");
    }
}
