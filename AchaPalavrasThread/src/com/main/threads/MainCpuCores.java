package com.main.threads;

public class MainCpuCores {

    public static void main(String[] args) {
        System.out.println("Started executing main one thread");


        String[] filePaths = {
                "com/main/resources/0.txt",
                "com/main/resources/1.txt"
        };

        WordSearcherThread milkSearcher = new WordSearcherThread("milk",filePaths);


        Thread t1 = new Thread(milkSearcher);
        t1.start();

        Thread t2 = new Thread(milkSearcher);
        t2.start();


        Thread t3 = new Thread(milkSearcher);
        t3.start();

        Thread t4 = new Thread(milkSearcher);
        t4.start();

        System.out.println("finished executing main two threads");
    }
}
