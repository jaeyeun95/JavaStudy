package chapter10.interfaceex;

public interface Buy {
    void buy();
    
    default void order(){
        System.out.println("판매 주문");
    }
}
