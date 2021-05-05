package sk.kosickaakademia.stovcikova.thread;

public class MyThread implements Runnable{
    private String threadName;
    private Thread t;
    private  Integer priority;
    @Override
    public void run() {
        System.out.println("Running"+ threadName);

        //telo vlakna
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("thread" + threadName + "value:" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Thread"+threadName+"finish.");

    }

    public MyThread(String threadName, int priority) {
        this.threadName = threadName;
        System.out.println("Creating"+threadName);
    }
    public void start(){
        System.out.println("Starting" + threadName);
        t =new Thread(this,threadName);
        t.start();

    }

}
