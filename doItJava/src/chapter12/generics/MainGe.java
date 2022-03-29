package chapter12.generics;

public class MainGe {
    public static void main(String[] args) {
        Man<String> man1 = new Man<>();

        man1.setName("King");
        man1.setBloodtype("A");

        System.out.println(man1.getName());
        System.out.println(man1.getBloodtype());

        Man<Integer> man2 = new Man<>();
        man2.setName(123);
        man2.setBloodtype(99);

        System.out.println(man2.getName());
        System.out.println(man2.getBloodtype());

    }
}
