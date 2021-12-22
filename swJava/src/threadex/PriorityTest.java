package threadex;

class SimpleThread extends Thread{
    private String threadName;

    public SimpleThread(String threadName){
        this.threadName = threadName;
    }

    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(threadName + " : " + i);
        }
        System.out.println("---> " + threadName + " 수행 종료");
    }
}

public class PriorityTest {
    public static void main(String[] args) {
        System.out.println("===> Program Start");
        SimpleThread first = new SimpleThread("First Thread");
        SimpleThread second = new SimpleThread("Second Thread");
        first.setPriority(Thread.MIN_PRIORITY);
        second.setPriority(Thread.MAX_PRIORITY);
        first.start();
        second.start();
        System.out.println("===> Program end");

    }
    
}
