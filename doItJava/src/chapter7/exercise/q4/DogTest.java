package chapter7.exercise.q4;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogList = new Dog[5];

        dogList[0] = new Dog("레몬", "말티즈");
        dogList[1] = new Dog("명순이", "핏불");
        dogList[2] = new Dog("진돌이", "진돗개");
        dogList[3] = new Dog("코박이", "말라뮨트");
        dogList[4] = new Dog("명코", "사냥개");

        for (Dog d : dogList) {
            System.out.println(d.showDogInfo());
        }
    }

}
