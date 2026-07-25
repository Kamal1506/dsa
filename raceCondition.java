// When multiple threads access and modify shared data at the same time, it can lead to incorrect results — this is called a Race Condition. 
// Synchronization prevents this by ensuring only one thread can execute a critical section of code at a time.

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

class Main{
    public static void main(String args[]) throws InterruptedException{
        Counter c = new Counter();
        Runnable a = () -> {
            for(int i = 0; i<1000; i++){
                c.increment();
            }
        };
        Runnable b = () -> {
            for(int i = 0; i<1000; i++){
                c.increment();
            }
        };
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.print(c.count);
    }
}
