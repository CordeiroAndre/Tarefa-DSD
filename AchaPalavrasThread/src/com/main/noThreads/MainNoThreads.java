package com.main.noThreads;

public class MainNoThreads {


    public static void main(String[] args) {

        System.out.println("started executing main");


        String[] filePaths = {
                "com/main/resources/0.txt",
                "com/main/resources/1.txt"
        };

        WordSearcher wordSearcher = new WordSearcher("milk");
        Integer count = wordSearcher.Search(filePaths);

            System.out.println("Found "+count+" References for milk");

        System.out.println("finished executing main with no threads");
    }

}
