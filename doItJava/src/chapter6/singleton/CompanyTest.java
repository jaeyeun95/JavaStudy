package chapter6.singleton;

public class CompanyTest {
    public static void main(String[] args) {
        Company mCompany1 = Company.getInstance();
        Company mCompany2 = Company.getInstance();
        System.out.println(mCompany1 == mCompany2);
    }

}
