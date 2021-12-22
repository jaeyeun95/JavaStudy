package threadex;

import java.nio.Buffer;

public class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer){
        this.buffer = buffer;
    }

    public void run(){
        for(int i= 0; i < 10; i++){
            // 생산자 쓰레드는 put() 메서드를 호출한다.
            // buffer.put(i);
            try {
                sleep( (int)Math.random() * 100);
            } catch (InterruptedException e) {
            }
        }
    }
    
}
