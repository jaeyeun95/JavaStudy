package chapter7.exercise.q5;

import java.util.ArrayList;

import chapter7.exercise.q4.Dog;

public class DogArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogList = new ArrayList<Dog>();

        dogList.add(new Dog("레몬", "말티즈"));
        dogList.add(new Dog("명순이", "핏불"));
        dogList.add(new Dog("진돌이", "진돗개"));
        dogList.add(new Dog("코박이", "말라뮨트"));
        dogList.add(new Dog("명코", "사냥개"));

        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i).showDogInfo());
        }

    }

}
