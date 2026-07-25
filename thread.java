// using thread class
class A extends Thread{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("Hi");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("Hello");
        }
    }
}
// using runnable interface
class C implements Runnable{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("running C..");
            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class D implements Runnable{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("running D..");
            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Main{
    public static void main(String args[]){
        // A obj1 = new A();
        // B obj2 = new B();
        // System.out.println(obj1.getPriority());
        // obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(Thread.MIN_PRIORITY);
        // obj1.start();
        // obj2.start();
        Runnable obj1 = new C();
        Runnable obj2 = new D();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t2.start();
    }
}
