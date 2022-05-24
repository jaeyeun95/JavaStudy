package stream.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("짱구", 23, "010-1234-5666"));
        personList.add(new Person("유리", 23, "010-1234-5677"));
        personList.add(new Person("철수", 25, "010-1234-5699"));
        personList.add(new Person("맹구", 26, null));

//        Map<String, Person> personMap = (Map<String, Person>) personList.stream()
//                .filter(person -> person.getAge() >= 24)
//                .collect(Collectors.toMap(Person::getName, Function.identity()));
//
//        System.out.println("## : " + personMap.toString());

        // 조건에 일치한 요소 찾기
        Person person = personList.stream()
                .filter(p -> p.getAge() == 23)
                .findFirst().get();
        // findFirst 메서드 대신에 findAny 메서드도 가능하다.
        // 단 일반 스트림에서는 동일한 요소(짱구)가 나오지만 병렬 스트림에서는 매 실행마다 다를 수 있다.
        // 순서에 상관없이 조건에 충족한 요소를 찾고 싶을 때 findAny 메서드가 효과적일 수 있다.

        System.out.println("23세 이상 : " + person.toString());

    }
}
