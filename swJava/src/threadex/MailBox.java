package threadex;

public class MailBox {
    private String message;
    private boolean request;

    public synchronized void storeMessage(String message){
        while (request){
            try {
                wait(); // synchronized lock 을 해제
            } catch (InterruptedException e) {
            }
        }
        request = true;
        this.message = message;
        notify();
    }

    public synchronized String retrieveMessage(){
        while(!request){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        return "";
    }
    
}
