package chapter9.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        // Computer c1 = new Computer();
        Computer c2 = new DestTop();
        // Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook();

        // Computer 와 MyNoteBook 은 추상 클래스이므로 인스턴스화가 불가능하다.

    }

}
