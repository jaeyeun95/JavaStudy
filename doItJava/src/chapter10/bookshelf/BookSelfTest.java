package chapter10.bookshelf;

public class BookSelfTest {
    public static void main(String[] args) {
        Queue shelQueue = new BookShelf();
        shelQueue.enQueue("태백산맥 1");
        shelQueue.enQueue("태백산맥 2");
        shelQueue.enQueue("태백산맥 3");

        System.out.println(shelQueue.deQueue());
        System.out.println(shelQueue.deQueue());
        System.out.println(shelQueue.deQueue());
    }
}
