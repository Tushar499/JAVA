package com.mycompany.threadexample;

class ThreadJob implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()
                    + ":" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class ThreadExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadJob());
        Thread t2 = new Thread(new ThreadJob());
        Thread t3 = new Thread(new ThreadJob());
// Start the thread
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main completed");
    }
}
