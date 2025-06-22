package ThucHanh1_Runnable;

import ThucHanh1_Runnable.RunnableDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("ThucHanh1_Runnable.Main thread running...");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-DataBase");
        runnableDemo1.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();
        System.out.println("ThucHanh1_Runnable.Main thread stopped !!");



    }
}
