package chapter11.object;

class Book {
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle){
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return bookTitle + "," + bookNumber;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200,"개미");

        System.out.println(book1);
        System.out.println(book1.toString());

        String str = new String("test");
        System.out.println(str);
        Integer i1 = new Integer(100);
        System.out.println(i1);
    }
}
