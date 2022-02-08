package chapter11.practice;

class  MyDog{
    String name;
    String type;

    public MyDog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " " + name;
    }
}

public class Q4 {
    public static void main(String[] args) {
        MyDog dog = new MyDog("멍멍이", "진돗개");
        System.out.println(dog);
    }
}
