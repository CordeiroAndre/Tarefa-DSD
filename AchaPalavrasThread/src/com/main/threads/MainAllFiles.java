package com.main.threads;

public class MainAllFiles {


    public static void main(String[] args) {


        for(int i = 0; i<250; i++){
            String[] filepath = {"com/main/resources/"+i+".txt"};

            WordSearcherThread wordSearcherThread = new WordSearcherThread("milk", filepath);
            Thread t1 = new Thread(wordSearcherThread);
            t1.start();

        }
    }

}
