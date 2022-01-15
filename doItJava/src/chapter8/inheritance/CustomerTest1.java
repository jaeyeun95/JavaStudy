package chapter8.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer Lee = new Customer();
        Lee.setCustomerID(10010);
        Lee.setCustomerName("이순신");
        Lee.bonusPoint = 1000;
        System.out.println(Lee.showCustomerInfo());

        VIPCustomer Kim = new VIPCustomer();
        Kim.setCustomerID(10020);
        Kim.setCustomerName("김유신");
        Kim.bonusPoint = 10000;
        System.out.println(Kim.showCustomerInfo());

    }

}
