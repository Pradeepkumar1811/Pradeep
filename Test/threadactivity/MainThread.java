package com.threadactivity;
import java.util.ArrayList;

class ListLoader {
    private ArrayList<Integer> list;
    public void loadList(Integer startNumber, Integer lastNumber) {
        list = new ArrayList<>();
        for (int i = startNumber; i <= lastNumber; i++) {
            list.add(i);
        }
    }

    public ArrayList<Integer> getList() {
        return list;
    }
}

class LoaderThread implements Runnable {
    private Integer startNumber;
    private Integer lastNumber;

    public LoaderThread(Integer startNumber, Integer lastNumber) {
        this.startNumber = startNumber;
        this.lastNumber = lastNumber;
    }

    @Override
    public void run() {
        ListLoader listLoader = new ListLoader();
        listLoader.loadList(startNumber, lastNumber);
    }
}

public class MainThread {
    public static void main(String[] args) {
        // Problem Statement 1
        long startTime = System.currentTimeMillis();
        ListLoader listLoader = new ListLoader();
        listLoader.loadList(0, 1000000);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for single-threaded execution: " + (endTime - startTime) + " milliseconds");
        long multiThreadedStartTime = System.currentTimeMillis();
        LoaderThread thread1 = new LoaderThread(0, 500000);
        LoaderThread thread2 = new LoaderThread(500001, 1000000);
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long multiThreadedEndTime = System.currentTimeMillis();
        System.out.println("Time taken for multi-threaded execution: " + (multiThreadedEndTime - multiThreadedStartTime) + " milliseconds");
    }
}
