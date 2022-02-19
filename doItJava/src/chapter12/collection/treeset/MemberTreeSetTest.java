package chapter12.collection.treeset;

import chapter12.collection.Member;
import chapter12.collection.hashset.MemberHashSet;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberHashSet = new MemberTreeSet();

        Member park = new Member(1003, "박서휜");
        Member lee = new Member(1001, "이지원");
        Member son = new Member(1002, "손민국");

        memberHashSet.addMember(lee);
        memberHashSet.addMember(son);
        memberHashSet.addMember(park);
        memberHashSet.showAllMember();

        Member hong = new Member(1003, "홍길동");
        memberHashSet.addMember(hong);
        memberHashSet.showAllMember();
    }
}
