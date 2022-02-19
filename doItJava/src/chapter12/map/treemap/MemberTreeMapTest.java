package chapter12.map.treemap;

import chapter12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberHashMap = new MemberTreeMap();

        Member lee = new Member(1001, "이지원");
        Member son = new Member(1002, "손민국");
        Member park = new Member(1003, "박서훤");
        Member hong = new Member(1004, "홍길동");

        memberHashMap.addMember(lee);
        memberHashMap.addMember(son);
        memberHashMap.addMember(park);
        memberHashMap.addMember(hong);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
