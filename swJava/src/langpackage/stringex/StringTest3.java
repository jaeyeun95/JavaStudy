package langpackage.stringex;

public class StringTest3 {
    public static void main(String[] args) {
        String company = "Java JDJ";
        // Program 문자열 결합
        System.out.println(company.concat(" Program"));
        // 소문자로 변환
        System.out.println(company.toLowerCase());
        // 대문자로
        System.out.println(company.toUpperCase());
        // 길이 반환
        System.out.println(company.length());
        // "Ja" 로 시작하는지 확인
        System.out.println(company.startsWith("Ja"));
        // "va" 로 끝나는지 확인
        System.out.println(company.endsWith("va"));
        // 문자열의 내용과 "Java idj" 문자열이 동일한지 확인
        System.out.println(company.equals("Java jdj"));
        // 문자열의 내용과 "java jdj" 문자열이 대소문자를 무시했을 때 동일한지 확인
        System.out.println(company.equalsIgnoreCase("java jdj"));
        // 0번 인덱스 문자를 확인
        System.out.println(company.charAt(0));
        // "JDJ" 문자열의 인덱스 위치를 확인함
        System.out.println(company.indexOf("JDJ"));
        // "va" 문자열의 인덱스 위치를 확인함, 검색은 뒤에서부터 진행
        System.out.println(company.lastIndexOf("va"));
        // 0번 인덱스에서 6번 인덱스까지 문자열 잘라냄
        System.out.println(company.substring(0, 7));
        // 'J' 를 'j'로 치환함
        System.out.println(company.replace('J', 'j'));

    }
    
}
