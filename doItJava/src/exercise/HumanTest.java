package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HumanTest {
    public static void main(String[] args) {
        int idx= 0;
        Human kim = new Human(++idx , "김유신", "010-1234-5679");
        Human hong = new Human(++idx , "홍길동", "010-1234-5678");

        List<Human> humanList = new ArrayList<>();
        humanList.add(kim);
        humanList.add(hong);

        Map<Object, Object> collect = humanList.stream()
                .collect(Collectors.toMap(Human::getIdx,Human::getName));

        System.out.println("collect : " + collect);

    }
}
