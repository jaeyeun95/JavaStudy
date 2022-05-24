package stream.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("짱구", 23, "010-1234-5666"));
        personList.add(new Person("유리", 24, "010-1234-5677"));
        personList.add(new Person("철수", 25, "010-1234-5699"));
        personList.add(new Person("맹구", 26, null));

        // Function.identity 는 t -> t, 항상 입력된 인자(자신)을 반환한다.
        Map<String, Person> personMap = personList.stream()
                .collect(Collectors.toMap(Person::getName, Function.identity()));

        System.out.println("personMap : " + personMap.toString());


    }
}
