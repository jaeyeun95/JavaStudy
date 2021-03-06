package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member lee = new Member(1001, "이지원");
        Member son = new Member(1002, "손민국");
        Member park = new Member(1003, "박서휜");

        memberHashSet.addMember(lee);
        memberHashSet.addMember(son);
        memberHashSet.addMember(park);
        memberHashSet.showAllMember();

        Member hong = new Member(1003, "홍길동");
        memberHashSet.addMember(hong);
        memberHashSet.showAllMember();
    }
}
