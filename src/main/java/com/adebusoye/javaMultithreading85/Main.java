package com.adebusoye.javaMultithreading85;
//multithreading = Process of executing multiple threads simultaneously
//                 Helps maximum utilization of CPU
//                 Threads are independent, they dont affect the execution of other threads.
//                 An exception in one thread will not interrupt other threads.
//                 useful for serving multpile clients, multiplayer games, or other mutually independent tasks

public class Main{

    public static void main(String[] args) throws InterruptedException{

        // Create a subclass of Thread
        MyThread thread1 = new MyThread();
        //or

        //implement Runnable interface and pass instance as an argument to Thread()
       MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
       // thread1.join(3000);//
        thread2.start();





        System.out.println(1/0);
        //thread1.setDaemon(true);
        //thread2.setDaemon(true);
/*
        thread1.start();
        //thread1.join(); //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
        thread2.start();*/

        //System.out.println(1/0);
    }
}

//*****************************************************
class MyThread extends Thread{

    @Override
    public void run() {

        for(int i =10;i>0;i--) {
            System.out.println("Thread #1 : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // System.out.println(1/0);
        }
        System.out.println("Thread #1 is finished :)");
    }
}
//*****************************************************
class MyRunnable implements Runnable{

    @Override
    public void run() {

        for(int i =0;i<10;i++) {
            System.out.println("Thread #2 : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is finished :)");
    }
}